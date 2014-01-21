package fr.gfi.agile.listeners;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;

public class KeyboardDispatcher implements KeyEventDispatcher {

	private JLabel labelResultat;
	
	
	
	public KeyboardDispatcher(JLabel labelResultat) {
		super();
		this.labelResultat = labelResultat;
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if(e.getID() == KeyEvent.KEY_TYPED) {
			if((e.getKeyChar() == '0') ||
					(e.getKeyChar() == '1') ||
					(e.getKeyChar() == '2') ||
					(e.getKeyChar() == '3') ||
					(e.getKeyChar() == '4') ||
					(e.getKeyChar() == '5') ||
					(e.getKeyChar() == '6') ||
					(e.getKeyChar() == '7') ||
					(e.getKeyChar() == '8') ||
					(e.getKeyChar() == '9')) {
				System.out.println("if getKeyCode: " + e.getKeyCode() + "getKeyChar: " + e.getKeyChar() + "getKeyLocation: " + e.getKeyLocation());
				
				String text = this.labelResultat.getText();
				text += e.getKeyChar();
				labelResultat.setText(text);
			}
		}
            
        return false;
	}

	public JLabel getLabelResultat() {
		return labelResultat;
	}

	public void setLabelResultat(JLabel labelResultat) {
		this.labelResultat = labelResultat;
	}

}
