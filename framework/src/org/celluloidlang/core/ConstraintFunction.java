package org.celluloidlang.core;

import org.celluloidlang.constraints.defined.Input;
import org.celluloidlang.reactive.ReactiveNumber;

public class ConstraintFunction implements Comparable<ConstraintFunction> {
	
	protected Input input;
	protected ReactiveNumber time;
	
	public ConstraintFunction(Input constraintObject, ReactiveNumber executeTime) {
		this.input = constraintObject;
		this.time = executeTime;
	}
	
	public Input getConstraintObject() {
		return input;
	}
	
	public ReactiveNumber getTime() {
		return time;
	}
	
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
	 * need to overwrite this function (anonymous function)
	 */
	public void execute() {}

}
