/**
 * 
 */
package krypto.gui.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import krypto.gui.dialog.FileChooser;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class LoadListener implements ActionListener {

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		FileChooser fc = new FileChooser();
		fc.setTextFile();
		System.out.println(fc.getFile());
	}

}
