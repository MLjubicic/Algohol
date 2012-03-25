/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.panel;

import javax.swing.JPanel;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class CaesarPanel {

	private JPanel cPanel;
	
	public CaesarPanel() {
		cPanel = new JPanel();
	}
	
	public JPanel getCaesarPanel() {
		return cPanel;
	}
}
