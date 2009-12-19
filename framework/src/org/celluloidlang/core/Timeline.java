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

public class Timeline<T extends Input> implements AnnouncementListener, ReactiveListener, Input {
	
	static final int TIME_GRANULARITY = 100;
	
	private Timer timer;
	private long initialTime = -1;
	private Stack<ConstraintFunction<T>> didExecute;
	private PriorityQueue<ConstraintFunction<T>> willExecute;
	private LinkedList<T> inputs;
	private HashMap<String, LinkedList<EventFunction<T>>> announceEvents;
	
	public Timeline() {
		didExecute = new Stack<ConstraintFunction<T>>();
		willExecute = new PriorityQueue<ConstraintFunction<T>>();
		inputs = new LinkedList<T>();
		announceEvents  = new HashMap<String, LinkedList<EventFunction<T>>>();
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
		}
	}
	
	public synchronized void pause() {
		timer.stop();
	}
	
	public synchronized void stop() {
		timer.stop();
		initialTime = -1;
		this.resetStacks();
	}
	
	public void addConstraintFunction(ConstraintFunction<T> cf) {
		if (!inputs.contains(cf.getConstraintObject())) {
			inputs.add(cf.getConstraintObject());
		}
		
		willExecute.offer(cf);
	}
	
	private synchronized void timeStep(long currentTime) {
		long elapsed = currentTime - initialTime;
		while ((willExecute.peek() != null) && (willExecute.peek().getTime().getView() <= elapsed)) {
			ConstraintFunction<T> cf = willExecute.poll();
			didExecute.push(cf);
			cf.execute();
		}
	}
	
	private synchronized void resetStacks() {
		while (!didExecute.isEmpty()) {
			willExecute.offer(didExecute.pop());
		}
	}
	
	public LinkedList<T> getInputs() {
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

	public void addEventFunction(String type, EventFunction<T> event) {
		if (!announceEvents.containsKey(type)) {
			announceEvents.put(type, new LinkedList<EventFunction<T>>());
		}
		announceEvents.get(type).add(event);
	}
	
	@Override
	public synchronized void receiveAnnouncement(Announcement a) {
		for(EventFunction<T> c : announceEvents.get(a.getType())){
			c.execute();
		}
	}

	@Override
	public void update(ReactiveUpdate e) {
		// TODO reprioritize queue
	}

	@Override
	public Component getVisualData() {
		return null;
	}
}
