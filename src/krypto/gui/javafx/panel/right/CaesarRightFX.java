/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.javafx.panel.right;

import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarRightFX {
	
	private StackPane panel;
	private TextField keyField;
	
	public CaesarRightFX() {
		panel = new StackPane();
		VBox vBox = new VBox();
		vBox.setPadding(new Insets(10));
		vBox.setSpacing(8);
		
		Text titel = new Text("Key:");
		keyField = new TextField();
		
		vBox.getChildren().add(titel);
		vBox.getChildren().add(keyField);
		
		panel.getChildren().add(vBox);
	}

	/**
	 * @return the panel
	 */
	public StackPane getPanel() {
		return panel;
	}

	/**
	 * @return the keyField
	 */
	public TextField getKeyField() {
		return keyField;
	}

}
