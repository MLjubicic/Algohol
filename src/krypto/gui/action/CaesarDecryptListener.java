/**
 * 
 */
package krypto.gui.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JTextArea;

import krypto.tools.decrypt.CaesarBruteForce;

/**
 * @author MWeigert
 *
 */
public class CaesarDecryptListener implements ActionListener {
	
	private JTextArea jt = new JTextArea();
	
	public CaesarDecryptListener(JTextArea jt) {
		super();
		this.jt = jt;
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		CaesarBruteForce cbf = new CaesarBruteForce(jt.getText());
		
		// Dieser Teil des Codes muss nach 1. Iteration durch den finalen Code ersetzt werden
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Map<Character, String> report = cbf.getReport();
		System.out.println("Cipher:       " + cbf.getCipher());
		System.out.println("******************************************" +
				"*******************************");
		for (int i = 0; i < 26; i++) {
			System.out.println("Key: " + abc.charAt(i) + " Plain: " + report.get(abc.charAt(i)));
		}
		System.out.println("Gebrauchte Zeit: " + cbf.getTime() + " ms");
		// Bis hier her geht der DEMO Code
	}

}
