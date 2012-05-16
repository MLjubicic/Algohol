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
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import krypto.gui.javafx.MainMenu;
import krypto.gui.javafx.MainTree;
import krypto.gui.panel.CaesarPanelFX;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class Kryptonite extends Application{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Kryptonite - Software Project 2");
		primaryStage.setFullScreen(true);
		
		TreeView<String> tree = new TreeView<String> (new MainTree().getTree());
		
		MenuBar menuBar = new MainMenu().getMenu();
		
		BorderPane border = new BorderPane();
		StackPane treePane =  new StackPane();
		StackPane centerPane = new StackPane();
		centerPane = new CaesarPanelFX().getPanel();
		treePane.getChildren().add(tree);
		
		border.setLeft(treePane);
		border.setTop(menuBar);
		border.setCenter(centerPane);
		
		primaryStage.setScene(new Scene(border, 300,250));
		primaryStage.show();
	}

}
