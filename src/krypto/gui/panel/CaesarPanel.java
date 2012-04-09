/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.panel;

import java.awt.ScrollPane;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import krypto.gui.action.CaesarDecryptListener;
import krypto.gui.action.CaesarEncryptListener;
import krypto.gui.action.FixSpacesListener;
import krypto.gui.action.NoSpacesListener;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarPanel {

	private JPanel cPanel;
	private JTextArea plainTAerea = new JTextArea();
	private JTextArea cipherTAerea = new JTextArea();
	private JTextField fixedTField = new JTextField();
	private JTextField keyTField = new JTextField();
	private NoSpacesListener nsl= new NoSpacesListener(plainTAerea);
	private FixSpacesListener fsl = new FixSpacesListener(plainTAerea, fixedTField);
	private CaesarEncryptListener cel = new CaesarEncryptListener(plainTAerea, cipherTAerea, keyTField);
	private CaesarDecryptListener cdl = new CaesarDecryptListener(cipherTAerea);
	
	public CaesarPanel() {
		cPanel = new JPanel();
		cPanel.setLayout(null);
		
		JLabel plainLabel = new JLabel("Plaintext");
		plainLabel.setBounds(10, 10, 50, 25);
		cPanel.add(plainLabel);
		
		ScrollPane scrollPlain = new ScrollPane();
		scrollPlain.setBounds(10, 35, 420, 250); 
		scrollPlain.add(plainTAerea);

		cPanel.add(scrollPlain);
		
		
		JRadioButton noSpacesBtn = new JRadioButton("no spaces");
		noSpacesBtn.setBounds(225, 10, 100, 25);
		noSpacesBtn.addActionListener(nsl);
		cPanel.add(noSpacesBtn);
		
		JRadioButton fixSpacesBtn = new JRadioButton("fixed");
		fixSpacesBtn.setBounds(330, 10, 60, 25);
		fixSpacesBtn.addActionListener(fsl);
		cPanel.add(fixSpacesBtn);
		
		fixedTField.setBounds(400, 10, 30, 25);
		cPanel.add(fixedTField);
		
		ButtonGroup spacesBtnGrp = new ButtonGroup();
		spacesBtnGrp.add(noSpacesBtn);
		spacesBtnGrp.add(fixSpacesBtn);
		
		JLabel cipherLabel = new JLabel("Ciphertext");
		cipherLabel.setBounds(10, 290, 75, 25);
		cPanel.add(cipherLabel);
		
		ScrollPane scrollCipher = new ScrollPane();
		scrollCipher.setBounds(10, 320, 420, 250);
		scrollCipher.add(cipherTAerea);
		
		cPanel.add(scrollCipher);
		
		JLabel keyLabel = new JLabel("Key");
		keyLabel.setBounds(225, 290, 30, 25);
		cPanel.add(keyLabel);
		
		keyTField.setBounds(260, 290, 60, 25);
		cPanel.add(keyTField);
		
		JButton encryptBtn = new JButton("Encrypt");
		encryptBtn.setBounds(440, 35, 95, 25);
		encryptBtn.addActionListener(cel);
		cPanel.add(encryptBtn);
		
		JButton decryptBtn = new JButton("Decrypt");
		decryptBtn.setBounds(440, 320, 100, 25);
		decryptBtn.addActionListener(cdl);
		cPanel.add(decryptBtn);
		
		cPanel.setBounds(0, 0, 250, 250);
	}
	
	public JPanel getCaesarPanel() {
		return cPanel;
	}
}
