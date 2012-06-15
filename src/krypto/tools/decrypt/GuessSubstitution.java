/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.tools.decrypt;

import java.util.Map;

import javafx.scene.control.TextField;

import krypto.gui.javafx.panel.right.SubstitutionRightFX;
import krypto.tools.AbcElement;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class GuessSubstitution {

	public GuessSubstitution(SubstitutionRightFX rightPanel, Map<Integer, AbcElement> map) {
			Map<Integer, TextField> boxMap = rightPanel.getCipherCharacterField();
			
			System.out.println(boxMap.get(4));
			TextField field = boxMap.get(4);
			field.setText(String.valueOf(map.get(0)));
			boxMap.put(4, field);
			
			
	}
}
