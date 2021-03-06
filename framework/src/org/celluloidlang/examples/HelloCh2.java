package org.celluloidlang.examples;

import java.io.File;
import java.net.MalformedURLException;

import javax.media.Manager;

import org.celluloidlang.constraints.defined.Input;
import org.celluloidlang.core.*;
import org.celluloidlang.devices.JMFAudio;
import org.celluloidlang.devices.JMFVideo;
import org.celluloidlang.devices.SwingOutput;
import org.celluloidlang.reactive.ReactiveNumber;
/**
 *
	Language Tutorial -- Chapter 2
		
	timeline timeline1
	input audio1 = new AudioFile(*some file*) 
	
	input audio2 = new AudioFile(*somefile*) 
	output output1 = new Audio(*some device key*)
	
	in timeline1 do 
		play audio1 @start 
		pause audio1 @1m 
		play audio2 @1m 	
		stop audio2 @2m 
		play audio1	@2m 
	end
	
	
	in output1 do 
	play timeline1 @start 
	end
 *
 *
 */
public class HelloCh2 {
	public static void main(String[] args) {
		Timeline globalTimeline = new Timeline();
		//timeline timeline1
		Timeline timeline1 = new Timeline();
		
		//need this bastard to display video
		Manager.setHint(Manager.LIGHTWEIGHT_RENDERER, true);
		
		//input audio1 = new AudioFile(*somefile*)
		try {
		JMFAudio audio1 = new JMFAudio(
				new File("acousticgrunge.wav").toURI().toURL());

		//input audio2 = new AudioFile(*somefile*) 

		JMFAudio audio2 = new JMFAudio(
				new File("playme.wav").toURI().toURL());
		//TODO: output output1 = new Output(*somefile*)
		//
		
		/*
		 *in timeline1 do 
		 *	play audio1 @start 
		 *end
		 */ 
		timeline1.addConstraintFunction(
			new ConstraintFunction(audio1, new ReactiveNumber(0.0)) {
				public void execute() {
					((JMFAudio) input).play();
					System.out.println("Testing nararation");
				}
			}
		);
		
		//pause audio1 @1s 
		timeline1.addConstraintFunction(
				new ConstraintFunction(audio1, new ReactiveNumber(1000.0)) {
					public void execute() {
						((JMFAudio) input).pause();
					}
				}
			);
		//play audio2 @1s 
		timeline1.addConstraintFunction(
				new ConstraintFunction(audio2, new ReactiveNumber(1000.0)) {
					public void execute() {
						((JMFAudio) input).play();
					}
				}
			);
		//stop audio2 @2s 
		timeline1.addConstraintFunction(
				new ConstraintFunction(audio2, new ReactiveNumber(2000.0)) {
					public void execute() {
						((JMFAudio) input).stop();
					}
				}
			);
		//play audio1 @2s 
		timeline1.addConstraintFunction(
				new ConstraintFunction(audio1, new ReactiveNumber(2000.0)) {
					public void execute() {
						((JMFAudio) input).play();
					}
				});

		
		//add to global timeline
		globalTimeline.addConstraintFunction(
				new ConstraintFunction(timeline1, new ReactiveNumber(0.0)) {
					public void execute() {
						((Timeline) input).play();
					}
				});
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
		}
	}

}
