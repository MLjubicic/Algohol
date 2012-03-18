/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import krypto.gui.action.ExitListener;
import krypto.gui.action.LoadListener;
import krypto.gui.action.VersionListener;

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

		JMenuItem loadItem = new JMenuItem("Load Cipher");
		loadItem.setMnemonic('L');
		loadItem.addActionListener(new LoadListener());
		fileMenu.add(loadItem);

		JSeparator sepFileMenu = new JSeparator();
		fileMenu.add(sepFileMenu);
		
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.setMnemonic('x');
		exitItem.addActionListener(new ExitListener());
		fileMenu.add(exitItem);

		JMenu helpMenu = new JMenu("Help");
		helpMenu.setMnemonic('H');

		JMenuItem versionItem = new JMenuItem("Version");
		versionItem.setMnemonic('V');
		versionItem.addActionListener(new VersionListener());

		helpMenu.add(versionItem);

		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		return menuBar;
	}
}
