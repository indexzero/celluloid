package org.celluloidlang.reactive;
/**
 * 
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
/**
 * Reactive string
 * @author blake
 *
 */
public class ReactiveString extends Observable implements Observer {
	private ArrayList<ReactiveString> args;
	private String currentString;
	private String local;
	private ArrayList<ReactiveString> dependent = new  ArrayList<ReactiveString>();
	public ReactiveString(ReactiveString rString){
		subscribe(rString);
		args = new ArrayList<ReactiveString>();
		args.add(rString);
		currentString = rString.getLocal();
		local = "";
	}
	
	

	public ReactiveString(String string) {
		this.local = currentString = string;
		this.args = new ArrayList<ReactiveString>();
	}

	public void setString(ReactiveString rString){
		subscribe(rString);
		args = new ArrayList<ReactiveString>();
		args.add(rString);
		currentString = rString.getLocal();
		local = "";
		this.setChanged();
		this.sendNotify();
	}
	
	public void setString(String newLocal){
		this.currentString = this.local = newLocal;
		args = new ArrayList<ReactiveString>();
		this.setChanged();
		this.sendNotify();
	}
	
	@Override
	public void update(Observable o, Object arg) {
		Set<ReactiveString> observers = (Set<ReactiveString>)arg;
		if(!observers.contains(this)) //cyclic dependency detected
		{
			System.out.println("updating:" + this.getLocal());
			updateObject();
			observers.add(this);
			System.out.println("updated:" + this.getLocal());
			this.notifyObservers(observers);
		} else {
			throw new RuntimeException("Cyclic Dependency detected: "+this.getLocal());
		}
			
		
		
	}
	
	private void updateObject(){
		this.setChanged();
		this.currentString = this.local;
		for(ReactiveString neighbor : args){
			this.currentString += neighbor.getLocal();
		}
	}
	
	public void append(ReactiveString appendy){
		args.add(appendy);
		subscribe(appendy);
		updateObject();
		sendNotify();
	}
	public void append(String appendy){
		args.add(new ReactiveString(appendy));
		updateObject();
		sendNotify();
	}
	
	private void sendNotify(){
		HashSet<ReactiveString> observers = new HashSet<ReactiveString>();
		observers.add(this);
		this.notifyObservers(observers);
	}
	
	public String getLocal(){
		return this.currentString;
	}
	
	private void subscribe(ReactiveString dep){
		dep.addObserver(this);
		dependent.add(dep);
	}
	
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

