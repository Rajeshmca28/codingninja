package recursion3;
//Given a string, compute recursively a new string where all 'x' chars have been removed.

public class RemoveX {
	public static String removeX(String input) {
		// Write your code here
		String result = "";

		if (input == null || input.trim().length() == 0)

			return result;
		String str = input.substring(0, 1);
		input = input.substring(1);
		if (!(str.equals("x"))) {
			result = str;
		}
		return result + removeX(input);

	}
}
