package org.celluloidlang.core;

import org.celluloidlang.constraints.defined.Input;
import org.celluloidlang.reactive.ReactiveNumber;

public class EveryFunction<T extends Input> {
	
	protected ReactiveNumber everyTime;
	protected T input;
	protected T[] evals;
	
	public EveryFunction(ReactiveNumber everyTime, T eventObject, T ... evals) {
		this.everyTime = everyTime;
		this.input = eventObject;
		this.evals = evals;
	}
	
	/**
	 * need to overwrite this function (anonymous function)
	 */
	public void execute() {}

}
