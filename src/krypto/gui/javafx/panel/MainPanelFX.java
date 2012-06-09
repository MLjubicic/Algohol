/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.javafx.panel;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import krypto.gui.action.FixSpacesEvent;
import krypto.gui.action.NoSpacesEvent;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class MainPanelFX {

	private StackPane panel;
	private TextArea plainText = new TextArea();
	private TextArea cipherText = new TextArea();
	private TextField fixField = new TextField();
	private NoSpacesEvent noEvent = new NoSpacesEvent(plainText);
	private FixSpacesEvent fixEvent = new FixSpacesEvent(plainText, fixField);
	
	public MainPanelFX(StackPane top, StackPane left, StackPane right, StackPane bottom) {
		panel = new StackPane();
//		BorderPane border = new BorderPane();
		AnchorPane anchor = new AnchorPane();
		
		// ************** Creating CenterPanel with main elements **************
		StackPane center = new StackPane();
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(0, 10, 0, 10));
		
		// ************** Upper half plain text area **************
		Text plain = new Text("Plain");
		plain.setFont(Font.font(null, FontWeight.BOLD, 12));
		grid.add(plain, 1, 1);

		grid.add(plainText, 1, 2, 10, 5);
		
		ToggleGroup group = new ToggleGroup();
		
		RadioButton noSpacesButton = new RadioButton("no spaces");
		noSpacesButton.addEventHandler(ActionEvent.ACTION, noEvent);
		noSpacesButton.setToggleGroup(group);
		grid.add(noSpacesButton, 2, 1, 2, 1);
		
		RadioButton fixButton = new RadioButton("fix");
		fixButton.addEventHandler(ActionEvent.ACTION, fixEvent);
		fixButton.setToggleGroup(group);
		grid.add(fixButton, 4, 1);
		
		grid.add(fixField, 5, 1);
		
		// ************** Lower half cipher text area **************
		Text cipher = new Text("Cipher");
		cipher.setFont(Font.font(null, FontWeight.BOLD, 12));
		grid.add(cipher, 1, 7);
		
		grid.add(cipherText, 1, 8, 2, 5);
		
		panel.getChildren().add(grid);
		
		if (top != null) {
			anchor.getChildren().add(top);
			anchor.setTopAnchor(top, 10.0);
		}
		if (left != null) {
			anchor.getChildren().add(left);
			anchor.setLeftAnchor(left, 3.0);
		}
		anchor.getChildren().add(center);
//		if (top != null) border.getChildren().add(top);
//		if (left != null) border.getChildren().add(left);
//		border.getChildren().add(center);
//		if (right != null) border.getChildren().add(right);
//		if (bottom != null) border.getChildren().add(bottom);
//		
//		panel.getChildren().add(border);
	}
	
	public StackPane getPanel() {
		return panel;
	}
}
