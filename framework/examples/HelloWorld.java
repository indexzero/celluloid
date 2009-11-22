package org.celluloidlang.examples;

import java.util.Observable;

import com.celluloidlang.core.Timeline;
import com.celluloidlang.core.Video;

public class HelloWorld {
	public static void main(String[] args) {

		Timeline timeline1 = new Timeline();
		AudioFile audio1 = new AudioFile("file1.wav");
		Video output1 = new Video("speakers");
		AVOutput video1 = new AVOutput("speaker", "video");
		timeline1.addConstraint("play", audio1, 0);
		timeline1.play(output1, monitor1);
		
		Observer myObserver = new Observer();
	}

}
