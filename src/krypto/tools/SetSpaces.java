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
public class SetSpaces {

	/**
	 * Method which deletes all spaces in a String.
	 * @param str
	 * @return
	 */
	public String delete(String str) {
		StringBuffer sbuff = new StringBuffer();
		sbuff.setLength(str.length());
		int current = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') sbuff.setCharAt(current++, str.charAt(i));
		}
		str = sbuff.toString();
		return str;
	}
	
	/**
	 * Method which interrupts each n characters by a space.
	 * @param str
	 * @param n
	 * @return
	 */
	public String fix(String str, int n) {
		str = this.delete(str);
		String fStr = "";
		int end = 0;
		for (int i = 0; i < str.length(); i = i  + n) {
			end = i + n;
			if (end > str.length()) end = str.length();
			fStr = fStr + str.substring(i, end) + ' ';
		}
		return fStr;
	}
}
