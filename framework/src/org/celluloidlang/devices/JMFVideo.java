package org.celluloidlang.devices;

import javax.media.Player;
import javax.media.Time;
import javax.media.bean.playerbean.MediaPlayer;

import org.celluloidlang.announcment.Announcement;
import org.celluloidlang.constraints.defined.*;

public class JMFVideo extends MediaPlayer implements StaticInput, Video, Output {

	public JMFVideo(String pathname) {
		this.setMediaLocation("file:////Users/david/Documents/cell/framework/playme.wav");
		this.setPlaybackLoop(false);
		this.realize();
		this.prefetch();
	}
	
	@Override
	public void play(double offSet) {
		this.start();
	}

	@Override
	public void stop(double offSet) {
		if (this.getState() == Player.Started) {
			this.stop();
			this.setMediaTime(new Time(0));
		}
	}

	@Override
	public void update(Announcement a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rewind(double offSet, double speed) {
		if (speed > 0)
			return;
		if ((this.getState() == MediaPlayer.Realized) ||
				(this.getState() == MediaPlayer.Prefetched)) {
			this.setRate((float) speed);
		}
	}

	@Override
	public void seek(double offSet, double time) {
		if ((this.getState() == MediaPlayer.Realized) ||
				(this.getState() == MediaPlayer.Prefetched)) {
			this.setMediaTime(new Time(time));
		}
	}

	@Override
	public void ffwd(double offSet, double speed) {
		if (speed < 0)
			return;
		if ((this.getState() == MediaPlayer.Realized) ||
				(this.getState() == MediaPlayer.Prefetched)) {
			this.stop();
			this.setRate((float) speed);
		}
	}

	@Override
	public void pause(double offSet) {
		if (this.getState() == Player.Started) {
			this.stop();
		}
	}

	@Override
	public void size(double x1, double y1, double x2, double y2) {
		this.setBounds((int) x1, (int) y1, (int) Math.abs(x2 - x1), (int) Math.abs(y2 - y1));
	}

}
