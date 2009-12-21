package org.celluloidlang.reactive;

import java.util.ArrayList;

/**
 * Reactive Number
 */
public class ReactiveNumber implements ReactiveObject<Float> {

	ArrayList<FloatAction> dependencies = new ArrayList<FloatAction>();
	private Float local;
	private Float currentView;

	/**
	 * Constructor
	 * @param local the float to make reactive
	 */
	public ReactiveNumber(Float local){
		this.set(local);
	}
	
	/**
	 * Constructor
	 * @param local the double to make reactive
	 */
	public ReactiveNumber(Double local){
		this(new Float(local));
	}
	
	/**
	 * Constructor
	 * @param reacting the list of floats to add to this one
	 */
	public ReactiveNumber(ReactiveObject<Float> reacting){
		this.set(reacting);
	}
	
	/**
	 * Add a new action to this float
	 */
	@Override
	public void action(Action action, ReactiveObject<Float> appendy) {
		dependencies.add(new FloatAction(action, appendy));
		
	}

	/**
	 * Add a new action to this float
	 */
	@Override
	public void action(Action action, Float appendy) {
		dependencies.add(new FloatAction(action, new ReactiveNumber(appendy)));
		updateView();
	}

	/**
	 * Get the current value for the float
	 */
	@Override
	public Float getView() {
		return this.currentView;
	}

	/**
	 * Sets the value of this float to the floats in the reactive objects
	 */
	@Override
	public void set(ReactiveObject<Float> rObj) {
		this.stopReactingAll();
		this.local = new Float(0.0);
		rObj.reactive.attach(this);
		dependencies.add(new FloatAction(Action.ADD, rObj));
		this.updateView();
		this.reactive.setChanged(new ReactiveUpdate());
		
	}

	/**
	 * Sets the value of this float to the new value
	 */
	@Override
	public void set(Float newLocal) {
		this.stopReactingAll();
		this.local = newLocal;
		this.updateView();
		this.reactive.setChanged(new ReactiveUpdate());
		
	}
	
	/**
	 * Sets the value of this float to the new value
	 */
	public void set(Double newLocal) {
		set(new Float(newLocal));
		
	}

	/**
	 * Stop reacting
	 */
	@Override
	public void stopReactingAll() {
		observing.removeAll(observing);
		
	}

	/**
	 * Update this ReactiveNumber
	 */
	@Override
	public void update(ReactiveUpdate e) {
		updateView();
		
	}

	/**
	 * Update the value of this float
	 */
	@Override
	public void updateView() {
		Float tmp = local;
		for(FloatAction fa: dependencies){
			switch(fa.action){
			case ADD: tmp += fa.item.getView();
			break;
			case SUB: tmp -= fa.item.getView();
			break;
			case DIV: tmp /= fa.item.getView();
			break;
			case MULT:  tmp *= fa.item.getView();
			break;
			case MOD: tmp %= fa.item.getView();
			break;
			}
		}
		this.currentView = tmp;
		
	}
	
	/**
	 * Inner class representing an action on a float
	 */
	class FloatAction{
		Action action;
		ReactiveObject<Float> item;
		FloatAction(Action action, ReactiveObject<Float> f){
			this.action = action;
			this.item = f;
		}
	}


}
