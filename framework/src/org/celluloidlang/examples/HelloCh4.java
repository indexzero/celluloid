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
	Language Tutorial -- Chapter 4
	
	
timeline timeline1

input video1 = new Video(*some video device key*)
input video2 = new Video(*some video device key*)
input video3 = new Video(*some video device key*)
input video4 = new Video(*some video device key*)
input video5 = new Video(*some video device key*)
input video6 = new Video(*some video device key*)
input video7 = new Video(*some video device key*)
input video8 = new Video(*some video device key*)

output output1 = new Video(*some display*)
in timeline1 do
	size video1 0, 0, .5, 0
	size video2 .5, 0, 1, 0
	size video3 0, .5, .5, 1
	size video4 .5, .5, 1, 1
	
	play all @start
	
	size video5 0, 0, .5, 0
	size video6 .5, 0, 1, 0
	
	size video7 0, .5, .5, 1
	size video8 .5, .5, 1, 1
	 
	# quadrant 1
	every @10s when video1.isPlaying do
		play video5 @now
	end
	
	every @10s when video5.isPlaying do
		play video1 @now
	end
	
	#quadrant 2
	
	every @10s when video2.isPlaying do
		play video6 @now
	end
	
	every @10s when video6.isPlaying do
		play video2 @now
	end
	
	#quadrant 3
	every @10s when video3.isPlaying do
		play video7 @now
	end
	
	every @10s when video7.isPlaying do
		play video3 @now
	end
	
	#quadrant 4
	
	every @10s when video4.isPlaying do
		play video8 @now
	end
	every @10s when video8.isPlaying do
		play video4 @now
	end
end

in output1 do
	play timeline1 @start
end
 *
 *
 */
public class HelloCh4 {
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

		JMFVideo video5 = new JMFVideo(
				new File("lostinspace.7.160x120.11khz.mov").toURI().toURL());

		
		
		/*
every @10s when video1.isPlaying do
		play video5 @now
	end
		 */ 
		timeline1.addEveryFunction(
			new EveryFunction(new ReactiveNumber(0.0), video1, video5) {
				public void execute() {
					if(evals[0].isPlaying())
						((JMFVideo) input).play();
				}
			});
		

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
