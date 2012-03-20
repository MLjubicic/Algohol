/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package tools.decrypt;

import java.util.Map;

import krypto.tools.decrypt.CaesarBruteForce;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class TestCaesarBruteForce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str = "VHqDP zqwJ yC AECFBuJJ LuHMqxHBEIJuD jqNy GKuH tKHsx RqOuHD";
		CaesarBruteForce cb = new CaesarBruteForce(str.toUpperCase());
		Map<Character, String> report = cb.getReport();
		System.out.println("Cipher:       " + cb.getCipher());
		System.out.println("******************************************" +
				"*******************************");
		for (int i = 0; i < 26; i++) {
			System.out.println("Key: " + abc.charAt(i) + " Plain: " + report.get(abc.charAt(i)));
		}
	}

}
