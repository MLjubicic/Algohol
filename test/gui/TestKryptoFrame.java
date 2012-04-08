/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package gui;

import krypto.gui.main.KryptoFrame;
import krypto.gui.panel.CaesarPanel;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class TestKryptoFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KryptoFrame kFrame = new KryptoFrame();
		// Test CaesarPanel
		CaesarPanel cpanel = new CaesarPanel();
		kFrame.setPanel(cpanel.getCaesarPanel());
		kFrame.setVisibility(true);
	}

}
