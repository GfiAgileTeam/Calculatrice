package fr.gfi.agile;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.gfi.agile.listeners.NumberListener;

public class Calculatrice {

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

		final JLabel resultat = new JLabel("");
		resultat.setSize(100, 50);
		panelResultat.add(resultat);

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
		JButton boutonAddition = new JButton("+");
		boutonAddition.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("On fait une addition");
				
			}
		});
		

		GridLayout grilleLayout = new GridLayout(4, 3);

		JPanel panelBoutons = new JPanel(grilleLayout);
		panelBoutons.add(boutonSept);
		panelBoutons.add(boutonHuit);
		panelBoutons.add(boutonNeuf);
		panelBoutons.add(boutonQuatre);
		panelBoutons.add(boutonCinq);
		panelBoutons.add(boutonSix);
		panelBoutons.add(boutonUn);
		panelBoutons.add(boutonDeux);
		panelBoutons.add(boutonTrois);
		panelBoutons.add(boutonZero);
		panelBoutons.add(boutonAddition);

		panelGlobal.add(panelBoutons);
		fenetreCalculatrice.add(panelGlobal);

		ActionListener numberListener = new NumberListener(resultat);

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
	
	
	public static double egal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
