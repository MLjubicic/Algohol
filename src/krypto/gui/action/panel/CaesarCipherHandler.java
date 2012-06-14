package krypto.gui.action.panel;

import java.util.Map;

import krypto.gui.javafx.panel.bottom.BottomFX;
import krypto.gui.javafx.panel.right.CaesarRightFX;
import krypto.gui.javafx.panel.right.SubstitutionRightFX;
import krypto.tools.decrypt.CaesarBruteForce;
import krypto.tools.encrypt.CaesarEncrypt;

public class CaesarCipherHandler implements CipherHandler {

	private BottomFX bottomP;
	private CaesarRightFX rightP;

	public CaesarCipherHandler(BottomFX bottomP, CaesarRightFX rightP) {
		this.bottomP = bottomP;
		this.rightP = rightP;
	}

	@Override
	public void handleDecryptEvent(String cipher) {
		CaesarBruteForce cbf = new CaesarBruteForce(cipher.toUpperCase());
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Map<Character, String> report = cbf.getReport();

		String outputStr = new String();
		for (int i = 0; i < 26; i++) {
			outputStr = outputStr + "Key: " + abc.charAt(i) + " Plain: " + report.get(abc.charAt(i)) + "\n";
		}

		bottomP.getOutputArea().setText(outputStr);
		bottomP.getTimeLabel().setText("Elapsed time: " + cbf.getTime() + " ms.");
	}

	@Override
	public String handleEncryptEvent(String plainText) {

		final Character key = rightP.getKeyField().getText().charAt(0);

		CaesarEncrypt caesar = new CaesarEncrypt(plainText, key);
		return caesar.getCipher();
	}

}
