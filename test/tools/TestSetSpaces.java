/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package tools;

import krypto.tools.SetSpaces;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class TestSetSpaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetSpaces space = new SetSpaces();
		String str = "Einst ging ich am Strande der Donau entlang. Ein schlafendes Mädel am Ufer ich fand. Ohh oh oh olala.";
		System.out.println("Original String: " + str);
		System.out.println("ohne Spaces: " + space.delete(str));
		System.out.println("Space alle 4 Zeichen: " + space.fix(str, 4));
		System.out.println("Space nach jedem Zeichen: " + space.fix(str, 1));
	}

}
