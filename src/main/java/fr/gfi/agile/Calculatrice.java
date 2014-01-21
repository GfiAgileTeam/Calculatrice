package fr.gfi.agile;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.gfi.agile.listeners.AdditionListener;
import fr.gfi.agile.listeners.EgalListener;
import fr.gfi.agile.listeners.NumberListener;
import fr.gfi.agile.listeners.SoustraireListener;

public class Calculatrice {

	private static JLabel RESULTAT = new JLabel("");
	
	public Calculatrice() {
		super();
		creerCalculatrice();
	}

	public void creerCalculatrice() {

		// 1. Create the frame.
		JFrame fenetreCalculatrice = new JFrame("Calculatrice");

		// 2. Optional: What happens when the frame closes?
		fenetreCalculatrice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Create components and put them in the frame.

		GridLayout grilleGlobale = new GridLayout(2, 1);
		JPanel panelGlobal = new JPanel(grilleGlobale);

		JPanel panelResultat = new JPanel();

		// ...create emptyLabel...
		panelResultat.add(RESULTAT);

		panelGlobal.add(panelResultat);
		// verticalLayout.addLayoutComponent("resultat", resultat);

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

		ActionListener numberListener = new NumberListener(RESULTAT);

		boutonZero.addActionListener(numberListener);
		boutonUn.addActionListener(numberListener);
		boutonDeux.addActionListener(numberListener);
		boutonTrois.addActionListener(numberListener);
		boutonQuatre.addActionListener(numberListener);
		boutonCinq.addActionListener(numberListener);
		boutonSix.addActionListener(numberListener);
		boutonSept.addActionListener(numberListener);
		boutonHuit.addActionListener(numberListener);
		boutonNeuf.addActionListener(numberListener);

		JButton boutonAddition = new JButton("+");
		JButton boutonSoustraire = new JButton("-");
		JButton boutonMultiplication = new JButton("*");
		JButton boutonEqual = new JButton("=");

		AdditionListener additionListener = new AdditionListener();
		boutonAddition.addMouseListener(additionListener);

		GridLayout grilleLayout = new GridLayout(4, 4);

		JPanel panelBoutons = new JPanel(grilleLayout);
		// Ligne 1
		panelBoutons.add(boutonSept);
		panelBoutons.add(boutonHuit);
		panelBoutons.add(boutonNeuf);
		panelBoutons.add(boutonAddition);

		// Ligne 2
		panelBoutons.add(boutonQuatre);
		panelBoutons.add(boutonCinq);
		panelBoutons.add(boutonSix);
		panelBoutons.add(boutonMultiplication);

		// Ligne 3
		panelBoutons.add(boutonUn);
		panelBoutons.add(boutonDeux);
		panelBoutons.add(boutonTrois);
		panelBoutons.add(boutonSoustraire);

		// Ligne 4
		panelBoutons.add(boutonZero);
		panelBoutons.add(new JLabel());
		panelBoutons.add(new JLabel());
		panelBoutons.add(boutonEqual);

		panelGlobal.add(panelBoutons);
		fenetreCalculatrice.add(panelGlobal);

		ActionListener egalListener = new EgalListener(RESULTAT);

		boutonEqual.addActionListener(egalListener);

		ActionListener listenerSoustraire = new SoustraireListener(RESULTAT);
		boutonSoustraire.addActionListener(listenerSoustraire);

		// 4. Size the frame.
		fenetreCalculatrice.pack();

		// 5. Show it.
		fenetreCalculatrice.setVisible(true);

	}

	/**
	 * 
	 * @param double i
	 * @param double j
	 * @return double
	 */
	public static double soustraire(double i, double j) {
		return i - j;
	}

	public double egal() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static String getResultat() {
		return RESULTAT.getText();
	}
	
	public static void setResultat(String resultat) {
		RESULTAT.setText(resultat);
	}

}
