package org.celluloidlang.core;

import org.celluloidlang.constraints.defined.Input;

public class EventFunction {
	
	protected Input input;
	protected Input evals[];
	protected boolean hasExecuted;
	
	public EventFunction(Input eventObject, Input... evals) {
		this.input = eventObject;
		this.evals = evals;
		this.hasExecuted = false;
	}
	
	/**
	 * need to overwrite this function (anonymous function)
	 */
	public void execute() {}
	
	public boolean hasExecuted() {
		return hasExecuted;
	}

	public void setHasExecuted(boolean hasExecuted) {
		this.hasExecuted = hasExecuted;
	}
	
}
