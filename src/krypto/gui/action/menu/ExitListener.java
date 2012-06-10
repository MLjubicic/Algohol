/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.action.menu;

import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class ExitListener implements EventHandler<javafx.event.ActionEvent> {
	
	private Stage primaryStage;
	
	public ExitListener(Stage primaryStage) {
		super();
		this.primaryStage = primaryStage;
	}

	@Override
	public void handle(javafx.event.ActionEvent arg0) {
		// TODO Auto-generated method stub
		primaryStage.close();
	}
}
