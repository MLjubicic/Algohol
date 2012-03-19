/**
 * 
 */
package tools;

import java.io.File;
import java.util.Map;

import krypto.io.LoadTextFile;
import krypto.tools.CaesarBruteForce;

/**
 * @author MWeigert
 *
 */
public class TestCaesarBruteForce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoadTextFile ltf = new LoadTextFile();
		File file = new File("D:\\Daten\\Dropbox\\Semester04\\InformatikProjekt\\Grup" +
				"pen\\Gruppe_10_Weigert_Ljubicic\\Cipher\\Caesar.txt");
		ltf.loadFile(file);
		CaesarBruteForce cb = new CaesarBruteForce(ltf.getStr());
		Map<Character, String> report = cb.getReport();
	}

}
