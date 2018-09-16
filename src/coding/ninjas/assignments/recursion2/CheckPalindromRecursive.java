package recursion2;
//Check if a given String S is palindrome or not (using recursion). Return true or false.

public class CheckPalindromRecursive {
	public static boolean isStringPalindrome(String input) {
		// Write your code here
		if (input.length() == 0 || input.length() == 1)
			return true;
		if (input.charAt(0) == input.charAt(input.length() - 1))
			return isStringPalindrome(input.substring(1, input.length() - 1));

		return false;

	}
}
