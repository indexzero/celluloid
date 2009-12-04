package org.celluloidlang.constraints.buildtin;
/**
 * Constraint ffwd
 * @author blake
 *
 */
public interface FFWD {
	/**
	 * The ffwd constraint function is used to move forward on the input at different rate faster than normal
	 * @param offSet  the time to start fast forwarding
	 * @param speed  speed, as a multiplier, 
	 */
	public void ffwd(double offSet, double speed);
}
