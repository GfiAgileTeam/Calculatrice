package fr.gfi.agile.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import fr.gfi.agile.Calculatrice;
import fr.gfi.agile.metier.ManagerOperations;

public class EgalListener implements ActionListener {

	private JLabel labelResultat;

	public EgalListener(JLabel resultat) {
		super();
		this.labelResultat = resultat;
	}

	public void actionPerformed(ActionEvent e) {

		double resultat = ManagerOperations.egal();
		labelResultat.setText(String.valueOf(resultat));
	}

}
