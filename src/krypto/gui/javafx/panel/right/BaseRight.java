package krypto.gui.javafx.panel.right;

import javafx.scene.layout.StackPane;

public abstract class BaseRight {

	protected StackPane panel;
	

	public BaseRight() {
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
