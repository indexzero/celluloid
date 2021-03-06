package org.celluloidlang.constraints.buildtin;

import org.celluloidlang.reactive.ReactiveNumber;
/**
 * Constraint REWIND
 */
public interface REWIND {
	/**
	 * The rewind constraint function is used to move backward on the input at
	 * different rate slower than normal. It requires two arguments, the time to start
	 * rewinding, and the speed, as a multiplier, that should be used.
	 * @param speed speed, as a multiplier
	 */
	public void rewind(ReactiveNumber speed);
	
	/**
	 * Gets whether the Input is rewinding or not
	 */
	public boolean isRewinding();
}
