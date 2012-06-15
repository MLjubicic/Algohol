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
import krypto.gui.javafx.panel.ChiffrePanelFX;
import krypto.gui.main.Kryptonite;
import krypto.io.LoadTextFile;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class LoadListener implements EventHandler<javafx.event.ActionEvent> {

	Kryptonite krypto;

	public LoadListener(Kryptonite krypto) {
		super();
		this.krypto = krypto;
	}

	@Override
	/**
	 * Listener welcher ein Textfile in die Anwendung einlesen soll und im Plainfeld darstellt.
	 * Muss noch vollständig implementiert werden.
	 */
	public void handle(javafx.event.ActionEvent arg0) {
		// TODO Auto-generated method stub

		FileChooser fc = new FileChooser();
		fc.setTextFile();

		LoadTextFile ltf = new LoadTextFile();
		ltf.loadFile(fc.getFile());
		if (krypto.getCenterPane() instanceof ChiffrePanelFX) {
			System.out.println("ok");
		}
		((ChiffrePanelFX) krypto.getCenterPane()).getPlainText().setText(ltf.getStr());
		System.out.println("dumm");
		System.out.println(ltf.getStr());
	}

}
