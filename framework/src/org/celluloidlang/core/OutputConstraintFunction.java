package org.celluloidlang.core;

import org.celluloidlang.constraints.defined.Input;
import org.celluloidlang.constraints.defined.Output;
import org.celluloidlang.reactive.ReactiveNumber;

public class OutputConstraintFunction extends ConstraintFunction {

	protected Output output;
	
	public OutputConstraintFunction(Input constraintObject, Output output, ReactiveNumber executeTime) {
		super(constraintObject, executeTime);
		this.output = output;
	}
	
	public Output getOutput() {
		return output;
	}

}
