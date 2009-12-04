package org.celluloid.lang.announcment;


import java.util.ArrayList;

/**
 * Announcer used to announce events
 * @author blake
 *
 */
public class Announcer{
	private ArrayList<AnnouncementListener> observerList;
	public Announcer(){
		observerList = new 
		ArrayList<AnnouncementListener>();
		
	}
	
	public void attach(AnnouncementListener l){
		observerList.add(l);


	}
	
	public void detach(AnnouncementListener observer) {
		observerList.remove(observer);
	}

	
	public void notifyObservers(Announcement e){
		for (AnnouncementListener item: observerList) {
			item.update(e);
		}


	}
	
	
}
