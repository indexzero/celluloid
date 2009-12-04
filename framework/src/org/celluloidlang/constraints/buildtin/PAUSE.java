package org.celluloidlang.constraints.buildtin;

public interface PAUSE {
	/**
	 * The pause constraint function is used to pause playback of the specified playable_id. When pause is used, and the play constraint function is called again, playback resumes at the same point it was paused at.
	 * @param offSet
	 */
	public void pause(double offSet);
}
