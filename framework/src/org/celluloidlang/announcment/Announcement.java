package org.celluloidlang.announcment;

import org.celluloidlang.constraints.defined.Input;

/**
 * Class used for sending announcements to listeners
 */
public class Announcement {
	String type;
	Input owner;

	/**
	 * Constructor
	 * @param type String representation of the event
	 * @param owner the owner of the event
	 */
	public Announcement(String type, Input owner) {
		this.type = type;
		this.owner = owner;
	}

	/**
	 * Get the String representation of this event
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the String representation of this event
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Get the owner for this event
	 */
	public Input getOwner() {
		return owner;
	}

	/**
	 * Set the owner for this event
	 */
	public void setOwner(Input owner) {
		this.owner = owner;
	}

}
