/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import krypto.tools.SetSpaces;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class NoSpacesListener implements ActionListener{

	private JTextArea jt;
	
	public NoSpacesListener(JTextArea jt) {
		super();
		this.jt = jt;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		SetSpaces space = new SetSpaces();
		jt.setText(space.delete(jt.getText()));
	}

}
