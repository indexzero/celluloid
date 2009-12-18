package org.celluloidlang.devices;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.celluloidlang.constraints.defined.Output;

public class SwingOutput implements Output {

	private JFrame frame;
	private JPanel output;
	
	public SwingOutput() {
		frame = new JFrame("Celluloid Output");
		output = new JPanel();
		frame.add(output);
	}
	
	public JPanel getPanel() {
		return output;
	}
}
