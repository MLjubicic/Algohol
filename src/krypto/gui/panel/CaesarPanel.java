/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.panel;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import krypto.gui.action.FixSpacesListener;
import krypto.gui.action.NoSpacesListener;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarPanel {

	private JPanel cPanel;
	private JTextArea plainTAerea = new JTextArea();
	private JTextField plainTField = new JTextField();
	private NoSpacesListener nsl= new NoSpacesListener(plainTAerea);
	private FixSpacesListener fsl = new FixSpacesListener(plainTAerea, plainTField);
	
	public CaesarPanel() {
		cPanel = new JPanel();
		cPanel.setLayout(null);
		
		JLabel plainLabel = new JLabel("Plaintext");
		plainLabel.setBounds(10, 10, 50, 25);
		cPanel.add(plainLabel);
		
		plainTAerea.setBounds(10, 35, 200, 100);
		cPanel.add(plainTAerea);
		
		JRadioButton noSpacesBtn = new JRadioButton("no spaces");
		noSpacesBtn.setBounds(225, 35, 100, 25);
		noSpacesBtn.addActionListener(nsl);
		cPanel.add(noSpacesBtn);
		
		JRadioButton stdSpacesBtn = new JRadioButton("standard");
		stdSpacesBtn.setBounds(330, 35, 100, 25);
		stdSpacesBtn.setSelected(true);
		cPanel.add(stdSpacesBtn);
		
		JRadioButton fixSpacesBtn = new JRadioButton("fixed");
		fixSpacesBtn.setBounds(225, 60, 60, 25);
		fixSpacesBtn.addActionListener(fsl);
		cPanel.add(fixSpacesBtn);
		
		plainTField.setBounds(285, 60, 30, 25);
		cPanel.add(plainTField);
		
		ButtonGroup spacesBtnGrp = new ButtonGroup();
		spacesBtnGrp.add(noSpacesBtn);
		spacesBtnGrp.add(stdSpacesBtn);
		spacesBtnGrp.add(fixSpacesBtn);
		
		JLabel cipherLabel = new JLabel("Ciphertext");
		cipherLabel.setBounds(10, 135, 75, 25);
		cPanel.add(cipherLabel);
		
		JTextArea cipherTAerea = new JTextArea();
		cipherTAerea.setBounds(10, 160, 200, 100);
		cPanel.add(cipherTAerea);
		
		JButton encryptBtn = new JButton("Encrypt");
		encryptBtn.setBounds(10, 275, 95, 25);
		cPanel.add(encryptBtn);
		
		JButton decryptBtn = new JButton("Decrypt");
		decryptBtn.setBounds(110, 275, 100, 25);
		cPanel.add(decryptBtn);
		
		cPanel.setBounds(0, 0, 250, 250);
	}
	
	public JPanel getCaesarPanel() {
		return cPanel;
	}
}
