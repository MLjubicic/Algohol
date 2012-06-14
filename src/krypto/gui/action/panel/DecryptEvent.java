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
import krypto.gui.javafx.panel.bottom.BottomFX;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class DecryptEvent implements EventHandler<Event> {

	private TextArea cipher;
	private CipherHandler cipherHandler;

	public DecryptEvent(TextArea cipher, CipherHandler cipherHandler) {
		super();
		this.cipher = cipher;
		this.cipherHandler = cipherHandler;
	}

	@Override
	public void handle(Event arg0) {
		cipherHandler.handleDecryptEvent(cipher.getText());
	}

}
