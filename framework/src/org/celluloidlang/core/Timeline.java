package org.celluloidlang.core;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

import javax.swing.Timer;

import org.celluloidlang.announcment.Announcement;
import org.celluloidlang.announcment.AnnouncementListener;
import org.celluloidlang.constraints.defined.Input;
import org.celluloidlang.constraints.defined.Output;
import org.celluloidlang.devices.SwingOutput;
import org.celluloidlang.reactive.ReactiveListener;
import org.celluloidlang.reactive.ReactiveUpdate;

public class Timeline implements AnnouncementListener, ReactiveListener, Input {
	
	public enum Status{
		PLAYING, STOPPED, PAUSED
	}
	
	static final int TIME_GRANULARITY = 100;
	
	private Timer timer;
	private Stack<ConstraintFunction> didExecute;
	private PriorityQueue<ConstraintFunction> willExecute;
	private LinkedList<Input> inputs;
	private HashMap<Input, Boolean> wasPausedInputs;
	private HashMap<String, LinkedList<EventFunction>> announceEvents;
	private HashMap<EveryFunction, ArrayList<Float>> everyFunctionHash;
	private HashMap<EveryFunction, ArrayList<Float>>  everyFunctionHashInitial;
	private LinkedList<EveryFunction> everyFunctionList;
	private Status status;
	private long timeElapsed;
	
