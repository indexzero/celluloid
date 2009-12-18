package org.celluloidlang.core;

import org.celluloidlang.reactive.ReactiveNumber;

public class ConstraintFunction<T> implements Comparable<ConstraintFunction<T>> {
	
	protected T input;
	private ReactiveNumber time;
	
	public ConstraintFunction(T constraintObject, ReactiveNumber executeTime) {
		this.input = constraintObject;
		this.time = executeTime;
	}
	
	public T getConstraintObject() {
		return input;
	}
	
	public ReactiveNumber getTime() {
		return time;
	}
	
	@SuppressWarnings("unchecked")
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
