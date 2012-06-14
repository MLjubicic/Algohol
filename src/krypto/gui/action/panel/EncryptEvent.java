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

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class EncryptEvent implements EventHandler<Event> {

	private TextArea plain;
	private TextArea cipher;
	private Object rightPanel;
	private CipherHandler cipherHandler;

	public EncryptEvent(TextArea plain, TextArea cipher, Object rightPanel, CipherHandler cipherHandler) {
		super();
		this.plain = plain;
		this.cipher = cipher;
		this.rightPanel = rightPanel;
		this.cipherHandler = cipherHandler;
	}

	@Override
	public void handle(Event arg0) {
		cipher.setText(cipherHandler.handleEncryptEvent(plain.getText()));
	}

}
