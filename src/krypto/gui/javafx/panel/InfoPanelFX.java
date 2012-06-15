/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.javafx.panel;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class InfoPanelFX {

	private StackPane panel;
	private String activeCenter;

	/**
	 * Generiert das Panel welches die Informationen zum Projekt ausgeben.
	 */
	public InfoPanelFX() {
		panel = new StackPane();
		VBox vBox = new VBox();
		activeCenter = "Info";

		Label infoLabel = new Label("Software Projekt II - 2012");
		infoLabel.setTextAlignment(TextAlignment.CENTER);
		vBox.getChildren().add(infoLabel);
		Label info2 = new Label("Miro Ljubicic & Mathias Weigert");
		info2.setTextAlignment(TextAlignment.CENTER);
		vBox.getChildren().add(info2);
		Label space = new Label(" ");
		vBox.getChildren().add(space);
		Label thema = new Label("Antike Grundlagen der Verschlüsselungstechnik");
		thema.setTextAlignment(TextAlignment.CENTER);
		vBox.getChildren().add(thema);
		panel.getChildren().add(vBox);
	}

	public StackPane getPanel() {
		return panel;
	}

	/**
	 * @param activeCenter
	 *            the activeCenter to set
	 */
	public void setActiveCenter(String activeCenter) {
		this.activeCenter = activeCenter;
	}
}
