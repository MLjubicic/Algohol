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

import krypto.tools.encrypt.CaesarEncrypt;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarEncryptListener implements ActionListener{

	private JTextArea pta = new JTextArea();
	private JTextArea cta = new JTextArea();
	private JTextField keyTF = new JTextField();
	
	public CaesarEncryptListener(JTextArea pta, JTextArea cta, JTextField keyTF) {
		super();
		this.pta = pta;
		this.cta = cta;
		this.keyTF = keyTF;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		CaesarEncrypt caesar = new CaesarEncrypt(pta.getText(), keyTF.getText().charAt(0));
		cta.setText(caesar.getCipher());
	}
}
