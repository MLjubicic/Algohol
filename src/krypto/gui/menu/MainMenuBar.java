/**
 * 
 */
package krypto.gui.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class MainMenuBar {

	private JMenuBar menuBar;
	
	public JMenuBar initMenuBar() {
		menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic('F');
		
		JMenu helpMenu = new JMenu("Help");
		helpMenu.setMnemonic('H');
		
		JMenuItem versionItem = new JMenuItem("Version");
		versionItem.setMnemonic('V');
		
		helpMenu.add(versionItem);
		
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		return menuBar;
	}
}
