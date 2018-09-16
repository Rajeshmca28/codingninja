package recursion5;

/*Suppose you have a string made up of only 'a' and 'b'. Write a recursive function that checks if the string was generated using the following rules:
a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false.
*/
public class CheckAB {
	public static boolean checkAB(String input) {
		// Write your code here
		return check(input, 0);
	}

	static boolean check(String input, int index) {
		if (input.length() == 0)
			return true;
		if (index == input.length()) {
			return true;
		}
		if (input.charAt(0) == 'a') {
			if (input.charAt(index) == 'a') {
				return check(input, index + 1);
			} else if (input.charAt(index) == 'b') {
				if (input.charAt(index + 1) != 'b') {
					return false;
				} else {
					index = index + 1;
					return check(input, index + 1);
				}
			} else
				return false;

		}
		return false;

	}
}
