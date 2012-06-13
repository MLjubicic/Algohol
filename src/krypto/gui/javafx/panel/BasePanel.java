package krypto.gui.javafx.panel;

import javafx.scene.layout.StackPane;

public abstract class BasePanel {

	protected StackPane panel;
	

	public BasePanel() {
		super();
		panel = new StackPane();
	}


	/**
	 * @return the panel
	 */
	public StackPane getPanel() {
		return panel;
	}
	
	public abstract void addChildren();
}
