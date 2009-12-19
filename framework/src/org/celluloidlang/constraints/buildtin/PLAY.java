package org.celluloidlang.constraints.buildtin;
/**
 * Constraint PLAY
 */
public interface PLAY {
	/**
	 * The play constraint function is used to play the specified playable_id on the timeline
	 * of the surrounding in-block.
	 */
	public void play();
	
	public boolean isPlaying();
}
