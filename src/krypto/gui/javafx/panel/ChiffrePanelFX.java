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
import krypto.gui.action.panel.EncryptEvent;
import krypto.gui.action.panel.FixSpacesEvent;
import krypto.gui.action.panel.NoSpacesEvent;
import krypto.gui.javafx.panel.right.BaseRight;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class ChiffrePanelFX extends StackPane {

	private StackPane panel;
	private TextArea plainText = new TextArea();
	private TextArea cipherText = new TextArea();
	private TextField fixField = new TextField();
	private FixSpacesEvent fixEvent = new FixSpacesEvent(plainText, fixField);
	private NoSpacesEvent noEvent = new NoSpacesEvent(plainText);
	private Character activeChiffre = new Character('N');
	private StackPane rightPanel;
	private StackPane bottomPanel;
	private EncryptEvent encryptEvent;
//	private DecryptEvent decryptEvent = new DecryptEvent(cipherText, outputArea, elapsedTimeText);
	
	public ChiffrePanelFX() {
		panel = new StackPane();
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(0, 10, 0, 10));
		
		encryptEvent = new EncryptEvent(plainText, cipherText, rightPanel, bottomPanel, activeChiffre);
		
		// ************** Upper half plain text area **************
		Text plain = new Text("Plain");
		plain.setFont(Font.font(null, FontWeight.BOLD, 12));
		grid.add(plain, 1, 1);

		grid.add(plainText, 1, 2, 2, 5);
		
		Button encryptButton = new Button("Encrypt");
		encryptButton.addEventHandler(ActionEvent.ACTION, encryptEvent);
		grid.add(encryptButton, 4, 2, 2, 1);
		
		ToggleGroup group = new ToggleGroup();
		
		RadioButton noSpacesButton = new RadioButton("no spaces");
		noSpacesButton.addEventHandler(ActionEvent.ACTION, noEvent);
		noSpacesButton.setToggleGroup(group);
		grid.add(noSpacesButton, 4, 3, 2, 1);
		
		RadioButton fixButton = new RadioButton("fix");
		fixButton.addEventHandler(ActionEvent.ACTION, fixEvent);
		fixButton.setToggleGroup(group);
		grid.add(fixButton, 4, 4);
		
		grid.add(fixField, 5, 4);
		
		// ************** Lower half cipher text area **************
		Text cipher = new Text("Cipher");
		cipher.setFont(Font.font(null, FontWeight.BOLD, 12));
		grid.add(cipher, 1, 7);
		
		grid.add(cipherText, 1, 8, 2, 5);
		
		Button decryptButton = new Button("Decrypt");
//		decryptButton.addEventHandler(ActionEvent.ACTION, decryptEvent);
		grid.add(decryptButton, 4, 8, 2, 1);
		
		panel.getChildren().add(grid);
	}
	
	public ChiffrePanelFX(char c, Object rightP, StackPane bottomP) {
		panel = new StackPane();
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(0, 10, 0, 10));
		
		rightPanel = ((BaseRight) rightP).getPanel();
		bottomPanel = bottomP;
		encryptEvent = new EncryptEvent(plainText, cipherText, rightP, bottomPanel, c);
		
		// ************** Upper half plain text area **************
		Text plain = new Text("Plain");
		plain.setFont(Font.font(null, FontWeight.BOLD, 12));
		grid.add(plain, 1, 1);

		grid.add(plainText, 1, 2, 2, 5);
		
		Button encryptButton = new Button("Encrypt");
		encryptButton.addEventHandler(ActionEvent.ACTION, encryptEvent);
		grid.add(encryptButton, 4, 2, 2, 1);
		
		ToggleGroup group = new ToggleGroup();
		
		RadioButton noSpacesButton = new RadioButton("no spaces");
		noSpacesButton.addEventHandler(ActionEvent.ACTION, noEvent);
		noSpacesButton.setToggleGroup(group);
		grid.add(noSpacesButton, 4, 3, 2, 1);
		
		RadioButton fixButton = new RadioButton("fix");
		fixButton.addEventHandler(ActionEvent.ACTION, fixEvent);
		fixButton.setToggleGroup(group);
		grid.add(fixButton, 4, 4);
		
		grid.add(fixField, 5, 4);
		
		// ************** Lower half cipher text area **************
		Text cipher = new Text("Cipher");
		cipher.setFont(Font.font(null, FontWeight.BOLD, 12));
		grid.add(cipher, 1, 7);
		
		grid.add(cipherText, 1, 8, 2, 5);
		
		Button decryptButton = new Button("Decrypt");
//		decryptButton.addEventHandler(ActionEvent.ACTION, decryptEvent);
		grid.add(decryptButton, 4, 8, 2, 1);
		
		panel.getChildren().add(grid);
	}

	public Character getActiveChiffre() {
		return activeChiffre;
	}
	
	public StackPane getBottomPanel() {
		return bottomPanel;
	}
	
	/**
	 * @return the cipherText
	 */
	public TextArea getCipherText() {
		return cipherText;
	}
	
	public StackPane getRightPanel() {
		return rightPanel;
	}
	
	public StackPane getPanel() {
		return panel;
	}
	
	/**
	 * @return the plainText
	 */
	public TextArea getPlainText() {
		return plainText;
	}

	public void setActiveChiffre(Character activeChiffre) {
		this.activeChiffre = activeChiffre;
//		encryptEvent.setActivePanel(activeChiffre);
	}
	
	public void setBottomPanel(StackPane bottomPanel) {
		this.bottomPanel = bottomPanel;
	}
	
	/**
	 * @param cipherText the cipherText to set
	 */
	public void setCipherText(TextArea cipherText) {
		this.cipherText = cipherText;
	}
	
	public void setEncryptEvent(EncryptEvent event) {
		encryptEvent = event;
	}
	
	/**
	 * @param plainText the plainText to set
	 */
	public void setPlainText(TextArea plainText) {
		this.plainText = plainText;
	}

	public void setRightPanel(StackPane rightPanel) {
		this.rightPanel = rightPanel;
	}
	
}
