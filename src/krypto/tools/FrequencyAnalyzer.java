/**
 * 
 */
package krypto.tools;

import java.io.CharConversionException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class FrequencyAnalyzer {

	private Map<Character, Integer> amountMap = new HashMap<Character, Integer>();
	
	public void countItems (String str) {
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
}
