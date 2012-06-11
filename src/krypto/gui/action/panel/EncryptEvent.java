/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.action.panel;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import krypto.tools.encrypt.CaesarEncrypt;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class EncryptEvent implements EventHandler<Event>{

	private TextArea plain = new TextArea();
	private TextArea cipher = new TextArea();
	private TextField key = new TextField();
	private String activeCenter;

	public EncryptEvent(TextArea plain, TextArea cipher, TextField key, String activeCenter) {
		super();
		this.plain = plain;
		this.cipher = cipher;
		this.key = key;
		this.activeCenter = activeCenter;
	}

	@Override
	public void handle(Event arg0) {
		// TODO Auto-generated method stub
		if (activeCenter.equals("Caesar")) {
			CaesarEncrypt caesar = new CaesarEncrypt(plain.getText(), key.getText().charAt(0));
			cipher.setText(caesar.getCipher());
		}
	}

}
