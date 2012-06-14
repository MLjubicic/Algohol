package krypto.gui.action.panel;

public interface CipherHandler {

	public void handleDecryptEvent(String cipherText);

	public String handleEncryptEvent(String plainText);

}
