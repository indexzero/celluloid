package org.celluloidlang.core;

import org.celluloidlang.constraints.defined.Input;

public class EventFunction {
	
	protected Input input;
	
	public EventFunction(Input eventObject) {
		this.input = eventObject;
	}
	
	/**
	 * need to overwrite this function (anonymous function)
	 */
	public void execute() {}
	
}
