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
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class RefreshSubstitutionEvent implements EventHandler<Event>{
	
	Map<Integer, TextField> cipherField;
	Map<Integer, TextField> inputField;
	SubstitutionRightFX panel;
	
	public RefreshSubstitutionEvent(Map<Integer, TextField> cipherField, Map<Integer, TextField> inputField, SubstitutionRightFX panel) {
		super();
		this.cipherField = cipherField;
		this.inputField = inputField;
		this.panel = panel;
	}

	@Override
	public void handle(Event arg0) {
		// TODO Auto-generated method stub
		cipherField = inputField;
		
	}
	
}
