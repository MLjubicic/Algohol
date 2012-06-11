/**
 * 
 */
package krypto.gui.action.menu;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeItem;
import krypto.gui.javafx.panel.ChiffrePanelFX;
import krypto.gui.javafx.panel.bottom.CaesarBottomFX;
import krypto.gui.javafx.panel.right.CaesarRightFX;
import krypto.gui.main.Kryptonite;

/**
 * @author Bunny
 *
 */
@SuppressWarnings("rawtypes")
public class MainTreeChangeListener implements ChangeListener{
	
	private Kryptonite krypton;
	
	public MainTreeChangeListener(Kryptonite krypton) {
		this.krypton = krypton;
	}

	@Override
	public void changed(ObservableValue observable, Object oldValue, Object newValue) {
		TreeItem treeItem = (TreeItem)newValue;
		String str = treeItem.toString();
		if (str.contains("Caesar")) {
			krypton.setCenterPane(new ChiffrePanelFX().getPanel());
			krypton.setRightPane(new CaesarRightFX().getPanel());
			krypton.setBottomPane(new CaesarBottomFX().getPanel());
			krypton.setActiveCenter("Caesar");
		}

	}

}
