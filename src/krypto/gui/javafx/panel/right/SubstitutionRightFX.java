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

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import krypto.gui.action.panel.RefreshEvent;
import krypto.gui.javafx.panel.BasePanel;

/**
 * Generiert, das Eingabe Panel für die für das Substitution Cipher notwendigen
 * Daten.
 * 
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class SubstitutionRightFX extends BasePanel {

	private StackPane panel = new StackPane();
	private Map<Integer, Text> abcText;
	private Map<Integer, TextField> cipherCharacterField;
	private Map<Integer, TextField> inputMap;
	private RefreshEvent refreshHandler;
	private Button refreshButton;

	/**
	 * @return the inputMap
	 */
	public Map<Integer, TextField> getInputMap() {
		return inputMap;
	}

	/**
	 * @param inputMap
	 *            the inputMap to set
	 */
	public void setInputMap(Map<Integer, TextField> inputMap) {
		this.inputMap = inputMap;
	}

	public SubstitutionRightFX() {
		super();

		abcText = new HashMap<Integer, Text>();
		cipherCharacterField = new HashMap<Integer, TextField>();
		inputMap = new HashMap<Integer, TextField>();
		refreshHandler = new RefreshEvent(this);
		this.addChildren();
	}

	/**
	 * @return the cipherCharacterField
	 */
	public Map<Integer, TextField> getCipherCharacterField() {
		return cipherCharacterField;
	}

	/**
	 * @param cipherCharacterField
	 *            the cipherCharacterField to set
	 */
	public void setCipherCharacterField(Map<Integer, TextField> cipherCharacterField) {
		this.cipherCharacterField = cipherCharacterField;
	}

	/**
	 * @return the panel
	 */
	public StackPane getPanel() {
		return panel;
	}

	/**
	 * @param panel
	 *            the panel to set
	 */
	public void setPanel(StackPane panel) {
		this.panel = panel;
	}

	@Override
	public void addChildren() {
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
		refreshButton = new Button("Refresh");
		refreshButton.addEventHandler(ActionEvent.ACTION, refreshHandler);
		grid.add(refreshButton, 5, 0);
		panel.getChildren().add(grid);
	}

}
