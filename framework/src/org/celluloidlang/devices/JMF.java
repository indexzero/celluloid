package org.celluloidlang.devices;

import java.net.URL;

import javax.media.ControllerEvent;
import javax.media.ControllerListener;
import javax.media.EndOfMediaEvent;
import javax.media.MediaLocator;
import javax.media.Player;
import javax.media.Time;
import javax.media.bean.playerbean.MediaPlayer;

import org.celluloidlang.constraints.defined.Output;
import org.celluloidlang.constraints.defined.StaticInput;
import org.celluloidlang.reactive.ReactiveNumber;

/**
 * Base class for File based input devices.
 */
public abstract class JMF extends MediaPlayer implements StaticInput, Output, Runnable, ControllerListener {
	
	public enum Status{
		INITIALIZED, PLAYING, STOPPED, PAUSED
	}
	
	protected Status status;
	
	/**
	 * Constructor
	 * @param url the url for this input
	 */
	public JMF(URL url) {
		status = Status.INITIALIZED;
		this.setMediaLocator(new MediaLocator(url));
		this.setPlaybackLoop(false);
		this.realize();
		this.prefetch();
		waitForPrefetch();
		this.addControllerListener(this);
	}
	
	/**
	 * Plays this input
	 */
	@Override
	public void play() {
		super.start();
		status = Status.PLAYING;
		new Thread(this).start();
	}

	/**
	 * Stops this input
	 */
	@Override
	public void stop() {
		if (this.getState() == Player.Started) {
			super.stop();
			status = Status.STOPPED;
			super.setMediaTime(new Time(0));
			super.prefetch();
		}
	}

	/**
	 * Rewind by the given multiplier
	 */
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

	/**
	 * Seeks to the specified time
	 */
	@Override
	public void seek(ReactiveNumber reactiveTime) {
		double time = reactiveTime.getView();
		if ((super.getState() == MediaPlayer.Realized) ||
				(super.getState() == MediaPlayer.Prefetched)) {
			super.setMediaTime(new Time(time));
		}
	}

	/**
	 * Fast forward by the given multiplier
	 */
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

	/**
	 * Pauses this input
	 */
	@Override
	public void pause() {
		if (super.getState() == Player.Started) {
			super.stop();
			status = Status.PAUSED;
		}
	}
	
	/**
	 * Wait for this input to grab the file from the file system
	 * and load it completely.
	 */
	public void waitForPrefetch(){
		while(!(super.getState() == MediaPlayer.Prefetched)){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Error prefetching video file");
			}
		}
	}

	/**
	 * Gets whether this Input is playing.
	 */
	@Override
	public boolean isPlaying() {
		return status.equals(Status.PLAYING);
	}

	/**
	 * Gets whether this Input is stopped.
	 */
	@Override
	public boolean isStopped() {
		return status.equals(Status.STOPPED);
	}

	/**
	 * Gets whether this Input is paused.
	 */
	@Override
	public boolean isPaused() {
		return status.equals(Status.PAUSED);
	}

	/**
	 * Gets whether this Input is rewinding.
	 */
	@Override
	public boolean isRewinding() {
		return super.getRate() < 0;
	}

	/**
	 * Gets whether this Input is fast forwarding.
	 */
	@Override
	public boolean isFfwding() {
		return (super.getRate() > 0) && (super.getRate() != 1);
	}

	/**
	 * Called when this Input gets to the end of the file.
	 */
	@Override
	public void controllerUpdate(ControllerEvent event) {
		if (event instanceof EndOfMediaEvent) {
			stop();
		}
	}
}
