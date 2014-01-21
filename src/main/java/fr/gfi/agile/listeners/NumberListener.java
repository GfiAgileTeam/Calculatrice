package fr.gfi.agile.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class NumberListener implements ActionListener {

	private JLabel labelResultat;

	public NumberListener(JLabel resultat) {
		super();
		this.labelResultat = resultat;
	}

	public void actionPerformed(ActionEvent e) {

		String valeurBouton = ((JButton) e.getSource()).getText();
		String text = this.labelResultat.getText();
		text += valeurBouton;
		labelResultat.setText(text);
	}

}
