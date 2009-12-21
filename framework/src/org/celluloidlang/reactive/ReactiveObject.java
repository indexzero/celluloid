package org.celluloidlang.reactive;

import java.util.ArrayList;

/**
 * Interface for reactive objects
 */
public interface ReactiveObject<T> extends ReactiveListener {
	/**
	 * Performs actions on reactive Object
	 * ADD, +
	 * DIV, \
	 *  MOD, %
	 *  MULT, *
	 *  SUB; -
	 * @author blake
	 *
	 */
	enum Action{
		ADD, DIV, MOD, MULT, SUB;
	}
	/**
	 * holds Reactive instances this is reacting too
	 */
	public ArrayList<Reactive> observing = new ArrayList<Reactive>();
	/**
	 * Helper class for sending other ReactiveObjects notifications to react
	 */
	Reactive reactive = new Reactive();

	/**
	 * Changes data started in object to the new ReactiveObjects data To
	 * Implement: 1. call this.stopObserving 2. rObj.reactive.attatch(this); 3.
	 * a. if using copy eval- set currentView to rObj.getView b. if using lazy,
	 * set viewObjects to rObj 4. make local data empty 5.
	 * this.reactive.setChange();
	 */
	public void set(ReactiveObject<T> rObj);

	/**
	 * Changes data started in object to the new ReactiveObjects data To
	 * Implement: 1. call this.stopObserving
	 * 
	 * 2. a. if using lazy, set viewObjects to rObj
	 * 
	 * 3. make newLocal 4. this.reactive.setChange();
	 */
	public void set(T newLocal);

	/**
	 * observing = new ArrayList<Reactive>();
	 * 
	 * @param r
	 */
	public void stopReactingAll();

	/**
	 * 1. add appendy to end of dependencies, possibly with linked list 2.
	 * updateView() 3. this.reactive.setChange();
	 * 
	 * @param appendy
	 */
	public void action(Action action, ReactiveObject<T> appendy);

	/**
	 * 1. append(new ReactiveObject<T>(appendy));
	 * 
	 * @param appendy
	 */
	public void action(Action action, T appendy);

	/**
	 * joings dependencies into currentView
	 */
	public void updateView();

	/**
	 * updates and returns current view
	 * 
	 * @return
	 */
	public T getView();
}
