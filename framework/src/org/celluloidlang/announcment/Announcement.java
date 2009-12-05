package org.celluloidlang.announcment;

import org.celluloidlang.constraints.defined.Input;

/**
 * Class used for sending announcments to listeners
 * @author blake
 *
 */
public class Announcement {
	String type;
	Input owner;

	public Announcement(String type, Input owner) {
		this.type = type;
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Input getOwner() {
		return owner;
	}

	public void setOwner(Input owner) {
		this.owner = owner;
	}

}
