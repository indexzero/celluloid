package org.celluloidlang.devices;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

import org.celluloidlang.constraints.defined.Output;

/**
 * Basic output type, a Swing frame.  This is able to display JMFVideos.
 */
public class SwingOutput implements Output {

	public JFrame frame;
	
	/**
	 * Constructor
	 * @param title title of the frame
	 * @param width width of the frame
	 * @param height height of the frame
	 */
	public SwingOutput(String title, int width, int height) {
		frame = new JFrame(title);
		frame.setLayout(new GridLayout());
		frame.setBackground(Color.black);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
