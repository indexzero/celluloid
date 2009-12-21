package org.celluloidlang.core;

import org.celluloidlang.constraints.defined.Input;
import org.celluloidlang.reactive.ReactiveNumber;

/**
 * Represents a ConstraintFunction, which encapsulates what should be executed
 * and at what time it should be executed.
 */
public class ConstraintFunction implements Comparable<ConstraintFunction> {
	
	protected Input input;
	protected ReactiveNumber time;
	
	/**
	 * Constructor
	 * @param constraintObject the input to act upon
	 * @param executeTime the time to execute the action
	 */
	public ConstraintFunction(Input constraintObject, ReactiveNumber executeTime) {
		this.input = constraintObject;
		this.time = executeTime;
	}
	
	/**
	 * Gets the Input for this ConstraintFunction
	 * @return the Input
	 */
	public Input getConstraintObject() {
		return input;
	}
	
	/**
	 * Gets the time for this ConstraintFunction
	 * @return the time
	 */
	public ReactiveNumber getTime() {
		return time;
	}
	
	/**
	 * Used to compare two ConstraintFunctions, which is done
	 * according to their time, with smaller times being less
	 * than larger times.
	 */
	public int compareTo(ConstraintFunction other) {
		
		if (this.time.getView() < other.getTime().getView()) {
			return -1;
		} else if (this.time.getView() > other.getTime().getView()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	/**
	 * This will need to be overwritten by the user, since this
	 * anonymous method holds what should be executed.
	 */
	public void execute() {}

}
