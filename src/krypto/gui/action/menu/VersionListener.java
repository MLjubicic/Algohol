/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.action.menu;

import javafx.event.EventHandler;
import krypto.gui.javafx.panel.InfoPanelFX;
import krypto.gui.main.Kryptonite;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class VersionListener implements EventHandler<javafx.event.ActionEvent> {

	private Kryptonite krypto;

	public VersionListener(Kryptonite krypto) {
		super();
		this.krypto = krypto;
	}

	@Override
	/**
	 * Listener welcher im Hauptmenu die Anzeige der Details ausführt.
	 */
	public void handle(javafx.event.ActionEvent arg0) {
		// TODO Auto-generated method stub
		krypto.setCenterPane(new InfoPanelFX().getPanel());
		krypto.setRightPane(null);
		krypto.setBottomPane(null);
		krypto.setInfoMode(true);
	}
}
