package org.celluloidlang.devices;

import java.awt.Component;
import java.net.URL;

import javax.media.ControllerEvent;
import javax.media.ControllerListener;
import javax.media.EndOfMediaEvent;
import javax.media.MediaLocator;
import javax.media.Player;
import javax.media.Time;
import javax.media.bean.playerbean.MediaPlayer;

import org.celluloidlang.announcment.Announcement;
import org.celluloidlang.constraints.defined.Output;
import org.celluloidlang.constraints.defined.StaticInput;
import org.celluloidlang.constraints.defined.Video;
import org.celluloidlang.reactive.ReactiveNumber;

public class JMFVideo extends MediaPlayer implements StaticInput, Video, Output, Runnable, ControllerListener {
	
	/**
	 * for each ENUM, must document what it does
	 * 
	 * AUDIO_GAIN: [0,1,2,3,4,5]
	 * STATUS: initialized, playing, stopped, paused
	 * MEDIA_TIME: media time in milliseconds
	 */
	public enum Event{
		AUDIO_GAIN, STATUS, MEDIA_TIME, ZOOM_LEVEL
	}
	
	public enum Status{
		PLAYING, STOPPED, PAUSED
	}
	
	Status status;
	
	public JMFVideo(URL url) {
		status = Status.STOPPED;
		this.setMediaLocator(new MediaLocator(url));
		this.setPlaybackLoop(false);
		this.realize();
		this.prefetch();
		waitForPrefetch();
		this.addControllerListener(this);
	}
	
	@Override
	public void play() {
		super.start();
		status = Status.PLAYING;
		new Thread(this).start();
	}

	@Override
	public void stop() {
		if (this.getState() == Player.Started) {
			super.stop();
			status = Status.STOPPED;
			super.setMediaTime(new Time(0));
		}
	}

	@Override
	public void rewind(ReactiveNumber reactiveSpeed) {
		double speed = reactiveSpeed.getView();
		if (speed > 0)
			return;
		if ((super.getState() == MediaPlayer.Realized) ||
				(super.getState() == MediaPlayer.Prefetched)) {
			super.setRate((float) speed);
		}
		if (super.getState() == MediaPlayer.Started) {
			super.setRate((float) speed);
		}
	}

	@Override
	public void seek(ReactiveNumber reactiveTime) {
		double time = reactiveTime.getView();
		if ((super.getState() == MediaPlayer.Realized) ||
				(super.getState() == MediaPlayer.Prefetched)) {
			super.setMediaTime(new Time(time));
		}
	}

	@Override
	public void ffwd(ReactiveNumber reactiveSpeed) {
		double speed = reactiveSpeed.getView();
		if (speed < 0)
			return;
		if ((super.getState() == MediaPlayer.Realized) ||
				(super.getState() == MediaPlayer.Prefetched)) {
			super.stop();
			super.setRate((float) speed);
			super.start();
		}
		if (super.getState() == MediaPlayer.Started) {
			super.setRate((float) speed);
		}
	}

	@Override
	public void pause() {
		if (super.getState() == Player.Started) {
			super.stop();
			status = Status.PAUSED;
		}
	}

	@Override
	public void size(double x1, double y1, double x2, double y2) {
		super.setBounds((int) x1, (int) y1, (int) Math.abs(x2 - x1), (int) Math.abs(y2 - y1));
	}
	
	public void waitForPrefetch(){
		while(!(super.getState() == MediaPlayer.Prefetched)){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Error prefetching video file");
			}
		}
	}
	
	public boolean evaluateEvent(){
		return true;
	}
	
	@Override
	public void run() {
		while(true){

			announcer.notifyObservers(new Announcement(Event.AUDIO_GAIN + "=" +this.curVolumeLevel, this));
			announcer.notifyObservers(new Announcement(Event.STATUS + "=" +this.status, this));
			announcer.notifyObservers(new Announcement(Event.MEDIA_TIME + "=" +(this.getMediaTime().getSeconds() * 1000), this));
			announcer.notifyObservers(new Announcement(Event.ZOOM_LEVEL + "=" +this.curZoomLevel, this));
			

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Error in JMFVideo eventAnnouncer");
			}
		}
	}

	@Override
	public Component getVisualData() {
		return super.getVisualComponent();
	}

	@Override
	public boolean isPlaying() {
		return status.equals(Status.PLAYING);
	}

	@Override
	public boolean isStopped() {
		return status.equals(Status.STOPPED);
	}

	@Override
	public boolean isPaused() {
		return status.equals(Status.PAUSED);
	}

	@Override
	public boolean isRewinding() {
		return super.getRate() < 0;
	}

	@Override
	public boolean isFfwding() {
		return (super.getRate() > 0) && (super.getRate() != 1);
	}


	@Override
	public void controllerUpdate(ControllerEvent event) {
		System.out.println(event.toString());
		if (event instanceof EndOfMediaEvent) {
			stop();
		}

	}

}
