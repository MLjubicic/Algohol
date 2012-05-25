/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.javafx.elements;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarLeft {

	private StackPane panel;
	
	public CaesarLeft() {
		panel = new StackPane();
		
		Button encryptButton = new Button("Encrypt");
//		encryptButton.addEventHandler(ActionEvent.ACTION, encryptEvent);
		panel.getChildren().add(encryptButton);
	}
	
	public StackPane getPanel() {
		return panel;
	}
}
