/**
 * 
 */
package krypto.tools;

import java.util.HashMap;
import java.util.Map;

import krypto.data.Alphabet;

/**
 * A basic character mapper to map the determined characters 
 * from a given input to the most frequent characters of a specific language
 * @author Miro Ljubicic
 * @version 0.1
 */
public class CharacterMapper {


	public HashMap<Character, Character> getCharacterMapping(Enum<?> frequencyMap,
			HashMap<Character, Double> resultFrequencyAnalysisMap) {

		/** Erzeuge eine HashMap um das Ergebnis/Rückgabewert dieser Methode zu speichern */
		HashMap<Character, Character> modifiedMapping = new HashMap<Character,Character>();


		/** 
		 * Iteriere über die HashMap "resultFrequencyAnalysisMap" (Klasse "FrequencyAnalyzer"), um nach 
		 * Auftretenswahrscheinlichkeit zu sortieren
		 */
		System.out.println("unsorted map");
		for (Character key : resultFrequencyAnalysisMap.keySet()) {
			System.out.println("key/value: " + key + "/" + resultFrequencyAnalysisMap.get(key));
		}

		HashMap<Character, Double> sortedMap = null;
		sortedMap.putAll(resultFrequencyAnalysisMap);

		System.out.println("results");
		for (Character key : sortedMap.keySet()) {
			System.out.println("key/value: " + key + "/" + sortedMap.get(key));
		}


		/** 
		 * Iteriere über das Enum "Alphabet", um nach Auftretenswahrscheinlichkeit zu 
		 * sortieren
		 */
		for (Alphabet frequencyMapTemp : Alphabet.values()) {
			System.out.println(frequencyMapTemp.getFrequency());
		}




		return modifiedMapping;

	}


}
