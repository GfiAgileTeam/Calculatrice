package fr.gfi.agile.composant;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class BoutonSoustraction extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6904679325379432836L;

	public BoutonSoustraction(){
		super("-");
		this.addMouseListener(new MouseListener() {
			
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
				System.out.println("On fait une soustraction");
			}
		});
		
	}
	
}
