package renderers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import renderers.Menu;

public class Window {
	
	JFrame frame;
	static JButton button;
	
	public JFrame getFrame() {
		return frame;
	}

	public Window(int width, int height) {
		frame = new JFrame("Lắc con chị mầy, học hành không lo, lo lắc");
		frame.setSize(width, height);
		frame.setLayout(null);
		button = new JButton("ADSAD");
		button.setBounds(100, 100, 200, 40);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.setVisible(false);
			}
		});
		frame.add(button);
	}
	
	public void show() {
		frame.setVisible(true);
	}

}
