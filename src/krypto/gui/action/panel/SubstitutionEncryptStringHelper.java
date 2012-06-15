package krypto.gui.action.panel;

import java.util.Map;

public class SubstitutionEncryptStringHelper {

	public static String decryptText(String input, Map<Character, Character> map) {
		StringBuilder sb = new StringBuilder();

		for (Character c : input.toUpperCase().toCharArray()) {
			if (c == ' ') {
				sb.append(' ');
			} else {
				sb.append(map.get(c));
			}
		}

		return sb.toString();
	}
}
