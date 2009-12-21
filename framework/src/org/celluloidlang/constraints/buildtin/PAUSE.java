package org.celluloidlang.constraints.buildtin;
/**
 * Constraint PAUSE
 */
public interface PAUSE {
	/**
	 * The pause constraint function is used to pause playback of the specified playable_id.
	 * When pause is used, and the play constraint function is called again, playback resumes
	 * at the same point it was paused at.
	 */
	public void pause();
	
	/**
	 * Gets whether the Input is paused or not
	 */
	public boolean isPaused();
}
