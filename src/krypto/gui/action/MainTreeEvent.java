/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.action;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import krypto.gui.main.Kryptonite;
import krypto.gui.panel.CaesarPanelFX;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class MainTreeEvent implements EventHandler<Event>{
	
	private TreeItem<String> tree;
	private Kryptonite krypton;
	private String id;
	
	public MainTreeEvent (String id, Kryptonite krypton) {
//		this.tree = tree;
		this.id = id;
		this.krypton = krypton;
	}


	@Override
	public void handle(Event arg0) {
		// TODO Auto-generated method stub
//		String str = tree.getValue();
//		if (str.equals("Caesar Cipher")) krypton.setCenterPane(new CaesarPanelFX().getPanel());
		System.out.println(id);
	}

}
