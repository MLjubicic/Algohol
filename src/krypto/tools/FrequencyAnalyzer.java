/**
 * 
 */
package krypto.tools;

import java.util.HashMap;
import java.util.Map;

import krypto.gui.dialog.ExceptionDisplay;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class FrequencyAnalyzer {

	private Map<Character, Integer> amountMap;
	private Map<Character, Double> frequencyMap;
	
	public void calculateFrequency () {
		frequencyMap = new HashMap<Character, Double>();
		if (frequencyMap != null) {
			System.out.println("OK");
		} else {
			new ExceptionDisplay("There not data which could be calculated.");
		}
	}

	public void countItems (String str) {
		amountMap = new HashMap<Character, Integer>();
		int length = str.length();
		for (int i = 0; i < length; i++) {
			Character ch = str.charAt(i);
			if (amountMap.get(ch) != null) {
				int anz = amountMap.get(ch);
				anz++;
				amountMap.put(ch, anz);
//				System.out.println("Zeichen: " + ch + " / Anzahl: " + anz);
			} else {
				amountMap.put(ch, 1);
//				System.out.println("Zeichen: " + ch + " / Anzahl: 1");
			}
		}
	}
	
	public Map<Character, Integer> getAmountMap() {
		return amountMap;
	}
}
