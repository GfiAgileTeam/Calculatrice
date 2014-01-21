package fr.gfi.agile;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculatrice {

	public static void main(String[] args) {
		
		//1. Create the frame.
		JFrame fenetreCalculatrice = new JFrame("Calculatrice");

		//2. Optional: What happens when the frame closes?
		fenetreCalculatrice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//3. Create components and put them in the frame.
		
		//...create emptyLabel...
		JLabel emptyLabel = new JLabel("Hello World !!!");
			
		JButton boutonZero = new JButton("0");
		JButton boutonUn = new JButton("1");
		JButton boutonDeux = new JButton("2");
		JButton boutonTrois = new JButton("3");
		JButton boutonQuatre = new JButton("4");
		JButton boutonCinq = new JButton("5");
		JButton boutonSix = new JButton("6");
		JButton boutonSept = new JButton("7");
		JButton boutonHuit = new JButton("8");
		JButton boutonNeuf = new JButton("9");
		
		GridLayout grilleLayout = new GridLayout(1,10);
		JPanel panel = new JPanel(grilleLayout);
		fenetreCalculatrice.add(panel);
		panel.add(boutonZero);
		panel.add(boutonUn);
		panel.add(boutonDeux);
		panel.add(boutonTrois);
		panel.add(boutonQuatre);
		panel.add(boutonCinq);
		panel.add(boutonSix);
		panel.add(boutonSept);
		panel.add(boutonHuit);
		panel.add(boutonNeuf);

		//4. Size the frame.
		fenetreCalculatrice.pack();

		//5. Show it.
		fenetreCalculatrice.setVisible(true);

	}

	public static double additionner(double i, double j) {
		return i+j;
	}
	

}
