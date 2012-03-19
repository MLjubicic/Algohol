/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.tools;

import java.util.Map;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarBruteForce {

	private String cipher;
	private String plain;
	private Map<Character, String> report;

	public CaesarBruteForce(String cipher) {
		this.cipher = cipher;
		plain = new String();
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i < 26; i++) {
			for (int len = cipher.length(); len > 0; len--) {
				if (cipher.charAt(len) != ' ') {
					int pos = abc.indexOf(cipher.charAt(len) + i);
					if (pos > 25) {
						pos = pos - 25;
					}
					Character c = abc.charAt(pos);
					plain = c + plain;
				} else {
					plain = ' ' + plain;
				}
			}
			report.put(abc.charAt(i), plain);
		}
	}
	
	public String getCipher() {
		return cipher;
	}
	
	public Map<Character, String> getReport() {
		return report;
	}
}
