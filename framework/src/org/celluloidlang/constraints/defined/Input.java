package org.celluloidlang.constraints.defined;

import java.awt.Component;

import org.celluloidlang.announcment.Announcer;
import org.celluloidlang.constraints.buildtin.*;
import org.celluloidlang.reactive.Reactive;

/**
 * Constraint indicating that the device is an input device.
 */
public interface Input extends PLAY, STOP, PAUSE {
	Announcer announcer = new Announcer();
	Reactive reactive = new Reactive();
	
	/**
	 * Gets the visual data for this input
	 * @return the awt.Component for this Input
	 */
	public Component getVisualData();
	
}
