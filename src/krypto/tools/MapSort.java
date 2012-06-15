/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.tools;

import java.util.HashMap;
import java.util.Map;

/**
 * A basic character mapper to map the determined characters from a given input
 * to the most frequent characters of a specific language
 * 
 * @author Miro Ljubicic
 * @version 0.1
 */
public class MapSort {

	private Map<Character, Double> inputMap;
	private Map<Integer, AbcElement> frequencySortedMap;

	public MapSort(Map<Character, Double> inputMap) {
		this.inputMap = inputMap;
	}

	public void sortMap() {
		Character highestKey = 'A';
		Double highestValue = 0.0;
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for (int i = 25; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (inputMap.containsKey(abc.charAt(j))) {
					if (highestValue < inputMap.get(abc.charAt(j))) {
						highestKey = abc.charAt(j);
						highestValue = inputMap.get(abc.charAt(j));
					}
				}
			}
			AbcElement element = new AbcElement(highestKey, highestValue);
			frequencySortedMap = new HashMap<Integer, AbcElement>();
			frequencySortedMap.put(25 - i, element);
			inputMap.remove(highestKey);
		}
	}

	public Map<Integer, AbcElement> getFrequencySortedMap() {
		return frequencySortedMap;
	}
}
