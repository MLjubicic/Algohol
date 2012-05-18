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

import javafx.scene.control.TextArea;

import javax.swing.JTextArea;

import krypto.tools.SetSpaces;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class NoSpacesListener implements ActionListener{

	private JTextArea jt;
	private TextArea fx;
	
	public NoSpacesListener(JTextArea jt) {
		super();
		this.jt = jt;
	}
	
	public NoSpacesListener(TextArea fx) {
		super();
		this.fx = fx;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		SetSpaces space = new SetSpaces();
		if (jt != null) jt.setText(space.delete(jt.getText()));
		if (fx != null) fx.setText(space.delete(fx.getText()));
	}

}
