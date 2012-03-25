/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.tools.encrypt;

import com.sun.org.apache.xpath.internal.operations.Mod;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarEncrypt {

	private String cipher;
	private String plain;
	private Character key;

	public CaesarEncrypt(String plain, Character key) {
		this.plain = plain.toUpperCase();
		this.key = Character.toUpperCase(key);
		cipher = new String();
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int k = abc.indexOf(this.key) + 1;
		for (int i = 0; i < plain.length(); i++) {
			Character z = this.plain.charAt(i);
			if (z != ' ') {
				Integer x = abc.indexOf(z) + k;
				z = abc.charAt(x.Mod(26));
				cipher = cipher + z;
//			int pos = abc.indexOf(this.plain.charAt(i)) + dis;
//			if (pos > 25) {
//				pos = pos -26;
//			}
//			Character c = abc.charAt(pos);
//			cipher = cipher + Character.toUpperCase(c);
			} else {
				cipher = cipher + ' ';
			}
		}
		this.plain = plain.toLowerCase();
	}

	public String getCipher() {
		return cipher;
	}

	public Character getKey() {
		return key;
	}

	public String getPlain() {
		return plain;
	}
}
