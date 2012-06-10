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
import krypto.gui.javafx.panel.CaesarPanelFX;
import krypto.gui.javafx.panel.InfoPanelFX;
import krypto.gui.javafx.panel.MainPanelFX;
import krypto.gui.menu.MainMenu;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class Kryptonite extends Application{
	
	private StackPane centerPane;
	private Stage ps;
	private BorderPane border = new BorderPane();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		ps = primaryStage;
		ps.setTitle("Kryptonite - Software Project 2");
		ps.setFullScreen(true);
		
		TreeView<String> tree = new TreeView<String> (new MainTree().getTree());
		tree.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        tree.getSelectionModel().selectedItemProperty().addListener(new MainTreeChangeListener(this));
		MenuBar menuBar = new MainMenu().getMenu();
		
		StackPane treePane =  new StackPane();
		centerPane = new InfoPanelFX().getPanel();
		treePane.getChildren().add(tree);
		
		border.setLeft(treePane);
		border.setTop(menuBar);
		border.setCenter(centerPane);
		
		ps.setScene(new Scene(border));
		ps.show();
	}

	public void setCenterPane(StackPane pane) {

//		BorderPane border = new BorderPane();
		centerPane = pane;
		border.setCenter(centerPane);
		ps.show();
	}
	
}
