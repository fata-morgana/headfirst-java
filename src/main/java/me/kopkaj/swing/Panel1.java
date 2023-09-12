package me.kopkaj.swing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel1 {
	public static void main(String[] args) {
		Panel1 gui = new Panel1();
		gui.go();
	}
	
	public void go() {
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JButton button = new JButton("Shock me");
		panel.add(button);
		JButton anotherButton = new JButton("bliss");
		panel.add(anotherButton);
		JButton yetAnotherButton = new JButton("huh");
		panel.add(yetAnotherButton);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
