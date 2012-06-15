/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.action.panel;

import java.util.Map;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import krypto.gui.javafx.panel.right.SubstitutionRightFX;

/**
 * Handler für den Refresh Button auf dem SubstitutionRight Panel.
 * 
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class RefreshEvent implements EventHandler<Event> {

	private SubstitutionRightFX right;

	public RefreshEvent(SubstitutionRightFX right) {
		this.right = right;
	}

	@Override
	public void handle(Event arg0) {
		Map<Integer, TextField> inputMap = right.getInputMap();
		for (int i = 0; i < 26; i++) {
			right.getCipherCharacterField().get(i).setText(inputMap.get(i).getText());
		}
	}

}
