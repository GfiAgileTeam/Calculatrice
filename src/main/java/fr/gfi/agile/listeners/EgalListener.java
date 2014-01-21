package fr.gfi.agile.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import fr.gfi.agile.Calculatrice;

public class EgalListener implements ActionListener {

	private JLabel labelResultat;
	private Calculatrice calculatrice;

	public EgalListener(Calculatrice calculatrice,JLabel resultat) {
		super();
		this.labelResultat = resultat;
		this.calculatrice = calculatrice;
	}

	public void actionPerformed(ActionEvent e) {

		double resultat = calculatrice.egal();
		labelResultat.setText(String.valueOf(resultat));
	}

}
