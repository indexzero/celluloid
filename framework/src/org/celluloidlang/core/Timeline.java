package org.celluloidlang.core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.Timer;

import org.celluloidlang.announcment.Announcement;
import org.celluloidlang.announcment.AnnouncementListener;
import org.celluloidlang.constraints.defined.*;

/*
 * synchronized?
 */

public class Timeline implements AnnouncementListener {
	
	static final int TIME_GRANULARITY = 100;
	
	private Timer timer;
	private long initialTime = -1;
	private Stack<ConstraintFunction> didExecute;
	private LinkedList<ConstraintFunction> willExecute;
	private LinkedList<Input> inputs;
	private HashMap<String, ConstraintFunction> announceEvents;
	
	public Timeline() {
		didExecute = new Stack<ConstraintFunction>();
		willExecute = new LinkedList<ConstraintFunction>();
		inputs = new LinkedList<Input>();
		announceEvents  = new HashMap<String, ConstraintFunction>();
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
	
	public void addConstraintFunction(ConstraintFunction cf) {
		if (!inputs.contains(cf.getInput())) {
			inputs.add(cf.getInput());
		}
		int index = 0;
		while ((index < willExecute.size()) && (cf.getTime() > willExecute.get(index).getTime())) {
			index++;
		}
		willExecute.add(index, cf);
	}
	
	private synchronized void timeStep(long currentTime) {
		long elapsed = currentTime - initialTime;
		while ((willExecute.peek() != null) && (willExecute.peek().getTime() <= elapsed)) {
			ConstraintFunction cf = willExecute.pop();
			didExecute.push(cf);
			cf.execute();
		}
	}
	
	private synchronized void resetStacks() {
		while (!didExecute.isEmpty()) {
			willExecute.push(didExecute.pop());
		}
	}

	public void addEventConstraint(String type, ConstraintFunction constraint){
		announceEvents.put(type, constraint);
	}
	@Override
	public synchronized void update(Announcement a) {
		if(a.getType().equals(a.getOwner()+"volume=6")){
			announceEvents.get(a.getType());
		}
			
		
	}
}
