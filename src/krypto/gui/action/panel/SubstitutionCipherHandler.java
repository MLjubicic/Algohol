/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.action.panel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import krypto.data.Alphabet;
import krypto.gui.javafx.charts.FrequencyChart;
import krypto.gui.javafx.panel.bottom.BottomFX;
import krypto.gui.javafx.panel.right.SubstitutionRightFX;
import krypto.tools.FrequencyBean;
import krypto.tools.MapSort;
import krypto.tools.decrypt.FrequencyAnalyzer;
import krypto.tools.decrypt.GuessSubstitution;
import krypto.tools.encrypt.SubstitutionEncrypt;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class SubstitutionCipherHandler implements CipherHandler {

	private BottomFX bottomP;
	private SubstitutionRightFX rightP;

	public SubstitutionCipherHandler(BottomFX bottomP, SubstitutionRightFX rightP) {
		this.bottomP = bottomP;
		this.rightP = rightP;
	}

	@Override
	/**
	 * Kontrolliert Entschlüsselung des Substitutions Ciphers mittels Frequenzanalyse.
	 */
	public void handleDecryptEvent(String cipher) {
		FrequencyAnalyzer fa = new FrequencyAnalyzer();
		fa.countItems(cipher);
		fa.calculateFrequency();
		FrequencyChart chart = new FrequencyChart(fa.getFrequencyMap());
		chart.start(new Stage());

		List<FrequencyBean> freq = fa.getFrequencyList();
		Collections.sort(freq);

		MapSort ms = new MapSort(fa.getFrequencyMap());
		ms.sortMap();

		List<FrequencyBean> alphab = new ArrayList<FrequencyBean>();
		for (Alphabet abc : Alphabet.values()) {
			alphab.add(new FrequencyBean(abc.name().charAt(0), abc.getFrequency()));
		}

		GuessSubstitution gs = new GuessSubstitution(rightP, freq, alphab);

		Map<Character, Character> mapper = new HashMap<Character, Character>();

		for (int i = 0; i < freq.size(); i++) {
			mapper.put(freq.get(i).getLetter(), alphab.get(i).getLetter());
		}

		bottomP.getOutputArea().setText(SubstitutionEncryptStringHelper.decryptText(cipher, mapper));

	}

	@Override
	/**
	 * Kontrolliert die Verschlüsselung mittels Substitutions Cipher.
	 */
	public String handleEncryptEvent(String plainText) {
		SubstitutionEncrypt subEncrypt = new SubstitutionEncrypt(rightP, plainText);
		return subEncrypt.getCipher();
	}

}
