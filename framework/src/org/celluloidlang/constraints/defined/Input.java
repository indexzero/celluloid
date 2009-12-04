package org.celluloidlang.constraints.defined;

import org.celluloid.lang.announcment.Announcer;
import org.celluloid.lang.announcment.AnnouncementListener;
import org.celluloidlang.constraints.buildtin.*;
import org.celluloidlang.reactive.Reactive;


public interface Input extends PLAY, STOP, AnnouncementListener{
	Announcer announcer = new Announcer();
	Reactive reactive = new Reactive();
}
