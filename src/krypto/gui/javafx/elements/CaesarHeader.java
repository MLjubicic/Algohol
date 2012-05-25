/**
 * 
 */
package krypto.gui.javafx.elements;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarHeader {

	private StackPane panel;
	
	public CaesarHeader() {
		panel = new StackPane();
		
		HBox box = new HBox();
		box.setPadding(new Insets(15, 12, 15, 12));
		box.setSpacing(10);
		box.setStyle("-fx-background-color: #336699;");
		
		Text titel = new Text("Caesar Cipher");
		titel.setFont(new Font("Arial", 30));
		
		box.getChildren().add(titel);
		
		panel.getChildren().add(box);
	}
	
	public StackPane getPanel() {
		return panel;
	}
}
