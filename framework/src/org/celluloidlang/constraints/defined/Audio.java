package org.celluloidlang.constraints.defined;

import org.celluloidlang.constraints.buildtin.*;

public interface Audio extends PLAY, STOP{
	public void volume(float volume);
	public void channel(double channel);
}
