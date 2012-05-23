/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.action;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import krypto.tools.encrypt.CaesarEncrypt;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarEncryptEvent implements EventHandler<Event>{
	
	private TextArea pta = new TextArea();
	private TextArea cta = new TextArea();
	private TextField keyTF = new TextField();

	public CaesarEncryptEvent(TextArea pta, TextArea cta, TextField keyTF) {
		super();
		this.pta = pta;
		this.cta = cta;
		this.keyTF = keyTF;
	}
	
	@Override
	public void handle(Event arg0) {
		// TODO Auto-generated method stub
		CaesarEncrypt caesar = new CaesarEncrypt(pta.getText(), keyTF.getText().charAt(0));
		cta.setText(caesar.getCipher());
	}

}
