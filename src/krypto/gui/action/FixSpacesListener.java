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
import javax.swing.JTextField;

import krypto.tools.SetSpaces;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class FixSpacesListener implements ActionListener{

	private JTextArea jt;
	private JTextField tf;
	
	public FixSpacesListener(JTextArea  jt, JTextField tf) {
		super();
		this.jt = jt;
		this.tf = tf;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int n = Integer.valueOf(tf.getText());
		SetSpaces spaces = new SetSpaces();
		jt.setText(spaces.fix(jt.getText(), n));
	}

}
