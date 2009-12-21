package org.celluloidlang.core;

import org.celluloidlang.constraints.defined.Input;
import org.celluloidlang.reactive.ReactiveNumber;

/**
 * Represents an every event, which are executed at a given interval
 */
public class EveryFunction {
	
	protected ReactiveNumber everyTime;
	protected Input input;
	protected Input[] evals;
	
	/**
	 * Constructor
	 * @param everyTime how often to execute the action
	 * @param eventObject the input that executes the action
	 * @param evals any additional inputs needed for boolean statements
	 */
	public EveryFunction(ReactiveNumber everyTime, Input eventObject, Input ... evals) {
		this.everyTime = everyTime;
		this.input = eventObject;
		this.evals = evals;
	}
	
	/**
	 * Gets how often this function should be executed.
	 */
	public ReactiveNumber getExecuteTime() {
		return everyTime;
	}
	
	/**
	 * This will need to be overwritten by the user, since this
	 * anonymous method holds what should be executed.
	 */
	public void execute() {}
}
