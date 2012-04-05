/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */package krypto.gui.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import krypto.gui.main.KryptoFrame;
import krypto.gui.panel.SkytalePanel;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class SkytaleListener implements ActionListener {
	
	JFrame frame;
	
	public SkytaleListener (JFrame frame) {
		super();
		this.frame = frame;
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		((KryptoFrame) frame).setPanel(new SkytalePanel());
	}

}
