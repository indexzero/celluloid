package org.celluloidlang.examples;

import java.io.File;
import java.net.MalformedURLException;

import javax.media.Manager;

import org.celluloidlang.constraints.defined.Input;
import org.celluloidlang.core.*;
import org.celluloidlang.devices.JMFVideo;
import org.celluloidlang.reactive.ReactiveNumber;
/**
 *
	Language Tutorial -- Events
	
	
	timeline timeline1
	input audio1 = new AudioFile(*somefile*)
	input audio2 = new AudioFile(*somefile*)
	output output1 = new Output(*somefile*)
	
	in timeline1 do 
		play audio1 @start
		when audio1.STATUS=STOPPED do
			play audio2
		end
		every @10s if video1 PLAYING do
		    play video5
		end
	end
	
	in output1 do 
		play timeline1 @start 
	end
 *
 *
 */
public class HelloEvents {
	public static void main(String[] args) {

	    Timeline globalTimeline = new Timeline();
		
		//need this bastard to display video
		Manager.setHint(Manager.LIGHTWEIGHT_RENDERER, true);
		
		//timeline timeline1
		Timeline timeline1 = new Timeline();
		
		//input audio1 = new AudioFile(*somefile*)
		//output output1 = new Output(*somefile*)
		//JMFVideo is a video and out.
		try {
		JMFVideo audio1 = new JMFVideo(
				new File("acousticgrunge.wav").toURI().toURL());

		//output output1 = new Output(*somefile*)
		//input audio2 = new AudioFile(*somefile*) 

		JMFVideo audio2 = new JMFVideo(
				new File("playme.wav").toURI().toURL());
		/*
		 *in timeline1 do 
		 *	play audio1 @start 
		 *end
		 */ 
		timeline1.addConstraintFunction(
			new ConstraintFunction(audio1, new ReactiveNumber(0.0)) {
				public void execute() {
					((JMFVideo) input).play();
				}
			}
		);


		//when audio1.STATUS=stopped do
		// play audio2
		timeline1.addEventFunction(audio1, "STATUS=STOPPED",
				new EventFunction(audio2) {
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
                                  				}
                                  				);


                                  		globalTimeline.play();


		

		} catch (MalformedURLException e) {
			System.err.println("Could not generate URL");
			System.exit(1);
		};
	}

}
