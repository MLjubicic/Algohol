/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.action;

import java.util.Map;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import krypto.tools.decrypt.CaesarBruteForce;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarDecryptEvent implements EventHandler<Event>{

private TextArea ta = new TextArea();
	
	public CaesarDecryptEvent(TextArea ta) {
		super();
		this.ta = ta;
	}
	@Override
	public void handle(Event arg0) {
		// TODO Auto-generated method stub
		CaesarBruteForce cbf = new CaesarBruteForce(ta.getText());
		
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
