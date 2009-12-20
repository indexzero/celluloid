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

public class HelloWorld {
	
	public static void main(String[] args) {

		/*
		 * This is the one and only global timeline.
		 * 
		 * THIS IS REQUIRED: global timeline is required, see the bottom
		 * for the details
		 */
		Timeline globalTimeline = new Timeline();
		
		//need this bastard to display video
		//THIS IS REQUIRED
		Manager.setHint(Manager.LIGHTWEIGHT_RENDERER, true);
		
		//this is a timeline defined in source.cld
		Timeline timeline1 = new Timeline();
		
		SwingOutput output1 = new SwingOutput("Celluloid Output", 1024, 768);
		
		//this is an input defined in source.cld
		JMFVideo jmf, jmf2;
		try {
			jmf = new JMFVideo(new File("lostinspace.7.160x120.11khz.mov").toURI().toURL());
			jmf2 = new JMFVideo(new File("darkcity.7.160x120.11khz.mov").toURI().toURL());
		} catch (MalformedURLException e) {
			System.err.println("Could not generate URL");
			return;
		}
		
		//play the file at time 0 (MUST BE IN MILLISECONDS)
		timeline1.addConstraintFunction(new ConstraintFunction(jmf, new ReactiveNumber(0000.0)) {
			public void execute() {
				((JMFVideo) input).play();
			}
		});
		
		timeline1.addConstraintFunction(new ConstraintFunction(jmf2, new ReactiveNumber(8000.0)) {
			public void execute() {
				((JMFVideo) input).play();
			}
		});
		
		/* when you come across a block such as:
		 * in output1 do
		 * 	play timeline1 @start
		 * end
		 * 
		 * you have to do two things, both in anonymous classes:
		 * 
		 * timeline1.attachOutput(output1);
		 * timeline1.play();
		 * 
		 * Basically, look at the following code, which corresponds to the celluloid
		 * code I just used, like 8 lines above this one
		 */
		globalTimeline.addConstraintFunction(new OutputConstraintFunction(timeline1, output1, new ReactiveNumber(0.0)) {
			public void execute() {
				((Timeline) input).attachOutput(output);
			}
		});
		
		globalTimeline.addConstraintFunction(new ConstraintFunction(timeline1, new ReactiveNumber(0.0)) {
			public void execute() {
				((Timeline) input).play();
			}
		});
		
		/*
		 * EXECUTION BEGINS HERE
		 */
		globalTimeline.play();
	}

}
