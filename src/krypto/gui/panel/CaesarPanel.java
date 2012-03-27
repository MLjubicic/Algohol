/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.panel;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarPanel {

	private JPanel cPanel;
	
	public CaesarPanel() {
		cPanel = new JPanel();
		cPanel.setLayout(null);
		
		JLabel plainLabel = new JLabel("Plaintext");
		plainLabel.setBounds(10, 10, 50, 25);
		cPanel.add(plainLabel);
		
		JTextArea plainTAerea = new JTextArea();
		plainTAerea.setBounds(10, 35, 200, 100);
		cPanel.add(plainTAerea);
		
		JLabel cipherLabel = new JLabel("Ciphertext");
		cipherLabel.setBounds(10, 135, 75, 25);
		cPanel.add(cipherLabel);
		
		JTextArea cipherTAerea = new JTextArea();
		cipherTAerea.setBounds(10, 160, 200, 100);
		cPanel.add(cipherTAerea);
		
		cPanel.setBounds(0, 0, 250, 250);
	}
	
	public JPanel getCaesarPanel() {
		return cPanel;
	}
}
