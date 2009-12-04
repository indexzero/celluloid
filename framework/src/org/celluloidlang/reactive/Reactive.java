package org.celluloidlang.reactive;

import java.util.ArrayList;

/**
 * Helper class for reactive objects
 * 
 * @author blake
 * 
 */
public class Reactive {
	private ArrayList<ReactiveObject> observerList;

	public Reactive() {
		observerList = new ArrayList<ReactiveObject>();
	}

	public void attach(ReactiveObject l) {
		observerList.add(l);

	}

	public void detach(ReactiveObject observer) {
		observerList.remove(observer);
	}

	public void detachAll() {
		observerList = new ArrayList<ReactiveObject>();
	}

	public void notifyObservers(ReactiveUpdate e) {
		for (ReactiveObject item : observerList) {
			item.update(e);
		}
	}

	public void setChanged(ReactiveUpdate e) {
		for (ReactiveObject item : observerList) {
			item.update(e);
		}

	}
}
