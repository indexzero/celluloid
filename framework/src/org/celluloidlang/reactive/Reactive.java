package org.celluloidlang.reactive;

import java.util.ArrayList;

/**
 * Helper class for reactive objects
 */
public class Reactive {
	private ArrayList<ReactiveObject> observerList;

	/**
	 * Constructor
	 */
	public Reactive() {
		observerList = new ArrayList<ReactiveObject>();
	}

	/**
	 * Attach this ReactiveObject
	 * @param l the object to attach
	 */
	public void attach(ReactiveObject l) {
		observerList.add(l);
	}

	/**
	 * Detach this ReactiveObject
	 * @param l the object to detach
	 */
	public void detach(ReactiveObject observer) {
		observerList.remove(observer);
	}

	/**
	 * Detach all ReactiveObjects
	 */
	public void detachAll() {
		observerList = new ArrayList<ReactiveObject>();
	}

	/**
	 * Notify the observers of a change in this object
	 * @param e the update item
	 */
	public void notifyObservers(ReactiveUpdate e) {
		for (ReactiveObject item : observerList) {
			item.update(e);
		}
	}

	/**
	 * Notify the observers of a change in this object
	 * @param e the update item
	 */	
	public void setChanged(ReactiveUpdate e) {
		for (ReactiveObject item : observerList) {
			item.update(e);
		}
	}
}
