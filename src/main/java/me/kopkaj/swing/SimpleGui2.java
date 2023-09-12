package me.kopkaj.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleGui2 {
	private JButton clickMeButton;
	
	public static void main(String[] args) {
		SimpleGui2 self = new SimpleGui2();
		self.go();
	}
  
	public void go() {
		JFrame frame = new JFrame();
		clickMeButton = new JButton("Click me");
		clickMeButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.repaint();
			}
		});
		JPanel drawPanel = new DrawPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.SOUTH, clickMeButton);
		
		frame.setSize(400, 400);
		
		frame.setVisible(true);
	}
}
