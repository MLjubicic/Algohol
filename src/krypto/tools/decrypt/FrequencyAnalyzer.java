/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.tools.decrypt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import krypto.tools.SetSpaces;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class FrequencyAnalyzer {

	private Map<Character, Integer> amountMap;
	private Map<Character, Double> frequencyMap;
	private String original;

	/*
	 * Method calculates the frequency out of an amount map and save the result in
	 * a new HashMap (frequencyMap).
	 */
	public void calculateFrequency () {
		frequencyMap = new HashMap<Character, Double>();
		Double len = (double) original.length();
		for (Iterator<Character> iter = amountMap.keySet().iterator(); iter.hasNext();) {
			Character key = iter.next();
			double percentage = (double) (amountMap.get(key) / len * 100);
			frequencyMap.put(key, percentage);
		}
	}

	/*
	 * Method calculates out of a string a HashMap which stores as key the character
	 * and as value the quantity of this character in the string.
	 */
	public void countItems (String str) {
		SetSpaces setSpaces = new SetSpaces();
		str = setSpaces.delete(str);
		original = str;
		amountMap = new HashMap<Character, Integer>();
		int length = str.length();
		for (int i = 0; i < length; i++) {
			Character ch = str.charAt(i);
			if (amountMap.get(ch) != null) {
				int anz = amountMap.get(ch);
				anz++;
				amountMap.put(ch, anz);
			} else {
				amountMap.put(ch, 1);
			}
		}
	}

	public Map<Character, Integer> getAmountMap() {
		return amountMap;
	}
	
	public Map<Character, Double> getFrequencyMap() {
		return frequencyMap;
	}
}
