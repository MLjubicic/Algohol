/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.javafx.panel.right;

import java.util.HashMap;
import java.util.Map;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import krypto.gui.javafx.panel.BasePanel;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class SubstitutionRightFX extends BasePanel{

	private StackPane panel = new StackPane();
	private Map <Integer, Text> abcText;
	private Map <Integer, TextField> cipherCharacterField;
	private Map <Integer, TextField> inputMap;

	public SubstitutionRightFX() {
		super();

		abcText = new HashMap<Integer, Text>();
		cipherCharacterField = new HashMap<Integer, TextField>();
		inputMap = new HashMap<Integer, TextField>();
		this.addChildren();
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

	@Override
	public void addChildren() {
		// TODO Auto-generated method stub
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(0, 10, 0, 10));

		int xPos = 0;
		int yPos = 0;
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for (int i = 0; i < 26; i++) {
			Text txt = new Text();
			txt.setText(String.valueOf(abc.charAt(i)));
			grid.add(txt, xPos, yPos, 1, 1);
			abcText.put(i, txt);
			yPos++;
		}
		yPos = 0;
		xPos = 1;
		for (int i = 0; i < 26; i++) {
			Text txt = new Text();
			txt.setText("->");
			grid.add(txt, xPos, yPos);
			abcText.put(i, txt);
			yPos++;
		}
		yPos = 0;
		xPos = 2;
		for (int i = 0; i < 26; i++) {
			TextField field = new TextField();
			field.setMaxWidth(25);
			field.setEditable(false);
			field.setText("X");
			cipherCharacterField.put(i, field);
			grid.add(field, xPos, yPos);
			yPos++;
		}
		yPos = 0;
		xPos = 3;
		for (int i = 0; i < 26; i++) {
			Text txt = new Text();
			txt.setText("<-");
			grid.add(txt, xPos, yPos);
			abcText.put(i, txt);
			yPos++;
		}
		yPos = 0;
		xPos = 4;
		for (int i = 0; i < 26; i++) {
			TextField field = new TextField();
			field.setMaxWidth(25);
			inputMap.put(i, field);
			grid.add(field, xPos, yPos);
			yPos++;
		}
		Button refreshButton = new Button("Refresh");
		grid.add(refreshButton, 5, 0);
		panel.getChildren().add(grid);
	}

}
