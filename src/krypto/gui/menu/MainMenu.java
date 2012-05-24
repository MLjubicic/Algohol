/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.menu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class MainMenu {

	private MenuBar menuBar;
	
	public MainMenu() {
		menuBar = new MenuBar();
		
		Menu fileMenu = new Menu("File");
		MenuItem loadMItem = new MenuItem("Load");
		MenuItem saveMItem = new MenuItem("Save");
		MenuItem exitMItem = new MenuItem("Exit");
		fileMenu.getItems().addAll(loadMItem, saveMItem, exitMItem);
		
		Menu helpMenu = new Menu("Help");
		MenuItem infoMItem = new MenuItem("Info");
		infoMItem.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		helpMenu.getItems().addAll(infoMItem);
		
		menuBar.getMenus().addAll(fileMenu, helpMenu);
	}
	
	public MenuBar getMenu() {
		return menuBar;
	}
}
