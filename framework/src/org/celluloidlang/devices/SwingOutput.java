package org.celluloidlang.devices;

import java.awt.Color;

import javax.swing.JFrame;
import org.celluloidlang.constraints.defined.Output;

public class SwingOutput implements Output {

	public JFrame frame;
	
	public SwingOutput(String title, int width, int height) {
		frame = new JFrame(title);
		frame.setLayout(null);
		frame.setBackground(Color.black);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, width, height);
	}
}
