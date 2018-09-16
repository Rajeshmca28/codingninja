package recursive6;

/*Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.
Note : The order of codes are not important.
Input format :
A numeric string
*/
public class ReturnAllCodes {
	public static String[] getCode(String input) {
		int l = input.length();
		if (l <= 0) {
			String[] s = { "" };
			return s;
		}
		if (l == 1) {
			String s1 = "" + getAlpha(input.charAt(0));
			String[] sr = { s1 };
			return sr;
		}
		String[] r1 = getCode(input.substring(1));
		{
			String[] r2 = getCode(input.substring(2));
			int c = (input.charAt(0) - '0') * 10 + (input.charAt(1) - '0');
			if (c > 9 && c < 27) {
				String[] ans = new String[r1.length + r2.length];
				for (int i = 0; i < r1.length; i++) {
					ans[i] = getAlpha(input.charAt(0)) + r1[i];

				}
				for (int i = 0; i < r2.length; i++) {
					{
						ans[i + r1.length] = getAlpha(c + '0') + r2[i];
					}
				}

				return ans;
			} else {
				String[] ans = new String[r1.length];
				for (int i = 0; i < r1.length; i++) {
					ans[i] = getAlpha(input.charAt(0)) + r1[i];
				}
				return ans;
			}

		}

	}

	public static char getAlpha(int k) {
		return (char) ('a' + k - 1 - '0');
	}

}
