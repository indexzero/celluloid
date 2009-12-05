package org.celluloidlang.examples;

import org.celluloidlang.core.*;
import org.celluloidlang.devices.JMFVideo;

public class HelloWorld {
	public static void main(String[] args) {

		Timeline timeline1 = new Timeline();
		JMFVideo jmf = new JMFVideo("/Users/kdrum.wav");
		
		//play the file at time 0
		ConstraintFunction cf = new ConstraintFunction(jmf, 0) {
			public void execute() {
				((JMFVideo) input).play(0);
			}
		};
		timeline1.addConstraintFunction(cf);
		timeline1.addEventConstraint(jmf+":volume=6", cf);
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
		cf = new ConstraintFunction(jmf, 1000) {
			public void execute() {
				((JMFVideo) input).stop(0);
			}
		};
		timeline1.addConstraintFunction(cf);
		timeline1.play();

	}

}
