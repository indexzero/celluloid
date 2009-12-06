package org.celluloidlang.reactive;

import java.util.ArrayList;

public class ReactiveNumber implements ReactiveObject<Float>{

	ArrayList<FloatAction> dependencies = new ArrayList<FloatAction>();
	private Float local;
	private Float currentView;

	public ReactiveNumber(Float local){
		this.set(local);
	}
	
	public ReactiveNumber(Double local){
		this(new Float(local));
	}
	
	public ReactiveNumber(ReactiveObject<Float> reacting){
		this.set(reacting);
		
	}
	
	@Override
	public void action(Action action, ReactiveObject<Float> appendy) {
		dependencies.add(new FloatAction(action, appendy));
		
	}

	@Override
	public void action(Action action, Float appendy) {
		dependencies.add(new FloatAction(action, new ReactiveNumber(appendy)));
		updateView();
	}

	@Override
	public Float getView() {
		return this.currentView;
	}

	@Override
	public void set(ReactiveObject<Float> rObj) {
		this.stopReactingAll();
		this.local = new Float(0.0);
		this.reactive.attach(this);
		dependencies.add(new FloatAction(Action.ADD, rObj));
		this.updateView();
		this.reactive.setChanged(new ReactiveUpdate());
		
	}

	@Override
	public void set(Float newLocal) {
		this.stopReactingAll();
		this.local = newLocal;
		this.updateView();
		this.reactive.setChanged(new ReactiveUpdate());
		
	}
	
	public void set(Double newLocal) {
		set(new Float(newLocal));
		
	}

	@Override
	public void stopReactingAll() {
		observing.removeAll(observing);
		
	}

	@Override
	public void update(ReactiveUpdate e) {
		updateView();
		
	}

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
	
	class FloatAction{
		Action action;
		ReactiveObject<Float> item;
		FloatAction(Action action, ReactiveObject<Float> f){
			this.action = action;
			this.item = f;
		}
	}


}
