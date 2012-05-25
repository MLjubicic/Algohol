/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import krypto.gui.action.MainTreeChangeListener;
import krypto.gui.javafx.elements.CaesarHeader;
import krypto.gui.javafx.elements.CaesarLeft;
import krypto.gui.javafx.elements.MainTree;
import krypto.gui.javafx.panel.MainPanelFX;
import krypto.gui.menu.MainMenu;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class Version2 extends Application{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Kryptonite - Software Project 2 - ZHAW");
		
		BorderPane mainPanel = new BorderPane();
		mainPanel.setStyle("-fx-background-color: #669999;");
		
		TreeView<String> tree = new TreeView<String> (new MainTree().getTree());
		tree.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
//        tree.getSelectionModel().selectedItemProperty().addListener(new MainTreeChangeListener(this));
        
		MenuBar menuBar = new MainMenu().getMenu();
		
		StackPane centerPane = new MainPanelFX(null, null, null, null).getPanel();
		
		mainPanel.setTop(menuBar);
		mainPanel.setLeft(tree);
		mainPanel.setCenter(centerPane);
		
		stage.setScene(new Scene(mainPanel));
		stage.show();
	}

}
