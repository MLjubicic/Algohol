/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.action.panel;

import javafx.stage.Stage;
import krypto.gui.javafx.charts.FrequencyChart;
import krypto.gui.javafx.panel.bottom.BottomFX;
import krypto.gui.javafx.panel.right.SubstitutionRightFX;
import krypto.tools.MapSort;
import krypto.tools.decrypt.FrequencyAnalyzer;
import krypto.tools.decrypt.GuessSubstitution;

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
	public void handleDecryptEvent(String cipher) {
		FrequencyAnalyzer fa = new FrequencyAnalyzer();
		fa.countItems(cipher);
		fa.calculateFrequency();
		FrequencyChart chart = new FrequencyChart(fa.getFrequencyMap());
		chart.start(new Stage());
		MapSort ms = new MapSort(fa.getFrequencyMap());
		GuessSubstitution gs = new GuessSubstitution(rightP, ms.getFrequencySortedMap());
	}

	@Override
	public String handleEncryptEvent(String plainText) {
		// TODO Auto-generated method stub
		return "--- not yet implemented ---";
	}

}
