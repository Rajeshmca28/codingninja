package recursive6;

/*Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to print the list of all possible codes that can be generated from the given string.
Note : The order of codes are not important. Just print them in different lines.
Input format : A numeric string
Sample Input:1123
Sample Output:
aabc
kbc
alc
aaw
kw
*/
public class PrintAllCodes {
	public static void printAllPossibleCodes(String input) {
		// Write your code here
		getCode(input, "");
	}

	static char mapping(int n) {
		char c = (char) ('a' + n - 1);
		return c;
	}

	public static void getCode(String input, String result) {
		if (input.length() == 0) {
			System.out.println(result);
			return;
		}
		getCode(input.substring(1), result + mapping(Character.getNumericValue(input.charAt(0))));
		if (input.length() > 1) {
			int m = Integer.parseInt(input.substring(0, 2));
			if (m <= 26) {
				getCode(input.substring(2), result + mapping(m));
			}

		}
	}

}
