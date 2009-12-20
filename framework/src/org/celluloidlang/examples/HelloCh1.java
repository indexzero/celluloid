package org.celluloidlang.examples;

import java.io.File;
import java.net.MalformedURLException;
import javax.media.Manager;
import org.celluloidlang.core.*;
import org.celluloidlang.devices.*;
import org.celluloidlang.reactive.*;
import org.celluloidlang.announcment.*;
import org.celluloidlang.constraints.buildtin.*;
import org.celluloidlang.constraints.defined.*;
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
		Timeline globalTimeline = new Timeline();

		//timeline timeline1
		Timeline timeline1 = new Timeline();
		
		//need this bastard to display video
		Manager.setHint(Manager.LIGHTWEIGHT_RENDERER, true);
		
		//input audio1 = new AudioFile(*somefile*)
		//output output1 = new Output(*somefile*)
		//JMFVideo is a video and out.
		try {
		JMFAudio audio1 = new JMFAudio(
				new File("acousticgrunge.wav").toURI().toURL());

		//output output1 = new Output(*somefile*)
		
		/*
		 *in timeline1 do 
		 *	play audio1 @start 
		 *end
		 */ 
		timeline1.addConstraintFunction(
			new ConstraintFunction(audio1, new ReactiveNumber(0.0)) {
				public void execute() {
					((JMFAudio) input).play();
				}
			}
		);

		//in output1 do 
		//	play timeline1 @start 
		//end
		
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
				}
				);
		

		globalTimeline.play();
	
		 
		

		} catch (MalformedURLException e) {
			System.err.println("Could not generate URL");
			System.exit(1);
		};
	}

}