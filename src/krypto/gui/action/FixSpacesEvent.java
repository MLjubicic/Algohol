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
import krypto.tools.SetSpaces;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class FixSpacesEvent implements EventHandler<Event> {

	private TextArea fx;
	private TextField tf;
	
	public FixSpacesEvent(TextArea fx, TextField tf) {
		super();
		this.fx = fx;
		this.tf = tf;
	}
	
	@Override
	public void handle(Event arg0) {
		// TODO Auto-generated method stub
		int n = Integer.valueOf(tf.getText());
		SetSpaces spaces = new SetSpaces();
		fx.setText(spaces.fix(fx.getText(), n));
	}

}
