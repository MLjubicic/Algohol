/**
 * 
 */
package tools;

import java.io.File;

import krypto.io.LoadTextFile;
import krypto.tools.FrequencyAnalyzer;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class TestFrequencyAnalyzer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoadTextFile ltf = new LoadTextFile();
		File file = new File("D:\\Daten\\Dropbox\\Java Projekte\\EQ2 Logs\\Test_LOG.txt");
		ltf.loadFile(file);
		FrequencyAnalyzer fa = new FrequencyAnalyzer();
		fa.countItems(ltf.getStr().toLowerCase());
	}

}
