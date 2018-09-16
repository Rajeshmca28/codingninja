package HashMap2;

import java.util.LinkedHashMap;
import java.util.Map;

//Given a string, you need to remove all the duplicates. That means, the output string should contain each character only once. The respective order of characters should remain same.

public class ExtractUniqueCharacter {
	public static String uniqueChar(String str) {
		// Write your code here
		Map<Character, Character> map = new LinkedHashMap<Character, Character>();

		for (int i = 0; i < str.length(); i++) {

			map.put(str.charAt(i), null);
		}
		String temp = "";
		for (Character keys : map.keySet()) {
			temp += keys;
		}
		return temp;

	}

}
