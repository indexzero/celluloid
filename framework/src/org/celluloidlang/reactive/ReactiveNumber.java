package org.celluloidlang.reactive;

import java.util.ArrayList;

public class ReactiveNumber implements ReactiveObject<Float>{

	ArrayList<FloatAction> dependencies = new ArrayList<FloatAction>();
	private Float local;
	private Float currentView;
	enum Action{
		ADD, DIV, GE, GT, LE, LT, MOD, MULT, SUB;
	}
	public ReactiveNumber(Float local){
		this.local = local;
	}
	
	public ReactiveNumber(ReactiveObject<Float> reacting){
		this.set(reacting);
		
	}
	
	@Override
	public void action(Object action, ReactiveObject<Float> appendy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void action(Object action, Float appendy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(ReactiveObject<Float> rObj) {
		this.stopReactingAll();
		this.local = new Float(0.0);
		rObj.reactive.attach(this);
		dependencies.add(new FloatAction(Action.ADD, rObj));
		//TODO: reactive update message
		this.reactive.setChanged(new ReactiveUpdate());
		
	}

	@Override
	public void set(Float newLocal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopReactingAll() {
		observing.removeAll(observing);
		
	}

	@Override
	public void update(ReactiveUpdate e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateView() {
		// TODO Auto-generated method stub
		
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
