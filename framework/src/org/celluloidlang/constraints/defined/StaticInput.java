package org.celluloidlang.constraints.defined;

import org.celluloidlang.constraints.buildtin.*;

/**
 * Constraint indicating that the device can seek, rewind, and ffwd,
 * something that streams cannot do, but files can.
 */
public interface StaticInput extends Input, REWIND, SEEK, FFWD {
	
}
