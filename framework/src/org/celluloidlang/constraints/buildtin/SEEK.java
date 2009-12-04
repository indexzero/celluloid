package org.celluloidlang.constraints.buildtin;

/**
 * constraint seek
 * @author blake
 *
 */
public interface SEEK {
	/**
	 * Seek is responsible for jumping to a specific point in the input or timeline. It requires two arguments, time to perform the seek at, and the time in which to move to.
	 * @param offSet
	 * @param time
	 */
	public void seek(double offSet, double time);
}
