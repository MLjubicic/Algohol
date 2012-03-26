/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package tools.encrypt;

import krypto.tools.encrypt.CaesarEncrypt;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class TestCaesarEncrypt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaesarEncrypt ce = new CaesarEncrypt("Fischers Fritz fischt frische Fische", 'G');
		System.out.println("Plain:  " + ce.getPlain().toLowerCase());
		System.out.println("Cipher: " + ce.getCipher());
	}

}
