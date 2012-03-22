/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.tools.encrypt;

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
		this.key = key;
		cipher = new String();
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int dis = abc.indexOf(Character.toUpperCase(key));
		for (int i = 0; i < plain.length(); i++) {
			if (this.plain.charAt(i) != ' ') {
			int pos = abc.indexOf(this.plain.charAt(i)) + dis;
			if (pos > 25) {
				pos = pos -26;
			}
			Character c = abc.charAt(pos);
			cipher = cipher + Character.toUpperCase(c);
			} else {
				cipher = cipher + ' ';
			}
		}
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
