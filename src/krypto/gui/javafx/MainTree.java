/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.javafx;

import javafx.scene.control.TreeItem;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class MainTree {

	private TreeItem<String> tree;
	
	public MainTree() {
		tree = new TreeItem<String> ("Kryptonite");
		tree.setExpanded(true);
		TreeItem<String> monoItem = new TreeItem<String> ("Monoalphabetic Ciphers");
		tree.getChildren().add(monoItem);
		TreeItem<String> caesarItem = new TreeItem<String> ("Caesar Cipher");
		monoItem.getChildren().add(caesarItem);
		TreeItem<String> skytaleItem = new TreeItem<String>	("Skytale Cipher");
		monoItem.getChildren().add(skytaleItem);
		TreeItem<String> substItem = new TreeItem<String> ("Substitution Cipher");
		monoItem.getChildren().add(substItem);
		TreeItem<String> polyItem = new TreeItem<String> ("Polyalphabetic Ciphers");
		tree.getChildren().add(polyItem);
		TreeItem<String> vigenereItem = new TreeItem<String> ("Vigenère Cipher");
		polyItem.getChildren().add(vigenereItem);
	}
	
	public TreeItem<String> getTree() {
		return tree;
	}
	
}
