/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package tools.encrypt;

import krypto.tools.encrypt.SkytaleEncrypt;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class TestSkytaleEncrypt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkytaleEncrypt ste = new SkytaleEncrypt("Fischers Fritz fischt frische Fische", 5);
		System.out.println("Plain:  " + ste.getPlain().toLowerCase());
		System.out.println("Cipher :" + ste.getCipher());
	}

}
