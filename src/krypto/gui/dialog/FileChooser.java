/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.dialog;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileChooser {

	/**
	 * @author Mathias Weigert & Miro Ljubicic
	 * @version 1.0
	 */

	private File file;

	/**
	 *  Method which opens a file chooser. 
	 *  NEED: We should write a file filter for this method.
	 *        Which shows only txt files.
	 */
	public void setTextFile() {
		JFileChooser fc =  new JFileChooser();
		fc.setDialogTitle("Software Projekt 2 - Kryptologie");
		fc.setApproveButtonText("Choose Textfile");
//		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//		fc.setFileFilter(new FileNameExtensionFilter("Path", ".*"));

		int returnVal = fc.showOpenDialog(new JFrame());

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			file = fc.getSelectedFile();
		}
	}

	/**
	 * Method which returns the selected file
	 * @return file
	 */
	public File getFile() {
		if (file == null) {
			new ExceptionDisplay("No file choosed!");
		}
		return file;
	}
}