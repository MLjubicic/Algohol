/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import krypto.gui.dialog.ExceptionDisplay;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class LoadTextFile {

	String str = new String();
	
	public void loadFile (File file) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			new ExceptionDisplay("Error while initializing file reader");
			e1.printStackTrace();
		}
		try {
			for (@SuppressWarnings("unused")
			int i; (i = reader.read()) != -1;) {
				str = str + reader.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			new ExceptionDisplay("Reading Error while trying to read: " + file);
			e.printStackTrace();
		}
	}
	
	public String getStr() {
		return str;
	}
}
