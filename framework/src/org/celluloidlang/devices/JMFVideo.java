package org.celluloidlang.devices;

import javax.media.Player;
import javax.media.Time;
import javax.media.bean.playerbean.MediaPlayer;

import org.celluloidlang.announcment.Announcement;
import org.celluloidlang.constraints.defined.Output;
import org.celluloidlang.constraints.defined.StaticInput;
import org.celluloidlang.constraints.defined.Video;
import org.celluloidlang.reactive.ReactiveNumber;


public class JMFVideo extends MediaPlayer implements StaticInput, Video, Output, Runnable{
	
	public enum Event{
		AUDIO_GAIN
	}
	
	public JMFVideo(String pathname) {
		this.setMediaLocation("file:////Users/david/Documents/cell/framework/playme.wav");
		this.setPlaybackLoop(false);
		this.realize();
		this.prefetch();
		waitForPrefetch();
	}
	
	@Override
	public void play() {
		this.start();
		new Thread(this).start();
	}

	@Override
	public void stop() {
		if (this.getState() == Player.Started) {
			this.stop();
			this.setMediaTime(new Time(0));
		}
	}

	@Override
	public void rewind(ReactiveNumber reactiveSpeed) {
		double speed = reactiveSpeed.getView();
		if (speed > 0)
			return;
		if ((this.getState() == MediaPlayer.Realized) ||
				(this.getState() == MediaPlayer.Prefetched)) {
			this.setRate((float) speed);
		}
	}

	@Override
	public void seek(ReactiveNumber reactiveTime) {
		double time = reactiveTime.getView();
		if ((this.getState() == MediaPlayer.Realized) ||
				(this.getState() == MediaPlayer.Prefetched)) {
			this.setMediaTime(new Time(time));
		}
	}

	@Override
	public void ffwd(ReactiveNumber reactiveSpeed) {
		double speed = reactiveSpeed.getView();
		if (speed < 0)
			return;
		if ((this.getState() == MediaPlayer.Realized) ||
				(this.getState() == MediaPlayer.Prefetched)) {
			this.stop();
			this.setRate((float) speed);
		}
	}

	@Override
	public void pause() {
		if (this.getState() == Player.Started) {
			this.stop();
		}
	}

	@Override
	public void size(double x1, double y1, double x2, double y2) {
		this.setBounds((int) x1, (int) y1, (int) Math.abs(x2 - x1), (int) Math.abs(y2 - y1));
	}
	
	public void waitForPrefetch(){
		while(!(this.getState() == MediaPlayer.Prefetched)){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			announcer.notifyObservers(new Announcement(Event.AUDIO_GAIN + "=" + this.curVolumeLevel, this));
		}
		
		
		
	}


}
