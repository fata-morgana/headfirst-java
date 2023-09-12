package me.kopkaj.swing;

import javax.swing.*;

public class SimpleGui1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton clickMeButton = new JButton("Click me");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(clickMeButton);
		
		frame.setSize(300, 300);
		
		frame.setVisible(true);
	}
}
