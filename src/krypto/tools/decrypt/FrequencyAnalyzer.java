/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.tools.decrypt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import krypto.tools.FrequencyBean;
import krypto.tools.SetSpaces;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class FrequencyAnalyzer {

	private Map<Character, Integer> amountMap;
	private Map<Character, Double> frequencyMap;
	private List<FrequencyBean> frequencyList;
	private String original;

	/*
	 * Method calculates the frequency out of an amount map and save the result
	 * in a new HashMap (frequencyMap).
	 */
	public void calculateFrequency() {
		frequencyMap = new HashMap<Character, Double>();
		frequencyList = new ArrayList<FrequencyBean>();
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < 26; i++) {
			frequencyMap.put(abc.charAt(i), (double) 0);
		}
		
		Double len = (double) original.length();
		
		for (Iterator<Character> iter = amountMap.keySet().iterator(); iter.hasNext();) {
			Character key = iter.next();
			double percentage = (double) (amountMap.get(key) / len * 100);
			frequencyMap.put(key, percentage);
			frequencyList.add(new FrequencyBean(key, percentage));
		}
		
	}

	/*
	 * Method calculates out of a string a HashMap which stores as key the
	 * character and as value the quantity of this character in the string.
	 */
	public void countItems(String str) {
		SetSpaces setSpaces = new SetSpaces();
		str = setSpaces.delete(str);
		str = str.toUpperCase();
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

	/**
	 * @return the frequencyList
	 */
	public List<FrequencyBean> getFrequencyList() {
		return frequencyList;
	}

	/**
	 * @param frequencyList the frequencyList to set
	 */
	public void setFrequencyList(List<FrequencyBean> frequencyList) {
		this.frequencyList = frequencyList;
	}
	
}
