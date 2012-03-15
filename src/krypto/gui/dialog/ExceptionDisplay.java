package krypto.gui.dialog;
/**
 * 
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class ExceptionDisplay {

	/**
	 * Method which displays a error message
	 * @param msg
	 */
	public ExceptionDisplay (String msg) {
		JOptionPane.showMessageDialog(new JFrame(), msg, "Kryptologie", JOptionPane.ERROR_MESSAGE);  
	}

}
