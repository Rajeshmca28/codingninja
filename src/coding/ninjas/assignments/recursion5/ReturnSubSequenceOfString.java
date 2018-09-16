package recursion5;

/*Given a string (lets say of length n), return all the subsequences of the given string.
Subsequences contain all the strings of length varying from 0 to n. But the order of characters should remain same as in the input string.
Note : The order of subsequences are not important.
*/
public class ReturnSubSequenceOfString {
	public static String[] subsequence(String input) {
		// Write your code here

		if (input.length() == 0) {
			String arr[] = { "" };
			return arr;
		}

		String[] smallAns = subsequence(input.substring(1));

		String[] ans = new String[smallAns.length * 2];

		// first time loop copy as such
		for (int i = 0; i < smallAns.length; i++) {
			ans[i] = smallAns[i];
		}

		// second time loop copy with char at 0 attach
		for (int i = 0; i < smallAns.length; i++) {
			ans[i + smallAns.length] = input.charAt(0) + smallAns[i];
		}
		return ans;
	}
}
