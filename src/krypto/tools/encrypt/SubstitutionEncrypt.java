/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.tools.encrypt;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.control.TextField;
import krypto.data.Alphabet;
import krypto.gui.action.panel.SubstitutionEncryptStringHelper;
import krypto.gui.javafx.panel.right.SubstitutionRightFX;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class SubstitutionEncrypt {

	private String cipher;
	private String plainText;

	public SubstitutionEncrypt(SubstitutionRightFX rightP, String plainText) {
		Map<Integer, TextField> cipherMap = ((SubstitutionRightFX) rightP).getCipherCharacterField();
		this.plainText = plainText;

		Map<Character, Character> mapper = new HashMap<Character, Character>();
		int i = 0;
		for (Alphabet abc : Alphabet.values()) {
			if (cipherMap.get(i) != null && cipherMap.get(i).getText() != null
					&& !"".equals(cipherMap.get(i).getText())) {
				mapper.put(abc.name().charAt(0), cipherMap.get(i).getText().charAt(0));
			} else {
				mapper.put(abc.name().charAt(0), '-');
			}
			i++;
		}

		cipher = SubstitutionEncryptStringHelper.decryptText(plainText, mapper);
	}

	/**
	 * @return the cipher
	 */
	public String getCipher() {
		return cipher;
	}
}
