/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.main;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import krypto.gui.menu.MainMenuBar;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class KryptoFrame {

	private JFrame frame;
	
	public void initKryptoFrame() {
		frame = new JFrame("Kryptonite - Software Project 2");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JMenuBar bar = new JMenuBar();
		bar = new MainMenuBar().initMenuBar();
		
		frame.setJMenuBar(bar);
	}
	
	public void setPanel(JPanel panel) {
		frame.add(panel);
		frame.pack();
	}
	
	public void setVisibility(Boolean sw) {
		frame.setVisible(sw);
	}

}
