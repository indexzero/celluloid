package org.celluloidlang.reactive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

/**
 * Reactive string
 */
public class ReactiveString extends Observable implements Observer {
	private ArrayList<ReactiveString> args;
	private String currentString;
	private String local;
	private ArrayList<ReactiveString> dependent = new  ArrayList<ReactiveString>();
	
	/**
	 * Constructor
	 * @param clone this ReactiveString
	 */
	public ReactiveString(ReactiveString rString){
		subscribe(rString);
		args = new ArrayList<ReactiveString>();
		args.add(rString);
		currentString = rString.getLocal();
		local = "";
	}
	
	/**
	 * Constructor
	 * @param use this String
	 */
	public ReactiveString(String string) {
		this.local = currentString = string;
		this.args = new ArrayList<ReactiveString>();
	}

	/**
	 * The ReactiveString to set this object to
	 * @param rString
	 */
	public void setString(ReactiveString rString){
		subscribe(rString);
		args = new ArrayList<ReactiveString>();
		args.add(rString);
		currentString = rString.getLocal();
		local = "";
		this.setChanged();
		this.sendNotify();
	}
	
	/**
	 * The String to set this object to
	 * @param rString
	 */
	public void setString(String newLocal){
		this.currentString = this.local = newLocal;
		args = new ArrayList<ReactiveString>();
		this.setChanged();
		this.sendNotify();
	}
	
	/**
	 * Update this ReactiveString
	 */
	@Override
	public void update(Observable o, Object arg) {
		Set<ReactiveString> observers = (Set<ReactiveString>)arg;
		if(!observers.contains(this)) //cyclic dependency detected
		{
			updateObject();
			observers.add(this);
			this.notifyObservers(observers);
		} else {
			throw new RuntimeException("Cyclic Dependency detected: "+this.getLocal());
		}
	}
	
	/**
	 * Update this ReactiveString
	 */
	private void updateObject(){
		this.setChanged();
		this.currentString = this.local;
		for(ReactiveString neighbor : args){
			this.currentString += neighbor.getLocal();
		}
	}
	
	/**
	 * Append to this String
	 * @param appendy
	 */
	public void append(ReactiveString appendy){
		args.add(appendy);
		subscribe(appendy);
		updateObject();
		sendNotify();
	}
	
	/**
	 * Append to this String
	 * @param appendy
	 */
	public void append(String appendy){
		args.add(new ReactiveString(appendy));
		updateObject();
		sendNotify();
	}
	
	/**
	 * Send notifications of a change
	 */
	private void sendNotify(){
		HashSet<ReactiveString> observers = new HashSet<ReactiveString>();
		observers.add(this);
		this.notifyObservers(observers);
	}
	
	/**
	 * Get the String for this object
	 */
	public String getLocal(){
		return this.currentString;
	}
	
	/**
	 * Subscribe to this ReactiveString
	 * @param dep
	 */
	private void subscribe(ReactiveString dep){
		dep.addObserver(this);
		dependent.add(dep);
	}
	
	/**
	 * Unsubscribe all listeners
	 */
	public void unsubscribeAll(){
		for(ReactiveString dep : dependent)
		{
			dep.deleteObserver(this);
		}
	}
	
	@Override
	public String toString(){
		return this.currentString;
	}
	
}

