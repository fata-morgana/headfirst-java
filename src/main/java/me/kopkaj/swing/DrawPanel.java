package me.kopkaj.swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		Random rand = new Random();
		
		int red = rand.nextInt(256);
		int green = rand.nextInt(256);
		int blue = rand.nextInt(256);
		
		Color startColor = new Color(red, green, blue);
		
		red = rand.nextInt(256);
		green = rand.nextInt(256);
		blue = rand.nextInt(256);
		
		Color endColor = new Color(red, green, blue);
		
		GradientPaint gradientPaint = new GradientPaint(70, 70, startColor, 150, 150, endColor);
		g2d.setPaint(gradientPaint);
		g2d.fillOval(70, 70, 100, 100);
	}
}
