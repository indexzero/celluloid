package org.celluloidlang.core;

import org.celluloidlang.constraints.defined.Input;

/**
 * Represents an action that should be executed when an event is triggered.
 */
public class EventFunction {
	
	protected Input input;
	protected Input evals[];
	protected boolean hasExecuted;
	
	/**
	 * Constructor
	 * @param eventObject the Input to act upon
	 * @param evals additional inputs that need to be used in boolean conditionals
	 */
	public EventFunction(Input eventObject, Input... evals) {
		this.input = eventObject;
		this.evals = evals;
		this.hasExecuted = false;
	}
	
	/**
	 * This will need to be overwritten by the user, since this
	 * anonymous method holds what should be executed.
	 */
	public void execute() {}
	
	/**
	 * Gets whether this event has been executed
	 */
	public boolean hasExecuted() {
		return hasExecuted;
	}

	/**
	 * Set whether this event has been executed.
	 */
	public void setHasExecuted(boolean hasExecuted) {
		this.hasExecuted = hasExecuted;
	}
}
