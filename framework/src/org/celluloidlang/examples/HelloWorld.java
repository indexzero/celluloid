package org.celluloidlang.examples;

import org.celluloidlang.core.*;
import org.celluloidlang.devices.AudioFile;

public class HelloWorld {
	public static void main(String[] args) {

		Timeline timeline1 = new Timeline();
		AudioFile audio1 = new AudioFile("file1.wav");
		
		//play the file at time 0
		ConstraintFunction cf = new ConstraintFunction(audio1, 0) {
			public void execute() {
				input.play(0);
			}
		};
		timeline1.addConstraintFunction(cf);
		
		//play timeline on output

	}

}
