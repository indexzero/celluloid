package org.celluloidlang.examples;

import java.util.Observable;

import org.celluloidlang.core.*;
import org.celluloidlang.devices.AudioFile;

public class HelloWorld {
	public static void main(String[] args) {

		final Timeline timeline1 = new Timeline();
		final AudioFile audio1 = new AudioFile("file1.wav");
		
		//play audio1 at 30 seconds
		ConstraintFunction audio1cf = new ConstraintFunction(30000) {
			public void execute() {
				audio1.play();
			}
		};
		timeline1.addConstraintFunction(audio1cf);
		
		//timeline1.play(output1, output1);

	}

}
