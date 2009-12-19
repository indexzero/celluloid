package org.celluloidlang.devices;

import java.awt.Component;
import java.net.URL;

import javax.media.MediaLocator;
import javax.media.Player;
import javax.media.Time;
import javax.media.bean.playerbean.MediaPlayer;

import org.celluloidlang.announcment.Announcement;
import org.celluloidlang.constraints.defined.Output;
import org.celluloidlang.constraints.defined.StaticInput;
import org.celluloidlang.reactive.ReactiveNumber;

public class JMFAudio extends MediaPlayer implements StaticInput, Output, Runnable {
	
	/**
	 * for each ENUM, must document what it does
	 * 
	 * STATUS: initialized, playing, stopped, paused
	 */
	public enum Event{
		AUDIO_GAIN, STATUS, MEDIA_TIME
	}
	
	private String status;
	
	public JMFAudio(URL url) {
		status = "initialized";
		this.setMediaLocator(new MediaLocator(url));
		this.setPlaybackLoop(false);
		this.realize();
		this.prefetch();
		waitForPrefetch();
	}
	
	@Override
	public void play() {
		super.start();
		status = "playing";
		new Thread(this).start();
	}

	@Override
	public void stop() {
		if (this.getState() == Player.Started) {
			super.stop();
			status = "stopped";
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
			status = "paused";
		}
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

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Error in JMFVideo eventAnnouncer");
			}
			announcer.notifyObservers(new Announcement(Event.AUDIO_GAIN + "=" +this.curVolumeLevel, this));
			announcer.notifyObservers(new Announcement(Event.STATUS + "=" +this.status, this));
			announcer.notifyObservers(new Announcement(Event.MEDIA_TIME + "=" +this.getMediaTime().getSeconds(), this));
		}
	}

	@Override
	public Component getVisualData() {
		return super.getVisualComponent();
	}

	@Override
	public boolean isPlaying() {
		return status.equalsIgnoreCase("Playing");
	}

	@Override
	public boolean isStopped() {
		return status.equalsIgnoreCase("Stopped");
	}

	@Override
	public boolean isPaused() {
		return status.equalsIgnoreCase("Paused");
	}

	@Override
	public boolean isRewinding() {
		return super.getRate() < 0;
	}

	@Override
	public boolean isFfwding() {
		return (super.getRate() > 0) && (super.getRate() != 1);
	}
}
