package fr.gfi.agile;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
		final JLabel resultat = new JLabel("");
		resultat.setSize(100,50);
			
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
				System.out.println("on fait un plus");
			}
		});
		
		GridLayout grilleLayout = new GridLayout(1,10);
		JPanel panel = new JPanel(grilleLayout);
		fenetreCalculatrice.add(panel);
		panel.add(resultat);
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
		panel.add(boutonAddition);

		
		ActionListener listener = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					String valeurBouton = ((JButton)e.getSource()).getText();
					
				String text = resultat.getText();
				text += valeurBouton;
				resultat.setText(text);
			}
		};
		
		boutonZero.addActionListener(listener);
		boutonUn.addActionListener(listener);
		boutonDeux.addActionListener(listener);
		boutonTrois.addActionListener(listener);
		boutonQuatre.addActionListener(listener);
		boutonCinq.addActionListener(listener);
		boutonSix.addActionListener(listener);
		boutonSept.addActionListener(listener);
		boutonHuit.addActionListener(listener);
		boutonNeuf.addActionListener(listener);
		
		
		//4. Size the frame.
		fenetreCalculatrice.pack();

		//5. Show it.
		fenetreCalculatrice.setVisible(true);

	}

	public static double additionner(double i, double j) {
		return i+j;
	}
	

}
