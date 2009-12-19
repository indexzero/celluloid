package org.celluloidlang.examples;

import java.io.File;
import java.net.MalformedURLException;

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
		audio1.AudioLevel=3  @3seconds
		when audio1.AudioLevel=3 do
			play audio2 @start
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
		
		
		
		//timeline timeline1
		Timeline<Input> timeline1 = new Timeline<Input>();
		
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
			new ConstraintFunction<Input>(audio1, new ReactiveNumber(0.0)) {
				public void execute() {
					((JMFVideo) input).play();
				}
			}
		);

		timeline1.addConstraintFunction(
				new ConstraintFunction<Input>(audio1, new ReactiveNumber(3000.0)) {
					public void execute() {
						((JMFVideo) input).setVolumeLevel("2");
					}
				}
			);
		
		//when AudioGain=2 do
		// play audio2
		timeline1.addEventFunction(audio1, "AUDIO_GAIN" + "=" + "2",
				new EventFunction<Input>(audio2) {
					public void execute() {
						((JMFVideo) input).play();
					}
				}
			);
		
		
		
		
		
		timeline1.play();
		
		
		/**
		
		
		//when AudioGain=2 unless !audio1.isPlaying || audio3.isplaying do
		// play audio2
		timeline1.addEventFunction(audio1+":" + JMFVideo.Event.AUDIO_GAIN + "=" + "2",
				new EventFunction<Input>(audio2, audio1, audio3) {
					public void execute() {
						if(evals[0].isPlaying || evals[1].isPlaying)
							((JMFVideo) input).play();
					}
				}
			);
		
		
		//every @10 if audio1.isStopped
		timeline1.addEveryFunction(new ReactiveNumber(10.0),
				new EventFunction<Input>(audio2, audio1) {
					public void execute() {
						if(args[0].isStopped)
							((JMFVideo) input).play();
					}
				}
			);
		
	*/
		} catch (MalformedURLException e) {
			System.err.println("Could not generate URL");
			System.exit(1);
		};
	}

}
