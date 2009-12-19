package org.celluloidlang.core;

import org.celluloidlang.constraints.defined.Input;
import org.celluloidlang.reactive.ReactiveNumber;

public class EveryFunction {
	
	protected ReactiveNumber everyTime;
	protected Input input;
	protected Input[] evals;
	
	public EveryFunction(ReactiveNumber everyTime, Input eventObject, Input ... evals) {
		this.everyTime = everyTime;
		this.input = eventObject;
		this.evals = evals;
	}
	
	/**
	 * need to overwrite this function (anonymous function)
	 */
	public void execute() {}

}
