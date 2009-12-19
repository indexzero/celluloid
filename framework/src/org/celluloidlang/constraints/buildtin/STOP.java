package org.celluloidlang.constraints.buildtin;
/**
 * Constraint STOP
 */
public interface STOP {
	/**
	 * The stop constraint function is used to stop playback and reset the device_id.
	 * When play is called again, playback will resumes at the start, not the point in
	 * which it was stopped.
	 */
	public void stop();
	
	public boolean isStopped();
}
