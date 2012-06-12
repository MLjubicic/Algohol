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
import krypto.gui.javafx.panel.right.CaesarRightFX;
import krypto.tools.encrypt.CaesarEncrypt;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class EncryptEvent implements EventHandler<Event>{

	private TextArea plain;
	private TextArea cipher;
	private Object rightPanel;
	private Character activePanel;
	
	public EncryptEvent(TextArea plain, TextArea cipher, Object rightPanel, Character activePanel) {
		super();
		this.plain = plain;
		this.cipher = cipher;
		this.rightPanel = rightPanel;
		this.activePanel = activePanel;
	}

	@Override
	public void handle(Event arg0) {
		// TODO Auto-generated method stub
		System.out.println("EncryptEvent: " + activePanel);
		if (activePanel.equals('C')) {
			CaesarRightFX caesarRight = (CaesarRightFX) rightPanel;
			Character key = caesarRight.getKeyField().getText().charAt(0);
			CaesarEncrypt caesar = new CaesarEncrypt(plain.getText(), key);
			cipher.setText(caesar.getCipher());
		}
	}

	/**
	 * @return the activePanel
	 */
	public Character getActivePanel() {
		return activePanel;
	}

	/**
	 * @param activePanel the activePanel to set
	 */
	public void setActivePanel(Character activePanel) {
		this.activePanel = activePanel;
	}

	
}
