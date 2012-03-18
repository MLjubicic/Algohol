/**
 *  Class which should test the major functionality of our software project.
 *  Should be later in project the base of our main class.
 *  Now we use this class to test how the different classes work together.  
 */
package main;

import krypto.data.Cipher;
import krypto.gui.dialog.FileChooser;
import krypto.io.LoadTextFile;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class Kryptonite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileChooser fc = new FileChooser();
		LoadTextFile ltf = new LoadTextFile();
		Cipher cipher = new Cipher();
		fc.setTextFile();
		ltf.loadFile(fc.getFile());
		cipher.setCipherString(ltf.getStr());
		System.out.println(cipher.getCipherString());
	}

}
