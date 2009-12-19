package org.celluloidlang.core;

import org.celluloidlang.constraints.defined.Output;
import org.celluloidlang.reactive.ReactiveNumber;

public class OutputConstraintFunction<T> extends ConstraintFunction<T> {

	protected Output output;
	
	public OutputConstraintFunction(T constraintObject, Output output, ReactiveNumber executeTime) {
		super(constraintObject, executeTime);
		this.output = output;
	}
	
	public Output getOutput() {
		return output;
	}

}
