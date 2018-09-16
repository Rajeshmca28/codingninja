package String.twoDArray;

/*Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Input Format :
String S
*/
public class MinimumLengthOfWord {
	public static String minLengthWord(String input) {

		String str = input + " ";
		char ch = ' ';
		int len = str.length(), l = 0;
		int min = len;
		String minWord = "", word = "";
		for (int i = 0; i < len; i++) {
			ch = str.charAt(i);
			if (ch != ' ') {
				word += ch;
			} else {
				l = word.length();
				if (l < min) {
					min = l;
					minWord = word;
				}
				word = "";
			}
		}
		return minWord;
	}

}
