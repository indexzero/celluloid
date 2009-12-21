package org.celluloidlang.devices;

import java.awt.Component;
import java.net.URL;

import org.celluloidlang.announcment.Announcement;
import org.celluloidlang.constraints.defined.Video;

public class JMFVideo extends JMF implements Video {

	/**
	 * for each ENUM, must document what it does
	 * 
	 * AUDIO_GAIN: [0,1,2,3,4,5]
	 * STATUS: initialized, playing, stopped, paused
	 * MEDIA_TIME: media time in milliseconds
	 * ZOOM_LEVEL: level of zoom
	 */
	public enum Event{
		AUDIO_GAIN, STATUS, MEDIA_TIME, ZOOM_LEVEL
	}
	
	/**
	 * Constructor
	 * @param url the url for this audio file
	 */
	public JMFVideo(URL url) {
		super(url);
		super.setFixedAspectRatio(true);
	}
	
	/**
	 * Sets the size of the video.  Does not currently work with SwingOutput
	 */
	@Override
	public void size(double x1, double y1, double x2, double y2) {
		//super.setMinimumSize(new Dimension((int) Math.abs(x2 - x1), (int) Math.abs(y2 - y1)));
	}
	
	/**
	 * Broadcasts events for this device
	 */
	@Override
	public void run() {
		while(true){

			announcer.notifyObservers(new Announcement(Event.AUDIO_GAIN + "=" +this.curVolumeLevel, this));
			announcer.notifyObservers(new Announcement(Event.STATUS + "=" +super.status, this));
			announcer.notifyObservers(new Announcement(Event.MEDIA_TIME + "=" +(this.getMediaTime().getSeconds() * 1000), this));
			announcer.notifyObservers(new Announcement(Event.ZOOM_LEVEL + "=" +this.curZoomLevel, this));

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Error in JMFVideo eventAnnouncer");
			}
		}
	}

	/**
	 * Gets the visual data for this class
	 */
	@Override
	public Component getVisualData() {
		return super.getVisualComponent();
	}
}
