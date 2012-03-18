/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.dialog;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class VersionInformation {

	public VersionInformation() {
		JOptionPane.showMessageDialog(new JFrame(), "Kryptonite V. 1.0", "Version", JOptionPane.INFORMATION_MESSAGE);
	}
}
