/**
 * 
 */
package krypto.gui.action.menu;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeItem;
import krypto.gui.action.panel.CaesarCipherHandler;
import krypto.gui.action.panel.SubstitutionCipherHandler;
import krypto.gui.javafx.panel.BasePanel;
import krypto.gui.javafx.panel.ChiffrePanelFX;
import krypto.gui.javafx.panel.bottom.BottomFX;
import krypto.gui.javafx.panel.right.CaesarRightFX;
import krypto.gui.javafx.panel.right.SubstitutionRightFX;
import krypto.gui.main.Kryptonite;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
@SuppressWarnings("rawtypes")
public class MainTreeChangeListener implements ChangeListener {

	private Kryptonite krypton;

	public MainTreeChangeListener(Kryptonite krypton) {
		this.krypton = krypton;
	}

	@Override
	/**
	 * Listener welcher die Usereingabe mittels des Auswahltrees verarbeitet.
	 */
	public void changed(ObservableValue observable, Object oldValue, Object newValue) {
		TreeItem treeItem = (TreeItem) newValue;
		String str = treeItem.toString();

		if (str.contains("Caesar")) {
			BottomFX bottomP = new BottomFX();
			CaesarRightFX rightP = new CaesarRightFX();
			krypton.setCipherPanels(new ChiffrePanelFX(new CaesarCipherHandler(bottomP, rightP), rightP, bottomP),
					rightP, bottomP);
		} else if (str.contains("Subs")) {
			BottomFX bottomP = new BottomFX();
			SubstitutionRightFX rightP = new SubstitutionRightFX();
			krypton.setCipherPanels(
					new ChiffrePanelFX(new SubstitutionCipherHandler(bottomP, rightP), rightP, bottomP), rightP,
					bottomP);
			;
		}

	}

}
