package org.celluloidlang.core;

import org.celluloidlang.constraints.defined.Input;

public class EventFunction {
	
	protected Input input;
	protected Input evals[];
	
	public EventFunction(Input eventObject, Input... evals) {
		this.input = eventObject;
		this.evals = evals;
	}
	
	/**
	 * need to overwrite this function (anonymous function)
	 */
	public void execute() {}
	
}
