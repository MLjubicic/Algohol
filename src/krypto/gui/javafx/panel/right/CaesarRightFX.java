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
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import krypto.gui.javafx.panel.BasePanel;

/**
 * Generiert die Eingabemaske für die benötigten Figures zum Caesar Cipher.
 * 
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarRightFX extends BasePanel {

	private TextField keyField;

	public CaesarRightFX() {
		super();
		keyField = new TextField();
		this.addChildren();
	}

	/**
	 * @return the keyField
	 */
	public TextField getKeyField() {
		return keyField;
	}

	@Override
	public void addChildren() {
		VBox vBox = new VBox();

		vBox.setPadding(new Insets(10));
		vBox.setSpacing(8);

		Text titel = new Text("Key:");
		vBox.getChildren().add(titel);
		vBox.getChildren().add(keyField);

		panel.getChildren().add(vBox);
	}

}
