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
public class KryptoFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 614313251824000860L;
	private JFrame frame;
	
	public KryptoFrame() {
		frame = new JFrame("Kryptonite - Software Project 2");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JMenuBar bar = new JMenuBar();
		bar = new MainMenuBar(frame).initMenuBar();
		
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
