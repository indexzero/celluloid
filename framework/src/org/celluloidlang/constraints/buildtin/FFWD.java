package org.celluloidlang.constraints.buildtin;

import org.celluloidlang.reactive.ReactiveNumber;
/**
 * Constraint FFWD
 */
public interface FFWD {
	/**
	 * The ffwd constraint function is used to move forward on the input at different rate faster than normal
	 * @param speed  speed, as a multiplier, 
	 */
	public void ffwd(ReactiveNumber speed);
	
	/**
	 * Gets whether the Input is fast forwarding or not
	 */
	public boolean isFfwding();
}
