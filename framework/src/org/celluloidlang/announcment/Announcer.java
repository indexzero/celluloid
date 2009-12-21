package org.celluloidlang.announcment;


import java.util.ArrayList;

/**
 * Announcer used to announce events
 */
public class Announcer{
	private ArrayList<AnnouncementListener> observerList;
	
	/**
	 * Constructor
	 */
	public Announcer(){
		observerList = new 
		ArrayList<AnnouncementListener>();
	}
	
	/**
	 * Attach this listener to this announcer
	 * @param l the listener to attach
	 */
	public void attach(AnnouncementListener l){
		observerList.add(l);
	}
	
	/**
	 * Detach this listener from this announcer
	 * @param l the listener to detach
	 */
	public void detach(AnnouncementListener observer) {
		observerList.remove(observer);
	}

	/**
	 * Notify this announcer's listeners that an event
	 * has occurred.
	 * @param e the Announcement to issue
	 */
	public void notifyObservers(Announcement e){
		for (AnnouncementListener item: observerList) {
			item.receiveAnnouncement(e);
		}
	}
}

