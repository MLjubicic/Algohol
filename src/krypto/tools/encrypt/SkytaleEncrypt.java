/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.tools.encrypt;

import java.util.Map;

import krypto.gui.dialog.ExceptionDisplay;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class SkytaleEncrypt {

	private String plain;
	private String cipher;
	private Integer key;
	private Map<Integer, String> skytale;

	public SkytaleEncrypt(String plain, Integer key) {
		this.plain = plain.toLowerCase();
		this.key = key;
		if (key > plain.length()) {
			new ExceptionDisplay("Sorry der Schlüssel kann bei Skytale nicht " +
			"größer sein, als der Reintext lang ist!");
		} else {
//			int s = GanzzahlDivision von plain.length/key (immer Aufrunden)
			for (int i = 1; i < (plain.length()/s); i++) {
				skytale.put(i, plain.substring(i * key - key, i * key - 1));
			}
		}
	}

	/*
	 * Method writes the Skytale Cipher map in a String and gives String back.
	 */
	public String getCipher() {
		cipher = new String();
		for (int j = 0; j < key; j++) {
			for (int i = 1; i <= skytale.size(); i++) {
					cipher = cipher + skytale.get(i).charAt(j);
			}
		}
		return cipher;
	}

	public Integer getKey() {
		return key;
	}

	public String getPlain() {
		return plain;
	}
}
