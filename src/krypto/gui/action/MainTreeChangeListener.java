/**
 * 
 */
package krypto.gui.action;

import javax.swing.event.ChangeEvent;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeItem;
import krypto.gui.main.Kryptonite;
import krypto.gui.panel.CaesarPanelFX;

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
		// TODO Auto-generated method stub
		TreeItem treeItem = (TreeItem)newValue;
		String str = treeItem.toString();
		if (str.contains("Caesar")) krypton.setCenterPane(new CaesarPanelFX().getPanel());
	}

}
