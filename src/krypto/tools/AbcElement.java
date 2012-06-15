/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.tools;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class AbcElement {

	private Character letter;
	private Double frequency;

	public AbcElement(Character letter, Double frequency) {
		this.letter = letter;
		this.frequency = frequency;
	}

	/**
	 * @return the letter
	 */
	public Character getLetter() {
		return letter;
	}

	/**
	 * @return the frequency
	 */
	public Double getFrequency() {
		return frequency;
	}

}
