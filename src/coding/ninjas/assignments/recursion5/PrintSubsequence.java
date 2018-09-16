package recursion5;

/*Given a string (lets say of length n), print all the subsequences of the given string.
Subsequences contain all the strings of length varying from 0 to n. But the order of characters should remain same as in the input string.
Note : The order of subsequences are not important. Print every subsequence in new line.
*/
public class PrintSubsequence {
	public static void printSubsequences(String input) {
		// Write your code here
		String res = "";
		subSequence(input, res);
	}

	static void subSequence(String input, String resultSoFar) {
		if (input.length() == 0) {
			System.out.println(resultSoFar);
			return;
		}
		subSequence(input.substring(1), resultSoFar);
		subSequence(input.substring(1), resultSoFar + input.charAt(0));
	}
}
