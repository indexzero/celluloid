package org.celluloidlang.devices;

import java.util.Stack;

import javax.media.ControllerEvent;
import javax.media.ControllerListener;
import javax.media.EndOfMediaEvent;
import javax.media.NotConfiguredError;
import javax.media.NotRealizedError;
import javax.media.PrefetchCompleteEvent;
import javax.media.Time;
import javax.media.bean.playerbean.MediaPlayer;
import javax.media.control.TrackControl;
import javax.media.protocol.ContentDescriptor;
import javax.media.protocol.DataSource;

import org.celluloidlang.announcment.Announcement;
import org.celluloidlang.constraints.*;
import org.celluloidlang.constraints.defined.Input;

public class InputFile extends MediaPlayer implements Input, ControllerListener {

	@Override
	public void controllerUpdate(ControllerEvent event) {

		Stack<Action> stack = new Stack<Action>();
		
		
		if (event instanceof EndOfMediaEvent) {
				if(!stack.isEmpty()){
					Action next = stack.pop();
					this.stop();
					
					
					long start = next.getStartOffset();
					long speed = next.getSpeed();
					long seek = next.getSeek();
					
					this.setMediaTime(new Time(seek));
					this.syncStart(new Time(this.getTimeBase().getNanoseconds()+start));
			}
				else
					this.close();
				
		}
		if(event instanceof PrefetchCompleteEvent){
			this.start();

			
		}
		
		
		
	}

	/*
	 * //////////////////////////////////////////////////////////////////////////
	 * /////////////////////
	 * 
	 * Not Used for current implementation
	 * 
	 * 
	 * 
	 * //////////////////////////////////////////////////////////////////////////
	 * ///////////////////
	 */

	public void configure() {
		// TODO Auto-generated method stub

	}


	@Override
	public void play(double offSet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop(double offSet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Announcement a) {
		// TODO Auto-generated method stub
		
	}

}

class Action {
	long seek;
	long startOffset;
	long speed;

	public Action() {

	}

	public long getSeek() {
		return seek;
	}

	public void setSeek(long seek) {
		this.seek = seek;
	}

	public long getStartOffset() {
		return startOffset;
	}

	public void setStartOffset(long startOffset) {
		this.startOffset = startOffset;
	}

	public long getSpeed() {
		return speed;
	}

	public void setSpeed(long speed) {
		this.speed = speed;
	}

}
