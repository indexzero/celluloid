package org.celluloidlang.core;

public class ConstraintFunction {
	
	private long time;
	
	public ConstraintFunction(long executeTime) {
		this.time = executeTime;
	}
	
	public long getTime() {
		return time;
	}
	
	//need to overwrite this function (anonymous function)
	public void execute() {}

}
