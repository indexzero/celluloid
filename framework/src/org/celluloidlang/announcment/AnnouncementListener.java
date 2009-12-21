package org.celluloidlang.announcment;
/**
 * Listens for announcements
 */
public interface AnnouncementListener{
	
	/**
	 * Executed when the listener receives an event
	 * @param a the announcement
	 */
	public void receiveAnnouncement(Announcement a);
}