	public Timeline() {
		timeElapsed = -1;
		status = Status.STOPPED;
		didExecute = new Stack<ConstraintFunction>();
		willExecute = new PriorityQueue<ConstraintFunction>();
		inputs = new LinkedList<Input>();
		wasPausedInputs = new HashMap<Input, Boolean>();
		announceEvents  = new HashMap<String, LinkedList<EventFunction>>();
		everyFunctionHash = new HashMap<EveryFunction, ArrayList<Float>>();
		everyFunctionHashInitial = new HashMap<EveryFunction, ArrayList<Float>>();
		everyFunctionList = new LinkedList<EveryFunction>();
		ActionListener taskPerformer = new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				timeStep(timeElapsed + TIME_GRANULARITY);
				timeElapsed += TIME_GRANULARITY;
			}
		};
		timer = new Timer(TIME_GRANULARITY, taskPerformer);
	}
	
	public synchronized void play() {
		if (timeElapsed < 0) {
			timeElapsed = 0;
			timer.start();
			status = Status.PLAYING;
		}
		if (isPaused()) {
			Iterator<Input> itr = wasPausedInputs.keySet().iterator();
			while ((itr != null) && itr.hasNext()) {
				itr.next().play();
			}
			timer.start();
			status = Status.PLAYING;
		}
	}
	
	public synchronized void pause() {
		timer.stop();
		status = Status.PAUSED;
		wasPausedInputs.clear();
		for (Input i: inputs) {
			if (i.isPlaying()) {
				wasPausedInputs.put(i, true);
			}
			i.pause();
		}
	}
	
	public synchronized void stop() {
		timer.stop();
		status = Status.STOPPED;
		timeElapsed = -1;
		for (Input i: inputs) {
			i.stop();
		}
		this.resetTimeline();
	}
	
	/**
	 * This adds a ConstraintFunction to the timeline
	 */
	public void addConstraintFunction(ConstraintFunction cf) {
		if (!inputs.contains(cf.getConstraintObject())) {
			inputs.add(cf.getConstraintObject());
		}
		
		willExecute.offer(cf);
	}
	
	private synchronized void resetTimeline() {
		resetStacks();
		resetEvents();
		resetEverys();
	}
	
	/**
	 * Executed each time slice
	 */
	private synchronized void timeStep(long elapsed) {
		if (!isPlaying()) {
			return;
		}
		while ((willExecute.peek() != null) && (willExecute.peek().getTime().getView() <= elapsed)) {
			ConstraintFunction cf = willExecute.poll();
			didExecute.push(cf);
			cf.execute();
		}
		this.evaluateEveryFunctions(elapsed);
	}
	
	private synchronized void resetStacks() {
		while (!didExecute.isEmpty()) {
			willExecute.offer(didExecute.pop());
		}
	}
	
	private synchronized void resetEvents() {
		Iterator<String> itr = announceEvents.keySet().iterator();
		while ((itr != null) && itr.hasNext()) {
			for (EventFunction ef : announceEvents.get(itr.next())) {
				ef.setHasExecuted(false);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	private synchronized void resetEverys() {
		everyFunctionHash = (HashMap<EveryFunction, ArrayList<Float>>) everyFunctionHashInitial.clone();
	}
	
	public LinkedList<Input> getInputs() {
		return inputs;
	}

	/**
	 * Attach this timeline to the output
	 */
	public void attachOutput(Output out) {
		if (out instanceof SwingOutput) {
			((SwingOutput) out).frame.getContentPane().removeAll();
			
			for (Input i : inputs) {
				Component ret = i.getVisualData();
				
				if (ret != null) {
					((SwingOutput) out).frame.getContentPane().add(ret);
				}
			}
			((SwingOutput) out).frame.pack();
			((SwingOutput) out).frame.setVisible(true);
		}
	}

	/**
	 * This is used to add an Event Function to the timeline,
	 * i.e.
	 * when [event] do
	 * 	...
	 * end
	 */
	public void addEventFunction(Input audio1, String type, EventFunction event) {
		audio1.announcer.attach(this);
		
		type=audio1.hashCode() +":" + type;
		System.out.println(type);
		if (!announceEvents.containsKey(type)) {
			announceEvents.put(type, new LinkedList<EventFunction>());
		}
		announceEvents.get(type).add(event);
	}
	
	/**
	 * This is used to add an Every Function to the timeline,
	 * i.e.
	 * every [time] do
	 * 	...
	 * end
	 */
	public void addEveryFunction(EveryFunction every) {
		if (every != null) {
			if (everyFunctionList.contains(every)) {
				everyFunctionHash.get(every).add(every.getExecuteTime().getView());
				everyFunctionHashInitial.get(every).add(every.getExecuteTime().getView());
			} else {
				everyFunctionList.add(every);
				ArrayList<Float> al = new ArrayList<Float>();
				al.add(every.getExecuteTime().getView());
				everyFunctionHash.put(every, al);
				everyFunctionHashInitial.put(every, al);
			}
		}
	}
	
	/**
	 * This is executed every time slice, and evaluates the every functions
	 */
	private void evaluateEveryFunctions(long elapsed) {
		for (EveryFunction ef : everyFunctionList) {
			ArrayList<Float> oldAl = everyFunctionHash.get(ef);
			ArrayList<Float> newAl = new ArrayList<Float>();
			for (Float fl : oldAl) {
				if ((fl < elapsed) && isPlaying()) {
					ef.execute();
					newAl.add(fl + ef.getExecuteTime().getView());
				} else {
					newAl.add(fl);
				}
			}
			everyFunctionHash.remove(ef);
			everyFunctionHash.put(ef, newAl);
		}
	}
	
	@Override
	public synchronized void receiveAnnouncement(Announcement a) {
		String type = a.getOwner().hashCode() + ":" + a.getType();
		LinkedList<EventFunction> constraints = announceEvents.get(type);
		if(constraints!=null){
			for(EventFunction c : constraints){
				if (isPlaying() && (!c.hasExecuted())) {
					c.execute();
					c.setHasExecuted(true);
				}
			}
		}
	}

	@Override
	public void update(ReactiveUpdate e) {
		//reprioritize queue
	}

	@Override
	public Component getVisualData() {
		return null;
	}

	@Override
	public boolean isPlaying() {
		return status == Status.PLAYING;
	}

	@Override
	public boolean isStopped() {
		return status == Status.STOPPED;
	}

	@Override
	public boolean isPaused() {
		return status == Status.PAUSED;
	}
}
