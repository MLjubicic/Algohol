/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.tools;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarBruteForce {

	private String cipher;
	private String plain;
	private Map<Character, String> report;
	private TreeSet<String> treeReport;

	public CaesarBruteForce(String cipher) {
		report = new HashMap<Character, String>();
		treeReport = new TreeSet<String>();
		this.cipher = cipher;
		plain = new String();
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i < 25; i++) {
			for (int x = 0; x < cipher.length(); x++) {
				if (cipher.charAt(x) != ' ') {
					int pos = abc.indexOf(cipher.charAt(x)) + i;
					if (pos > 25) {
						pos = pos - 26;
					}
					Character c = abc.charAt(pos);
					plain = plain + c;
				} else {
					plain = plain + ' ';
				}
			}
			report.put(abc.charAt(i), plain);
			treeReport.add(plain);
			plain = "";
		}
	}
	
	public String getCipher() {
		return cipher;
	}
	
	public Map<Character, String> getReport() {
		return report;
	}
}
