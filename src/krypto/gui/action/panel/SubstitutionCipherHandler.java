package krypto.gui.action.panel;

import javafx.stage.Stage;
import krypto.gui.javafx.charts.FrequencyChart;
import krypto.gui.javafx.panel.bottom.BottomFX;
import krypto.gui.javafx.panel.right.SubstitutionRightFX;
import krypto.tools.decrypt.FrequencyAnalyzer;

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
		FrequencyChart chart = new FrequencyChart();
		chart.start(new Stage());
	}

	@Override
	public String handleEncryptEvent(String plainText) {
		// TODO Auto-generated method stub
		return "--- not yet implemented ---";
	}

}
