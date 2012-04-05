/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.panel;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Mathias Weigert & Miro Ljubicic 
 * @version 1.0
 */
public class SkytalePanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4634753025095759825L;
	private JPanel skyPanel;
	
	public SkytalePanel() {
		skyPanel = new JPanel();
		skyPanel.setLayout(null);
		
		JLabel tstLabel = new JLabel("Skytale Panel");
		skyPanel.add(tstLabel);
	}
	
	public JPanel getSkyPanel() {
		return skyPanel;
	}
}
