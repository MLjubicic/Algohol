/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.action.panel;

import java.util.HashMap;
import java.util.Map;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import krypto.data.Alphabet;
import krypto.gui.javafx.panel.right.SubstitutionRightFX;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class EncryptEventSubstitution implements EventHandler<Event> {

	private TextArea plain;
	private TextArea cipher;
	private Object rightPanel;
	private CipherHandler cipherHandler;

	public EncryptEventSubstitution(TextArea plain, TextArea cipher, Object rightPanel, CipherHandler cipherHandler) {
		super();
		this.plain = plain;
		this.cipher = cipher;
		this.rightPanel = rightPanel;
		this.cipherHandler = cipherHandler;
	}

	@Override
	/**
	 * Behandelt die Actionen für den Encrypt Button im ChiffrePanelFX
	 */
	public void handle(Event arg0) {

		Map<Integer, TextField> cipherMap = ((SubstitutionRightFX) rightPanel).getCipherCharacterField();

		Map<Character, Character> mapper = new HashMap<Character, Character>();
		int i = 0;
		for (Alphabet abc : Alphabet.values()) {
			if (cipherMap.get(i) != null && cipherMap.get(i).getText() != null
					&& !"".equals(cipherMap.get(i).getText())) {
				mapper.put(abc.name().charAt(0), cipherMap.get(i).getText().charAt(0));
			} else {
				mapper.put(abc.name().charAt(0), '-');
			}
			i++;
		}

		cipher.setText(SubstitutionEncryptStringHelper.decryptText(plain.getText(), mapper));
	}

}
