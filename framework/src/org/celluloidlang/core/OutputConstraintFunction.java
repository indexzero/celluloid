package org.celluloidlang.core;

import org.celluloidlang.constraints.defined.Input;
import org.celluloidlang.constraints.defined.Output;
import org.celluloidlang.reactive.ReactiveNumber;

/**
 * Extension of ConstraintFunction, encapsulates the information needed to
 * play an input on an output
 */
public class OutputConstraintFunction extends ConstraintFunction {

	protected Output output;
	
	/**
	 * Constructor
	 * @param constraintObject the input to act on
	 * @param output the output to act on
	 * @param executeTime the time to attach the output
	 */
	public OutputConstraintFunction(Input constraintObject, Output output, ReactiveNumber executeTime) {
		super(constraintObject, executeTime);
		this.output = output;
	}
	
	/**
	 * Gets the output for this OCF
	 */
	public Output getOutput() {
		return output;
	}
}
