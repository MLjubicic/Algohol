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
import krypto.tools.SetSpaces;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class NoSpacesEvent implements EventHandler<Event> {

	private TextArea ta;

	public NoSpacesEvent(TextArea ta) {
		this.ta = ta;
	}

	@Override
	/**
	 * Löscht alle Leerzeichen aus einem String in einer TextArea.
	 */
	public void handle(Event arg0) {
		// TODO Auto-generated method stub
		SetSpaces space = new SetSpaces();
		if (ta.getText() != null)
			ta.setText(space.delete(ta.getText()));
	}

}
