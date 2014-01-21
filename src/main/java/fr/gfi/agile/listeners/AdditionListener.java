package fr.gfi.agile.listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import fr.gfi.agile.Calculatrice;
import fr.gfi.agile.metier.ManagerOperations;

public class AdditionListener implements MouseListener {

	public void mouseClicked(MouseEvent e) {
		if (ManagerOperations.getOPERATEUR() != null) {
			ManagerOperations.setDONNEE_PRECEDENTE(ManagerOperations.getDONNEE_AFFICHEE());
		}
		ManagerOperations.setDONNEE_AFFICHEE(Double.valueOf(Calculatrice.getResultat()));			
		ManagerOperations.setOPERATEUR("+");
		if (ManagerOperations.getDONNEE_PRECEDENTE() != null) {
			Calculatrice.setResultat(String.valueOf(ManagerOperations.additionner()));
		}
		ManagerOperations.setINPUT("+");
}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
