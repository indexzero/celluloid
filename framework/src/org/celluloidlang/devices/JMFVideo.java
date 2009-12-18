package org.celluloidlang.devices;

import java.net.URL;

import javax.media.MediaLocator;
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
	
	public JMFVideo(URL url) {
		this.setMediaLocation("file:////Users/david/Downloads/june_chorus.wav");
		//this.setMediaLocator(new MediaLocator(url));
		this.setPlaybackLoop(false);
		this.realize();
		this.prefetch();
		waitForPrefetch();
	}
	
	@Override
	public void play() {
		super.start();
		new Thread(this).start();
		System.out.println("Played");
	}

	@Override
	public void stop() {
		if (this.getState() == Player.Started) {
			super.stop();
			super.setMediaTime(new Time(0));
			System.out.println("Stopped");
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
		}
		/*
		if (super.getState() == MediaPlayer.Started) {
			System.out.println("BLAH");
			super.stop();
			super.setRate((float) speed);
			super.start();
		}*/
	}

	@Override
	public void pause() {
		if (super.getState() == Player.Started) {
			super.stop();
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
