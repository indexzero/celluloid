package org.celluloidlang.core;

import org.celluloidlang.constraints.defined.*;
import org.celluloidlang.reactive.ReactiveNumber;

public class ConstraintFunction {
	
	protected Input input;
	private ReactiveNumber time;
	
	public ConstraintFunction(Input input, ReactiveNumber executeTime) {
		this.input = input;
		this.time = executeTime;
	}
	
	public Input getInput() {
		return input;
	}
	
	public ReactiveNumber getTime() {
		return time;
	}
	
	/**
	 * need to overwrite this function (anonymous function)
	 */
	public void execute() {}

}
