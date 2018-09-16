package String.twoDArray;

/*Given a String s, check it its palindrome. Return true if string is palindrome, else return false.
Palindrome strings are those, where string s and its reverse is exactly same.
Input Format :
 String S
*/
public class StringPalindrom {
	public static boolean checkPalindrome(String str) {

		String s = "";
		for (int i = 0; i < str.length() - 1; i++) {
			s = str.charAt(i) + s;
		}
		if (str.equals(s)) {
			return true;
		} else
			return false;
	}
}
