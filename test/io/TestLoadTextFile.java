/**
 * 
 */
package io;

import java.io.File;

import krypto.io.LoadTextFile;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class TestLoadTextFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoadTextFile ltf = new LoadTextFile();
		File file = new File("D:\\Daten\\Dropbox\\Java Projekte\\EQ2 Logs\\Test_LOG.txt");
		ltf.loadFile(file);
		System.out.println("Loaded Text:");
		System.out.println(ltf.getStr());
	}

}
