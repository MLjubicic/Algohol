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
import krypto.gui.action.menu.MainTreeChangeListener;
import krypto.gui.action.panel.CaesarCipherHandler;
import krypto.gui.action.panel.SubstitutionCipherHandler;
import krypto.gui.javafx.elements.MainTree;
import krypto.gui.javafx.panel.BasePanel;
import krypto.gui.javafx.panel.ChiffrePanelFX;
import krypto.gui.javafx.panel.InfoPanelFX;
import krypto.gui.javafx.panel.bottom.BottomFX;
import krypto.gui.javafx.panel.right.CaesarRightFX;
import krypto.gui.javafx.panel.right.SubstitutionRightFX;
import krypto.gui.menu.MainMenu;

/**
 * Hauptklasse dient zum starten der Applikation.
 * 
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class Kryptonite extends Application {

	private StackPane centerPane;
	private StackPane rightPane;
	private StackPane bottomPane;
	private Stage ps;
	private BorderPane border = new BorderPane();
	private Boolean infoMode;

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
		// ps.setFullScreen(true);

		TreeView<String> tree = new TreeView<String>(new MainTree().getTree());
		tree.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		tree.getSelectionModel().selectedItemProperty().addListener(new MainTreeChangeListener(this));
		centerPane = new InfoPanelFX().getPanel();

		MenuBar menuBar = new MainMenu(ps, this).getMenu();

		StackPane treePane = new StackPane();
		infoMode = true;
		treePane.getChildren().add(tree);

		border.setLeft(treePane);
		border.setTop(menuBar);
		border.setCenter(centerPane);

		ps.setScene(new Scene(border));
		ps.sizeToScene();
		ps.show();
	}

	public Boolean getInfoMode() {
		return infoMode;
	}

	/**
	 * Setzt die Panels, je nach ausgewählter Verschlüsselungstechnik.
	 * 
	 * @param ciffrePanel
	 * @param rightPanel
	 * @param bottomPanel
	 */
	public void setCipherPanels(ChiffrePanelFX ciffrePanel, BasePanel rightPanel, BasePanel bottomPanel) {

		infoMode = false;
		centerPane = ciffrePanel.getPanel();
		border.setCenter(centerPane);
		this.setRightPane(rightPanel.getPanel());
		this.setBottomPane(bottomPanel.getPanel());
		ps.sizeToScene();
		ps.show();
	}

	public void setBottomPane(StackPane pane) {
		bottomPane = pane;
		border.setBottom(bottomPane);
		ps.sizeToScene();
		ps.show();
	}

	public void setCenterPane(StackPane pane) {

		centerPane = pane;
		border.setCenter(centerPane);
		ps.sizeToScene();
		ps.show();
	}

	/**
	 * @return the centerPane
	 */
	public StackPane getCenterPane() {
		return centerPane;
	}

	public void setInfoMode(Boolean infoMode) {
		this.infoMode = infoMode;
	}

	public void setRightPane(StackPane pane) {

		rightPane = pane;
		border.setRight(rightPane);
		ps.sizeToScene();
		ps.show();
	}

}
