package org.celluloidlang.announcment;
/**
 * Class used for sending announcments to listeners
 * @author blake
 *
 */
public class Announcement {
	String type;
	Class owner;

	public Announcement(String type, Class owner) {
		this.type = type;
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Class getOwner() {
		return owner;
	}

	public void setOwner(Class owner) {
		this.owner = owner;
	}

}
