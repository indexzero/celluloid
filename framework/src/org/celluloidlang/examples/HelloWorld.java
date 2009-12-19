package org.celluloidlang.examples;

import java.io.File;
import java.net.MalformedURLException;

import org.celluloidlang.core.*;
import org.celluloidlang.devices.JMFVideo;
import org.celluloidlang.devices.SwingOutput;
import org.celluloidlang.reactive.ReactiveNumber;

public class HelloWorld {
	public static void main(String[] args) {

		Timeline timeline1 = new Timeline();
		
		File file = new File("june_chorus.wav");
		JMFVideo jmf;
		try {
			jmf = new JMFVideo(file.toURI().toURL());
		} catch (MalformedURLException e) {
			System.err.println("Could not generate URL");
			return;
		}
		
		//play the file at time 0 (MUST BE IN MILLISECONDS)
		ReactiveNumber start = new ReactiveNumber(0000.0);
		ConstraintFunction cf = new ConstraintFunction(jmf, start) {
			public void execute() {
				((JMFVideo) input).play();
			}
		};
		timeline1.addConstraintFunction(cf);
		
		//ffwd at time 2
		start = new ReactiveNumber(2000.0);
		cf = new ConstraintFunction(jmf, start) {
			public void execute() {
				((JMFVideo) input).ffwd(new ReactiveNumber(2.0));
			}
		};
		timeline1.addConstraintFunction(cf);
		
		//ffwd rate back to 1
		start = new ReactiveNumber(4000.0);
		cf = new ConstraintFunction(jmf, start) {
			public void execute() {
				((JMFVideo) input).ffwd(new ReactiveNumber(1.0));
			}
		};
		timeline1.addConstraintFunction(cf);
		
		start = new ReactiveNumber(6000.0);
		cf = new ConstraintFunction(jmf, start) {
			public void execute() {
				((JMFVideo) input).play();
			}
		};
		timeline1.addConstraintFunction(cf);
		
		//this is an event, like a when keyword event
		
		EventFunction ev = new EventFunction(jmf) {
			public void execute() {
				((JMFVideo) input).play();
			}
		};
		
		
		EveryFunction eff = new EveryFunction(new ReactiveNumber((float)1000), jmf)  {
			public void execute() {
				((JMFVideo) input).play();
			}
		};
		
		timeline1.addEveryFunction(eff);
		
		EveryFunction efff = new EveryFunction(new ReactiveNumber((float)2000), jmf)  {
			public void execute() {
				((JMFVideo) input).stop();
			}
		};
		
		timeline1.addEveryFunction(efff);
		
		//output size
		SwingOutput output1 = new SwingOutput("Celluloid Output", 1024, 768);
		
		OutputConstraintFunction ocf = new OutputConstraintFunction(timeline1, output1, new ReactiveNumber(0.0)) {
			public void execute() {
				((Timeline) input).attachOutput(output);
			}
		};
		
		/*
		 * This is the one and only global timeline.  Everything
		 */
		Timeline globalTimeline = new Timeline();
		
		ConstraintFunction gf = new ConstraintFunction(timeline1, new ReactiveNumber(0.0)) {
			public void execute() {
				((Timeline) input).play();
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
