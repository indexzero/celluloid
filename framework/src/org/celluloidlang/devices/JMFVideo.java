package org.celluloidlang.devices;

import javax.media.Time;
import javax.media.bean.playerbean.MediaPlayer;

import org.celluloidlang.announcment.Announcement;
import org.celluloidlang.constraints.defined.*;

public class JMFVideo extends MediaPlayer implements StaticInput, Video, Output{

	public JMFVideo() {
		// TODO createRealizedPlayer();
		// or setMediaLocator
		//prefetch() maybe
	}
	
	@Override
	public void play(double offSet) {
		//TODO error checking
		this.start();
	}

	@Override
	public void stop(double offSet) {
		//TODO error checking
		this.stop();
		this.setMediaTime(new Time(0));
	}

	@Override
	public void update(Announcement a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rewind(double offSet, double speed) {
		//TODO error checking
		if (speed > 0)
			return;
		this.setRate((float) speed);
	}

	@Override
	public void seek(double offSet, double time) {
		//TODO error checking
		this.setMediaTime(new Time(time));
	}

	@Override
	public void ffwd(double offSet, double speed) {
		//TODO error checking
		if (speed < 0)
			return;
		this.setRate((float) speed);
	}

	@Override
	public void pause(double offSet) {
		//TODO error checking
		this.stop();
	}

	@Override
	public void size(double x1, double y1, double x2, double y2) {
		//TODO error checking
		this.setBounds((int) x1,(int) y1,(int) Math.abs(x2 - x1),(int) Math.abs(y2 - y1));
	}

}
