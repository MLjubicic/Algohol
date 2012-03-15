package krypto.gui.dialog;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser {

	/**
	 * @author Mathias Weigert & Miro Ljubicic
	 * @version 1.0
	 */

	private File directory;

	/**
	 * 
	 */
	public void setEQ2LogFileDirectory() {
		JFileChooser fc =  new JFileChooser();
		fc.setDialogTitle("Software Projekt 2 - Kryptologie");
		fc.setApproveButtonText("Choose Directory");
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fc.setFileFilter(new FileNameExtensionFilter("Path", ".*"));

		int returnVal = fc.showOpenDialog(new JFrame());

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			directory = fc.getSelectedFile();
		}
	}

	/**
	 * Method which returns the selected path
	 * @return directory
	 */
	public File getDirectory() {
		if (directory == null) {
			new ExceptionDisplay("No path choosed.");
		}
		return directory;
	}
}