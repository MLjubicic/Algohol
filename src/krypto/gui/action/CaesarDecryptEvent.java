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
import javafx.scene.text.Text;
import krypto.tools.decrypt.CaesarBruteForce;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarDecryptEvent implements EventHandler<Event>{

private TextArea cipherArea = new TextArea();
private TextArea outputArea = new TextArea();
private Text elapsedTimeText = new Text();
	
	public CaesarDecryptEvent(TextArea cipherArea, TextArea outputArea, Text elapsedTimeText) {
		super();
		this.cipherArea = cipherArea;
		this.outputArea = outputArea;
		this.elapsedTimeText = elapsedTimeText;
	}
	@Override
	public void handle(Event arg0) {
		CaesarBruteForce cbf = new CaesarBruteForce(cipherArea.getText().toUpperCase());
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Map<Character, String> report = cbf.getReport();
		
		// Dieser Teil des Codes muss nach 1. Iteration durch den finalen Code ersetzt werden
		
//		System.out.println("Gebrauchte Zeit: " + cbf.getTime() + " ms");
		// Bis hier her geht der DEMO Code
		String outputStr = new String();
		for (int i = 0; i < 26; i++) {
			outputStr = outputStr + "Key: "+ abc.charAt(i) + " Plain: " + report.get(abc.charAt(i)) + "\n";
		}
		outputArea.setText(outputStr);
		elapsedTimeText.setText("Elapsed time: " + cbf.getTime() + " ms");
	}

}
