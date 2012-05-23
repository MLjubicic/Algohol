/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.panel;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarPanelFX {

	private StackPane panel;
	TextArea plainText = new TextArea();
	TextArea cipherText = new TextArea();
	TextField fixField = new TextField();
	TextField keyField = new TextField();
	
	public CaesarPanelFX() {
		panel = new StackPane();
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(0, 10, 0, 10));
		
		// ************** Upper half plain text area **************
		Text plain = new Text("Plain");
		plain.setFont(Font.font(null, FontWeight.BOLD, 12));
		grid.add(plain, 1, 1);

		grid.add(plainText, 1, 2, 2, 5);
		
		Button encryptButton = new Button("Encrypt");
		grid.add(encryptButton, 4, 2, 2, 1);
		
		ToggleGroup group = new ToggleGroup();
		
		RadioButton noSpacesButton = new RadioButton("no spaces");
		noSpacesButton.setToggleGroup(group);
		grid.add(noSpacesButton, 4, 3, 2, 1);
		
		RadioButton fixButton = new RadioButton("fix");
		fixButton.setToggleGroup(group);
		grid.add(fixButton, 4, 4);
		
		grid.add(fixField, 5, 4);
		
		// ************** Lower half cipher text area **************
		Text cipher = new Text("Cipher");
		cipher.setFont(Font.font(null, FontWeight.BOLD, 12));
		grid.add(cipher, 1, 7);
		
		grid.add(cipherText, 1, 8, 2, 5);
		
		Button decryptButton = new Button("Decrypt");
		grid.add(decryptButton, 4, 8, 2, 1);
		
		Text key = new Text("Key");
		grid.add(key, 4, 9);
		
		grid.add(keyField, 5, 9);
		
		panel.getChildren().add(grid);
	}
	
	public StackPane getPanel() {
		return panel;
	}
}
