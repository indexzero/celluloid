package org.celluloidlang.examples;

import java.util.Observable;

import org.celluloidlang.core.Timeline;
import org.celluloidlang.core.VideoOut;

public class HelloWorld {
	public static void main(String[] args) {

		Timeline timeline1 = new Timeline();
		AudioFile audio1 = new AudioFile("file1.wav");
		VideoOut output1 = new VideoOut("monitor");

		timeline1.addConstraint("play", audio1, 0);
		timeline1.play(output1, output1);

	}

}
