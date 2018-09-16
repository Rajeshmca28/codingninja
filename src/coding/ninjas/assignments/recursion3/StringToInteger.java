package recursion3;

/*Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
Input format :
Numeric string (string, Eg. "1234")
Output format :
Corresponding integer (int, Eg. 1234)
*/
public class StringToInteger {
	public static int convertStringToInt(String input) {
		// Write your code here
		if (input.length() == 0) {
			return 0;
		}
		char ch = input.charAt(0);
		String str = input.substring(1);

		int f = 1;
		for (int i = 0; i < input.length() - 1; i++)
			f *= 10;

		f = f * (ch - '0');
		int res = f + convertStringToInt(str);
		return res;
	}
}
