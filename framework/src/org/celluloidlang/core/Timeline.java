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
		INITIALIZED, PLAYING, STOPPED, PAUSED
	}
	
	static final int TIME_GRANULARITY = 100;
	
	private Timer timer;
	private Stack<ConstraintFunction> didExecute;
	private PriorityQueue<ConstraintFunction> willExecute;
	private LinkedList<Input> inputs;
	private LinkedList<Input> wasPausedInputs;
	private HashMap<String, LinkedList<EventFunction>> announceEvents;
	private HashMap<EveryFunction, ArrayList<Float>> everyFunctionHash;
	private HashMap<EveryFunction, ArrayList<Float>>  everyFunctionHashInitial;
	private LinkedList<EveryFunction> everyFunctionList;
	private Status status;
	private long timeElapsed;
	
	/**
	 * Constructor for Timeline
	 */
	public Timeline() {
		timeElapsed = -1;
		status = Status.INITIALIZED;
		didExecute = new Stack<ConstraintFunction>();
		willExecute = new PriorityQueue<ConstraintFunction>();
		inputs = new LinkedList<Input>();
		wasPausedInputs = new LinkedList<Input>();
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
	
	/**
	 * Defined in Input interface, starts execution of the timeline
	 * If the timeline was previously paused, then
	 * tell all Inputs that were previously playing to
	 * play again
	 */
	public synchronized void play() {
		if (timeElapsed < 0) {
			timeElapsed = 0;
			timer.start();
			status = Status.PLAYING;
		}
		if (isPaused()) {
			for (Input i : wasPausedInputs) {
				i.play();
			}
			timer.start();
			status = Status.PLAYING;
			wasPausedInputs.clear();
		}
	}
	
	/**
	 * Pauses execution of the timeline, saving
	 * those Inputs that were playing before pause()
	 * was called.
	 */
	public synchronized void pause() {
		timer.stop();
		status = Status.PAUSED;
		wasPausedInputs.clear();
		for (Input i: inputs) {
			if (i.isPlaying()) {
				wasPausedInputs.add(i);
			}
			i.pause();
		}
	}
	
	/**
	 * Stops execution of the timeline.  Also,
	 * stops execution of its Inputs, and returns
	 * the elapsed time to -1 to indicate a stop().
	 */
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
	
	/**
	 * Resets the necessary elements of a timeline
	 * so that it can be replayed in the exact same manner.
	 */
	private synchronized void resetTimeline() {
		resetStacks();
		resetEvents();
		resetEverys();
	}
	
	/**
	 * Executed each time slice, executes the actions of those
	 * ConstraintFunctions that need execution.
	 * @param elapsed the current playback time
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
	
	/**
	 * Resets the ConstraintFunction priority queue
	 */
	private synchronized void resetStacks() {
		while (!didExecute.isEmpty()) {
			willExecute.offer(didExecute.pop());
		}
	}
	
	/**
	 * Resets the events for this timeline so that they can be
	 * executed again.
	 */
	private synchronized void resetEvents() {
		Iterator<String> itr = announceEvents.keySet().iterator();
		while ((itr != null) && itr.hasNext()) {
			for (EventFunction ef : announceEvents.get(itr.next())) {
				ef.setHasExecuted(false);
			}
		}
	}
	
	/**
	 * Resets the every statements so that they will excute when play()
	 * is called again
	 */
	@SuppressWarnings("unchecked")
	private synchronized void resetEverys() {
		everyFunctionHash = (HashMap<EveryFunction, ArrayList<Float>>) everyFunctionHashInitial.clone();
	}
	
	/**
	 * Returns the LinkedList of Inputs for this Timeline
	 * @return LinkedList<Input>
	 */
	public LinkedList<Input> getInputs() {
		return inputs;
	}

	/**
	 * Attach this timeline to the given output, and remove
	 * anything already playing on the output
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
	 * @param input the input to listen for events from
	 * @param type the String representing the desired attribute
	 * @param event the action to execute, encapsulated in an EventFunction
	 */
	public void addEventFunction(Input input, String type, EventFunction event) {
		input.announcer.attach(this);
		
		type=input.hashCode() +":" + type;
	
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
	 * @param every the EveryFunction to be added to the Timeline
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
	 * @param elapsed the playback time for this Timeline
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
	
	/**
	 * This receives the events generated from the listened for
	 * devices.  If the correct event is broadcast, then execute
	 * the required action(s)
	 * @param the message from the announcer containing the requisite information
	 */
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

	/**
	 * Update the queue when some ReactiveObject reacts.
	 */
	@Override
	public void update(ReactiveUpdate e) {
		//reprioritize queue
	}

	/**
	 * Gets the visual component for this Timeline, which is null because
	 * Timelines do not have visual components.
	 * @return null is this case
	 */
	@Override
	public Component getVisualData() {
		return null;
	}

	/**
	 * Gets whether this Timeline is playing or not.
	 */
	@Override
	public boolean isPlaying() {
		return status == Status.PLAYING;
	}

	/**
	 * Gets whether this Timeline is stopped or not.
	 */
	@Override
	public boolean isStopped() {
		return status == Status.STOPPED;
	}

	/**
	 * Gets whether this Timeline is paused or not.
	 */
	@Override
	public boolean isPaused() {
		return status == Status.PAUSED;
	}
}
