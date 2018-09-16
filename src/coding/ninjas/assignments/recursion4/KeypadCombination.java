package recursion4;

/*Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Note : The order of strings are not important.
Input Format :
Integer n
Output Format :
All possible strings in different lines
*/
public class KeypadCombination {

	public static String[] keypad(int n) {
		// Write your code here

		if (n == 0) {
			String[] arr = { "" };
			return arr;
		}

		String[] smallAns = keypad(n / 10);

		String words = mapping(n % 10);

		String[] result = new String[words.length() * smallAns.length];
		int k = 0;
		for (int i = 0; i < words.length(); i++) {
			for (int j = 0; j < smallAns.length; j++) {
				result[k++] = smallAns[j] + words.charAt(i);
			}
		}
		return result;
	}

	static String mapping(int i) {

		String arr[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		return arr[i];
	}

}
