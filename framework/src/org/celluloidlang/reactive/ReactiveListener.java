package org.celluloidlang.reactive;

/**
 * Interface for reactive objects
 */
public interface ReactiveListener {

	/**
	 * Receive ReactiveUpdate and updates object view
	 */
	public void update(ReactiveUpdate e);

}
