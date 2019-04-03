package renderers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu{
	static final int WIDTH = 200;
	static final int HEIGHT = 40;
	
	JFrame mainFrame;
	JButton startBtn;
	JButton settingsBtn;
	JButton exitBtn;
	
	public Menu(JFrame frame, ActionListener start, ActionListener settings) {
		mainFrame = frame;
		
		startBtn = new JButton("START");
		settingsBtn = new JButton("SETTINGS");
		exitBtn = new JButton("EXIT!");
		
		startBtn.setBounds(
				frame.getWidth() / 2 - WIDTH / 2, 
				frame.getHeight() / 2 - 100,
				WIDTH,
				HEIGHT);
		
		settingsBtn.setBounds(
				frame.getWidth() / 2 - WIDTH / 2, 
				frame.getHeight() / 2,
				WIDTH,
				HEIGHT);
		
		exitBtn.setBounds(
				frame.getWidth() / 2 - WIDTH / 2, 
				frame.getHeight() / 2 + 100,
				WIDTH,
				HEIGHT);
		
		startBtn.addActionListener(start);
		settingsBtn.addActionListener(settings);
		exitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void show() {
		mainFrame.add(startBtn);
		mainFrame.add(settingsBtn);
		mainFrame.add(exitBtn);
	}
	
	public void close() {
		mainFrame.remove(startBtn);
		mainFrame.remove(settingsBtn);
		mainFrame.remove(exitBtn);
	}

}
