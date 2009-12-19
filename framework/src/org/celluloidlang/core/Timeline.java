package org.celluloidlang.core;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
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

/*
 * synchronized?
 */

public class Timeline implements AnnouncementListener, ReactiveListener, Input {
	
	static final int TIME_GRANULARITY = 100;
	
	private Timer timer;
	private long initialTime = -1;
	private Stack<ConstraintFunction> didExecute;
	private PriorityQueue<ConstraintFunction> willExecute;
	private LinkedList<Input> inputs;
	private HashMap<String, LinkedList<EventFunction>> announceEvents;
	private HashMap<EveryFunction, Float> everyFunctionHash;
	private LinkedList<EveryFunction> everyFunctionList;
	private String status; //can be "initialized", "playing", and "stopped"
	
	public Timeline() {
		status = "initialized";
		didExecute = new Stack<ConstraintFunction>();
		willExecute = new PriorityQueue<ConstraintFunction>();
		inputs = new LinkedList<Input>();
		announceEvents  = new HashMap<String, LinkedList<EventFunction>>();
		everyFunctionHash = new HashMap<EveryFunction, Float>();
		everyFunctionList = new LinkedList<EveryFunction>();
		ActionListener taskPerformer = new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				timeStep(System.currentTimeMillis());
			}
		};
		timer = new Timer(TIME_GRANULARITY, taskPerformer);
	}
	
	public synchronized void play() {
		if (initialTime < 0) {
			initialTime = System.currentTimeMillis();
			timer.start();
			status = "Playing";
		}
	}
	
	public synchronized void stop() {
		timer.stop();
		status = "Stopped";
		initialTime = -1;
		for (Input i: inputs) {
			i.stop();
		}
		this.resetStacks();
	}
	
	public void addConstraintFunction(ConstraintFunction cf) {
		if (!inputs.contains(cf.getConstraintObject())) {
			inputs.add(cf.getConstraintObject());
		}
		
		willExecute.offer(cf);
	}
	
	private synchronized void timeStep(long currentTime) {
		long elapsed = currentTime - initialTime;
		while ((willExecute.peek() != null) && (willExecute.peek().getTime().getView() <= elapsed)) {
			ConstraintFunction cf = willExecute.poll();
			didExecute.push(cf);
			cf.execute();
		}
		this.evaluateEveryFunction(currentTime);
	}
	
	private synchronized void resetStacks() {
		while (!didExecute.isEmpty()) {
			willExecute.offer(didExecute.pop());
		}
	}
	
	public LinkedList<Input> getInputs() {
		return inputs;
	}

	public void attachOutput(Output out) {
		if (out instanceof SwingOutput) {
			((SwingOutput) out).frame.removeAll();
			for (Input i : inputs) {
				Component ret = i.getVisualData();
				
				if (ret != null) {
					((SwingOutput) out).frame.add(ret);
				}
			}
			((SwingOutput) out).frame.setVisible(true);
		}
	}

	public void addEventFunction(String type, EventFunction event) {
		if (!announceEvents.containsKey(type)) {
			announceEvents.put(type, new LinkedList<EventFunction>());
		}
		announceEvents.get(type).add(event);
	}
	
	public void addEveryFunction(EveryFunction every) {
		if (every != null) {
			everyFunctionList.add(every);
			everyFunctionHash.put(every, every.getExecuteTime().getView());
		}
	}
	
	private void evaluateEveryFunction(long currentTime) {
		long elapsed = currentTime - initialTime;
		for (EveryFunction ef : everyFunctionList) {
			if (everyFunctionHash.get(ef) <= elapsed) {
				ef.execute();
			}
		}
	}
	
	@Override
	public synchronized void receiveAnnouncement(Announcement a) {
		for(EventFunction c : announceEvents.get(a.getType())){
			c.execute();
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
		return status.equalsIgnoreCase("Playing");
	}

	@Override
	public boolean isStopped() {
		return status.equalsIgnoreCase("Stopped");
	}
}
