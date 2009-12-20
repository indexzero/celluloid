package org.celluloidlang.devices;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

import org.celluloidlang.constraints.defined.Output;

public class SwingOutput implements Output {

	public JFrame frame;
	
	public SwingOutput(String title, int width, int height) {
		frame = new JFrame(title);
		frame.setLayout(new GridLayout());
		frame.setBackground(Color.black);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
	}
}
