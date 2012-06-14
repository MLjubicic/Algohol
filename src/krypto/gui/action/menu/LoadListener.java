/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.action.menu;

import javafx.event.EventHandler;
import krypto.gui.dialog.FileChooser;
import krypto.io.LoadTextFile;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class LoadListener implements EventHandler<javafx.event.ActionEvent> {

	public LoadListener() {
		super();
		
	}
	
	@Override
	public void handle(javafx.event.ActionEvent arg0) {
		// TODO Auto-generated method stub
		FileChooser fc = new FileChooser();
		fc.setTextFile();
		
		LoadTextFile ltf = new LoadTextFile();
		ltf.loadFile(fc.getFile());
		
	}

}
