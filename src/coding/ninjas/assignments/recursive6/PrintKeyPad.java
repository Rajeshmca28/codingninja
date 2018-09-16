package recursive6;

/*Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.
Note : The order of strings are not important. Just print different strings in new lines.
Input Format :
Integer n
Output Format :
All possible strings in different lines
*/
public class PrintKeyPad {
	public static String[] keypad(int n) {
		// Write your code here
		if (n == 0) {
			String[] str = { "" };
			return str;
		}
		String[] s1 = keypad(n / 10);
		String s = returnString(n % 10);
		String[] output = new String[s.length() * s1.length];
		int count = 0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s.length(); j++) {
				output[count++] = s1[i] + s.charAt(j);
			}
		}
		return output;
	}

	static String returnString(int n) {
		String[] str = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		return str[n];
	}
}
