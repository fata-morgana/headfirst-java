package me.kopkaj.swing;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BeatBox {
	private ArrayList<JCheckBox> beatList;
	private Sequencer sequencer;
	private Sequence sequence;
	private Track track;
	
	String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat",
			"Acoustic Snare", "Crash Cymbal", "Hand Clap", "High Tom", "Hi Bongo",
			"Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap", 
			"Low-mid Tom", "Hight Agogo"};
	
	int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};
	
	public static void main(String[] args) {
		new BeatBox().buildGui();
	}
	
	public void buildGui() {
		JFrame frame = new JFrame("Cyber BeatBox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout layout = new BorderLayout();
		JPanel background = new JPanel(layout);
		background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	}
}
