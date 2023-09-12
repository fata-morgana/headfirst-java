package me.kopkaj.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TwoButtons {
	private JFrame frame;
	private JLabel label;
	
	public static void main(String[] args) {
		TwoButtons main = new TwoButtons();
		main.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton labelButton = new JButton("Change label");
		labelButton.addActionListener(new LabelListener());
		
		JButton colorButton = new JButton("Change color");
		colorButton.addActionListener(new ColorListener());
		
		label = new JLabel("Look at me");
		DrawPanel drawPanel = new DrawPanel();
		
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		
		frame.setSize(480, 320);
		frame.setVisible(true);
		
	}
	
	class LabelListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Random rand = new Random();
			int randNum = rand.nextInt(3);
			
			if (randNum == 0) {
				label.setText("I");
			}
			else if (randNum == 1) {
			    label.setText("My");
			}
			else {
				label.setText("Me");
			}
		}
	}
	
	class ColorListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			frame.repaint();
		}
	}
}
