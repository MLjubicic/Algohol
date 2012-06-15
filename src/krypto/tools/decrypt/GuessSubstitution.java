/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.tools.decrypt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.scene.control.TextField;
import krypto.data.Alphabet;
import krypto.gui.javafx.panel.right.SubstitutionRightFX;
import krypto.tools.FrequencyBean;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class GuessSubstitution {

	public GuessSubstitution(SubstitutionRightFX rightPanel, List<FrequencyBean> freq, List<FrequencyBean> alphab) {
		Map<Integer, TextField> boxMap = rightPanel.getCipherCharacterField();

		String abcd = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Collections.sort(alphab);

		for (int i = 0; i < alphab.size(); i++) {
			int pos = abcd.indexOf(alphab.get(i).getLetter());

			TextField field = boxMap.get(pos);
			if (i < freq.size()) {
				field.setText(String.valueOf(freq.get(i).getLetter()));
			} else {
				field.setText(String.valueOf("-"));
			}
			boxMap.put(pos, field);
		}
		//
		// TextField field = boxMap.get(4);
		// field.setText(String.valueOf(freq.get(0)));
		// boxMap.put(4, field);

	}
}
