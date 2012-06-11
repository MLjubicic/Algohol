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

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class InfoPanelFX {

	private StackPane panel;
	private String activeCenter;
	
	public InfoPanelFX() {
		panel = new StackPane();
		VBox vbox = new VBox();
		activeCenter = "Info";
		
		Label infoLabel = new Label("Version 1.0");
		vbox.getChildren().add(infoLabel);
		panel.getChildren().add(vbox);
	}
	
	public StackPane getPanel() {
		return panel;
	}

	/**
	 * @param activeCenter the activeCenter to set
	 */
	public void setActiveCenter(String activeCenter) {
		this.activeCenter = activeCenter;
	}
}
