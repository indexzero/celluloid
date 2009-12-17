package org.celluloidlang.constraints.buildtin;
/**
 * Constraint Play
 * @author blake
 *
 */
public interface PLAY {
	/**
	 * 
	 * 
	 */
	public static double ALL=Double.POSITIVE_INFINITY;
	/**
	 * The play constraint function is used to play the specified playable_id on the timeline of the surrounding in-block.
	 * Programmer’s Note: It is often tedious to be forced to write a play statement for each playable_id being consumed in a timeline. Especially because many of these may have been declared previously in the current in block. For this reason, Celluloid has a special keyword, all, which when called:
	 * @param offSet start playing when offSet reaches timebase
	 */
	public void play();
}
