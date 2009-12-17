package org.celluloidlang.reactive;

/**
 * Interface for reactive objects
 * 
 * 
 * @author blake
 * 
 */
public interface ReactiveListener<T> {

	/**
	 * Receive ReactiveUpdate and updates object view
	 * 
	 * @param e
	 */
	public void update(ReactiveUpdate e);

}
