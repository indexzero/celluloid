package org.celluloidlang.constraints.defined;

import java.awt.Component;

import org.celluloidlang.announcment.Announcer;
import org.celluloidlang.constraints.buildtin.*;
import org.celluloidlang.reactive.Reactive;


public interface Input extends PLAY, STOP{
	Announcer announcer = new Announcer();
	Reactive reactive = new Reactive();
	
	public Component getVisualData();
}
