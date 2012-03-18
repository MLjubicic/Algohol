/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package gui;

import krypto.gui.dialog.FileChooser;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class TestFileChooser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileChooser fc = new FileChooser();
		fc.setTextFile();
		System.out.println("Selected File: " + fc.getFile());
	}

}
