package recursion3;
//Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".

public class ReplacePiRecursive {
	public static String replace(String input) {
		// Write your code here
		if (input.equals("") || input.length() < 2)
			return input;

		if (input.charAt(0) == 'p' && input.charAt(1) == 'i')

			return "3.14" + replace(input.substring(2));

		String str = input.charAt(0) + replace(input.substring(1));
		return str;
	}
}
