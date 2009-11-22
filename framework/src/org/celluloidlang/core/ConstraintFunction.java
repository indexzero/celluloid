package org.celluloidlang.core;

public class ConstraintFunction {
	
	private double time;
	
	public ConstraintFunction(double executeTime) {
		this.time = executeTime;
	}
	
	public double getTime() {
		return time;
	}
	
	//need to overwrite this function (anonymous function)
	public void execute() {}

}
