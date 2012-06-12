/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.javafx.panel.right;

import java.util.Map;

import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class SubstitutionRightFX extends StackPane{
	
	private StackPane panel;
	private Map <Integer, TextField> abcTextField;
	
	public SubstitutionRightFX() {
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(0, 10, 0, 10));
		
		int xPos = 0;
		int yPos = 0;
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for (int i = 0; i < 26; i++) {
			TextField field = new TextField();
			field.setText(String.valueOf(abc.charAt(i)));
			
			grid.add(field, xPos, yPos);
			abcTextField.put(i, field);
			yPos++;
		}
		
		panel.getChildren().add(grid);
	}

	/**
	 * @return the panel
	 */
	public StackPane getPanel() {
		return panel;
	}

	/**
	 * @param panel the panel to set
	 */
	public void setPanel(StackPane panel) {
		this.panel = panel;
	}

}
