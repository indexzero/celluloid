package org.celluloidlang.devices;

import java.awt.Component;
import java.net.URL;

import org.celluloidlang.announcment.Announcement;

public class JMFAudio extends JMF {

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
	
	public JMFAudio(URL url) {
		super(url);
	}
	
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

	@Override
	public Component getVisualData() {
		return null;
	}

}
