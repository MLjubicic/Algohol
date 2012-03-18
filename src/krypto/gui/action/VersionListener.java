/**
 * 
 */
package krypto.gui.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import krypto.gui.dialog.VersionInformation;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class VersionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		new VersionInformation();
	}
}
