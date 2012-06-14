/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.menu;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import krypto.gui.action.menu.ExitListener;
import krypto.gui.action.menu.LoadListener;
import krypto.gui.action.menu.VersionListener;
import krypto.gui.main.Kryptonite;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class MainMenu {

	private MenuBar menuBar;
//	private Stage primaryStage;
	
	public MainMenu(final Stage primaryStage, Kryptonite krypto) {
//		this.primaryStage = primaryStage;
		ExitListener exitListener = new ExitListener(primaryStage);
		VersionListener versionListener = new VersionListener(krypto);
		LoadListener loadListener = new LoadListener(); 
		menuBar = new MenuBar();

		Menu fileMenu = new Menu("File");
		MenuItem loadMItem = new MenuItem("Load");
		loadMItem.setOnAction(loadListener);
		MenuItem saveMItem = new MenuItem("Save");
		MenuItem exitMItem = new MenuItem("Exit");
		exitMItem.setOnAction(exitListener);
		fileMenu.getItems().addAll(loadMItem, saveMItem, exitMItem);
		
		Menu helpMenu = new Menu("Help");
		MenuItem infoMItem = new MenuItem("Info");
		infoMItem.setOnAction(versionListener);
			
		helpMenu.getItems().addAll(infoMItem);
		
		menuBar.getMenus().addAll(fileMenu, helpMenu);
	}
	
	public MenuBar getMenu() {
		return menuBar;
	}
}
