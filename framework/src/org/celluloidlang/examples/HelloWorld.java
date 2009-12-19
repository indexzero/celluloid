package org.celluloidlang.examples;

import java.io.File;
import java.net.MalformedURLException;

import org.celluloidlang.constraints.defined.Input;
import org.celluloidlang.core.*;
import org.celluloidlang.devices.JMFVideo;
import org.celluloidlang.devices.SwingOutput;
import org.celluloidlang.reactive.ReactiveNumber;

public class HelloWorld {
	public static void main(String[] args) {

		Timeline<Input> timeline1 = new Timeline<Input>();
		
		File file = new File("snagItNarration.avi");
		JMFVideo jmf;
		try {
			jmf = new JMFVideo(file.toURI().toURL());
		} catch (MalformedURLException e) {
			System.err.println("Could not generate URL");
			return;
		}
		
		//play the file at time 0 (MUST BE IN MILLISECONDS)
		ReactiveNumber start = new ReactiveNumber(0000.0);
		ConstraintFunction<Input> cf = new ConstraintFunction<Input>(jmf, start) {
			public void execute() {
				((JMFVideo) input).play();
			}
		};
		timeline1.addConstraintFunction(cf);
		
		//ffwd at time 2
		start = new ReactiveNumber(2000.0);
		cf = new ConstraintFunction<Input>(jmf, start) {
			public void execute() {
				((JMFVideo) input).ffwd(new ReactiveNumber(2.0));
			}
		};
		timeline1.addConstraintFunction(cf);
		
		//ffwd rate back to 1
		start = new ReactiveNumber(4000.0);
		cf = new ConstraintFunction<Input>(jmf, start) {
			public void execute() {
				((JMFVideo) input).ffwd(new ReactiveNumber(1.0));
			}
		};
		timeline1.addConstraintFunction(cf);
		
		start = new ReactiveNumber(6000.0);
		cf = new ConstraintFunction<Input>(jmf, start) {
			public void execute() {
				((JMFVideo) input).play();
			}
		};
		timeline1.addConstraintFunction(cf);
		
		//this is an event, like a when keyword event
		/*
		EventFunction<Input> ev = new EventFunction<Input>(jmf) {
			public void execute() {
				((JMFVideo) input).play();
			}
		};
		timeline1.addEventConstraint(jmf+":" + JMFVideo.Event.AUDIO_GAIN + "=" + "6", ev);
		*/
		
		//output size
		SwingOutput output1 = new SwingOutput("Celluloid Output", 1024, 768);
		
		OutputConstraintFunction<Timeline<Input>> ocf = new OutputConstraintFunction<Timeline<Input>>(timeline1, output1, new ReactiveNumber(0.0)) {
			public void execute() {
				((Timeline<Input>) input).attachOutput(output);
			}
		};
		
		/*
		 * This is the one and only global timeline.  Everything starts execution from
		 * this point.
		 */
		Timeline<Timeline<Input>> globalTimeline = new Timeline<Timeline<Input>>();
		
		ConstraintFunction<Timeline<Input>> gf = new ConstraintFunction<Timeline<Input>>(timeline1, new ReactiveNumber(0.0)) {
			public void execute() {
				((Timeline<Input>) input).play();
			}
		};
		globalTimeline.addConstraintFunction(gf);
		globalTimeline.addConstraintFunction(ocf);
		
		/*
		 * EXECUTION BEGINS HERE
		 */
		globalTimeline.play();
	}

}
