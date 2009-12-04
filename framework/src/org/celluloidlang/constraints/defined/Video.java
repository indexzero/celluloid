package org.celluloidlang.constraints.defined;

import org.celluloidlang.constraints.buildtin.*;

public interface Video extends PLAY, STOP{
	/**
	 * This constraint is responsible for constraining a video to a specific section of an output screen. Since a video can exist in multiple timelines, it is necessary to specify its existence in the context of a timeline. This constraint takes one argument, the rectangular region in which to constrain the video
	 * @param x1 Left side
	 * @param y1 Upper side
	 * @param x2 Right side
	 * @param y2 Lower side
	 */
	public void size(double x1, double y1, double x2, double y2);

}
