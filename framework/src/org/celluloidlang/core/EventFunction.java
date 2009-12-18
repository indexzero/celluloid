package org.celluloidlang.core;

public class EventFunction<T> {
	
	protected T input;
	
	public EventFunction(T eventObject) {
		this.input = eventObject;
	}
	
	/**
	 * need to overwrite this function (anonymous function)
	 */
	public void execute() {}
	
}
