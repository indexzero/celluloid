package org.celluloidlang.examples;

import java.io.File;
import java.net.MalformedURLException;

import org.celluloidlang.constraints.defined.Input;
import org.celluloidlang.core.*;
import org.celluloidlang.devices.JMFVideo;
import org.celluloidlang.reactive.ReactiveNumber;
/**
 *
	Language Tutorial -- Chapter 1
	
	
	timeline timeline1
	input audio1 = new AudioFile(*somefile*)
	output output1 = new Output(*somefile*)
	
	in timeline1 do 
		play audio1 @start 
	end
	in output1 do 
		play timeline1 @start 
	end
 *
 *
 */
public class HelloCh1 {
	public static void main(String[] args) {

		//timeline timeline1
		Timeline<Input> timeline1 = new Timeline<Input>();
		
		//input audio1 = new AudioFile(*somefile*)
		//output output1 = new Output(*somefile*)
		//JMFVideo is a video and out.
		try {
		JMFVideo audio1 = new JMFVideo(
				new File("01 Viva la Vida.mp3").toURI().toURL());

		//output output1 = new Output(*somefile*)
		
		/*
		 *in timeline1 do 
		 *	play audio1 @start 
		 *end
		 */ 
		timeline1.addConstraintFunction(
			new ConstraintFunction<Input>(audio1, new ReactiveNumber(0.0)) {
				public void execute() {
					((JMFVideo) input).play();
				}
			}
		);
		
		timeline1.play();
		

		} catch (MalformedURLException e) {
			System.err.println("Could not generate URL");
			System.exit(1);
		};
	}

}
