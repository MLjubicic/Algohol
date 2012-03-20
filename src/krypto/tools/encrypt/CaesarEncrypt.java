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
		this.plain = plain;
		this.key = key;
		cipher = new String();
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int dis = abc.indexOf(Character.toUpperCase(key));
		for (int i = 0; i < plain.length(); i++) {
			int pos = abc.indexOf(plain.charAt(i)) + dis;
			Character c = abc.charAt(pos);
			cipher = cipher + Character.toUpperCase(c);
		}
		System.out.println("Plain: " + plain);
		System.out.println("Key: " + key);
		System.out.println("Cipher: "+ cipher);
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
