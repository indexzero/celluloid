package org.celluloidlang.examples;

import java.io.File;
import java.net.MalformedURLException;

import javax.media.Manager;

import org.celluloidlang.constraints.defined.Input;
import org.celluloidlang.core.*;
import org.celluloidlang.devices.JMFVideo;
import org.celluloidlang.devices.SwingOutput;
import org.celluloidlang.reactive.ReactiveNumber;
/**
 *
	Language Tutorial -- Chapter 3
	
	timeline timeline1
	
	input video1 = new VideoFile(*some file*)
	input video2 = new VideoFile(*some file*)
	input video3 = new VideoFile(*some file*)
	input video4 = new VideoFile(*some file*)
	output output1 = new Video(*some display*)
	 
	 in timeline1 do
		size video1 0, 0, .5, 0
		size video2 .5, 0, 1, 0
		size video3 0, .5, .5, 1
		size video4 .5, .5, 1, 1
		play all @start
	end
	
	in output1 do
		play timeline1 @start
	end
 *
 *
 */
public class HelloCh3 {
	public static void main(String[] args) {
		Timeline globalTimeline = new Timeline();
		//timeline timeline1
		Timeline timeline1 = new Timeline();
		
		//need this bastard to display video
		Manager.setHint(Manager.LIGHTWEIGHT_RENDERER, true);
		
		//input audio1 = new AudioFile(*somefile*)
		//output output1 = new Output(*somefile*)
		//JMFVideo is a video and out.
		try {
		JMFVideo video1 = new JMFVideo(
				new File("lostinspace.7.160x120.11khz.mov").toURI().toURL());
		
		
		timeline1.addConstraintFunction(
				new ConstraintFunction(video1, new ReactiveNumber(0.0)) {
					public void execute() {
						((JMFVideo) input).size(0,0,500,500);
					}
				}
			);
		
		
		/*
		 *in timeline1 do 
		 *	play audio1 @start 
		 *end
		 */ 
		timeline1.addConstraintFunction(
				new ConstraintFunction(video1, new ReactiveNumber(0.0)) {
					public void execute() {
						((JMFVideo) input).play();
					}
				}
			);
		

		globalTimeline.addConstraintFunction(
				new ConstraintFunction(timeline1, new ReactiveNumber(0.0)) {
					public void execute() {
						((Timeline) input).play();
					}
				}
		);
		globalTimeline.addConstraintFunction(
				 new OutputConstraintFunction(
						timeline1, 
						new SwingOutput("Celluloid Output", 1024, 768), 
						new ReactiveNumber(0.0)) {
							public void execute() {
								((Timeline) input).attachOutput(output);
							}
				});
		globalTimeline.play();
		
		

		} catch (MalformedURLException e) {
			System.err.println("Could not generate URL");
			System.exit(1);
		};
	}

}
