package org.celluloidlang.core;

public class EventFunction<T> {
	
	protected T input;
	protected T evals[];
	
	public EventFunction(T eventObject, T... evals) {
		this.input = eventObject;
		this.evals = evals;
	}
	
	/**
	 * need to overwrite this function (anonymous function)
	 */
	public void execute() {}
	
}
