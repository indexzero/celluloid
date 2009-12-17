package org.celluloidlang.examples;

import org.celluloidlang.core.*;
import org.celluloidlang.devices.JMFVideo;
import org.celluloidlang.reactive.ReactiveNumber;

public class HelloWorld {
	public static void main(String[] args) {

		Timeline timeline1 = new Timeline();
		JMFVideo jmf = new JMFVideo("/Users/kdrum.wav");
		
		//play the file at time 0
		ReactiveNumber start = new ReactiveNumber(0.0);
		ConstraintFunction cf = new ConstraintFunction(jmf, start) {
			public void execute() {
				((JMFVideo) input).play();
			}
		};
		timeline1.addConstraintFunction(cf);
		timeline1.addEventConstraint(jmf+":" + JMFVideo.Event.AUDIO_GAIN + "=" + "6",cf);
		/*
		//play the file at time 0
		cf = new ConstraintFunction(jmf, 4) {
			public void execute() {
				((JMFVideo) input).seek(0, 0);
			}
		};
		timeline1.addConstraintFunction(cf);
		*/
		//play the file at time 0
		ReactiveNumber next = new ReactiveNumber(1000.0);
		cf = new ConstraintFunction(jmf, next) {
			public void execute() {
				((JMFVideo) input).stop();
			}
		};
		timeline1.addConstraintFunction(cf);
		timeline1.play();

	}

}
