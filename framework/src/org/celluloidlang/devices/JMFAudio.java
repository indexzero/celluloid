package org.celluloidlang.devices;

import java.awt.Component;
import java.net.URL;

import org.celluloidlang.announcment.Announcement;
import org.celluloidlang.constraints.defined.Audio;

public class JMFAudio extends JMF implements Audio {

	/**
	 * for each ENUM, must document what it does
	 * 
	 * AUDIO_GAIN: [0,1,2,3,4,5]
	 * STATUS: initialized, playing, stopped, paused
	 * MEDIA_TIME: media time in milliseconds
	 */
	public enum Event{
		AUDIO_GAIN, STATUS, MEDIA_TIME
	}
	
	/**
	 * Constructor
	 * @param url the url for this audio file
	 */
	public JMFAudio(URL url) {
		super(url);
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
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Error in JMFVideo eventAnnouncer");
			}
		}
	}

	/**
	 * Gets the visual data for this class, null since its an audio file
	 */
	@Override
	public Component getVisualData() {
		return null;
	}

}
