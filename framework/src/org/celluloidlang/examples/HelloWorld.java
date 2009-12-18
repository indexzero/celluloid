package org.celluloidlang.examples;

import java.io.File;
import java.net.MalformedURLException;

import org.celluloidlang.constraints.defined.Input;
import org.celluloidlang.core.*;
import org.celluloidlang.devices.JMFVideo;
import org.celluloidlang.reactive.ReactiveNumber;

public class HelloWorld {
	public static void main(String[] args) {

		Timeline<Input> timeline1 = new Timeline<Input>();
		
		File file = new File("/Users/kdrum.wav");
		JMFVideo jmf;
		try {
			jmf = new JMFVideo(file.toURI().toURL());
		} catch (MalformedURLException e) {
			System.err.println("Could not generate URL");
			return;
		}
		
		//play the file at time 0
		ReactiveNumber start = new ReactiveNumber(0.0);
		ConstraintFunction<Input> cf = new ConstraintFunction<Input>(jmf, start) {
			public void execute() {
				((JMFVideo) input).play();
			}
		};
		timeline1.addConstraintFunction(cf);
		
		start = new ReactiveNumber(2000.0);
		cf = new ConstraintFunction<Input>(jmf, start) {
			public void execute() {
				((JMFVideo) input).ffwd(new ReactiveNumber(2.0));
			}
		};
		timeline1.addConstraintFunction(cf);
		
		start = new ReactiveNumber(4000.0);
		cf = new ConstraintFunction<Input>(jmf, start) {
			public void execute() {
				((JMFVideo) input).play();
			}
		};
		timeline1.addConstraintFunction(cf);
		
		start = new ReactiveNumber(6000.0);
		cf = new ConstraintFunction<Input>(jmf, start) {
			public void execute() {
				((JMFVideo) input).stop();
			}
		};
		timeline1.addConstraintFunction(cf);
		
		/*
		EventFunction<Input> ev = new EventFunction<Input>(jmf) {
			public void execute() {
				((JMFVideo) input).play();
			}
		};
		timeline1.addEventConstraint(jmf+":" + JMFVideo.Event.AUDIO_GAIN + "=" + "6", ev);
		
		
		//play the file at time 0
		ReactiveNumber next = new ReactiveNumber(1000.0);
		cff = new ConstraintFunction<Input>(jmf, next) {
			public void execute() {
				((JMFVideo) input).stop();
			}
		};
		timeline1.addConstraintFunction(cff);
		*/
		timeline1.play();
		/*
		Timeline<Timeline<Input>> globalTimeline = new Timeline<Timeline<Input>>();
		
		ConstraintFunction<Timeline<Input>> gf = new ConstraintFunction<Timeline<Input>>(timeline1, new ReactiveNumber(0.0)) {
			public void execute() {
				((Timeline<Input>) input).play();
			}
		};
		globalTimeline.addConstraintFunction(gf);
*/
	}

}
