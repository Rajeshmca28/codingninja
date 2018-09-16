package MixProblem;

/*Given two strings string1 and string2 (named large and small), find the smallest substring in string1 containing all characters of string2 in O(n). You need to return the output substring.
Note : The characters of string2 need not to be present in same order in string1. That is, we need a substring which contains all characters of string2 irrespective of the order.
Return null if no substring with all characters is present.
Input format :
Line 1 : String 1
Line 2 : String 2
Output Format :
Smallest substring
*/
public class FindSmallestSubString {
	static final int n = 256;

	public static String findMinSubstringContainingString(String large, String small) {
		/*
		 * Your class should be named solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */

		int len1 = large.length();
		int len2 = small.length();

		if (len1 < len2) {
			return "";
		}

		int s[] = new int[n];
		int l[] = new int[n];

		for (int i = 0; i < len2; i++)
			s[small.charAt(i)]++;

		int strt = 0, sIndex = -1, min_len = Integer.MAX_VALUE;

		int count = 0;
		for (int j = 0; j < len1; j++) {
			l[large.charAt(j)]++;

			if (s[large.charAt(j)] != 0 && l[large.charAt(j)] <= s[large.charAt(j)])
				count++;

			if (count == len2) {
				while (l[large.charAt(strt)] > s[large.charAt(strt)] || s[large.charAt(strt)] == 0) {

					if (l[large.charAt(strt)] > s[large.charAt(strt)])
						l[large.charAt(strt)]--;
					strt++;
				}

				int len3 = j - strt + 1;
				if (min_len > len3) {
					min_len = len3;
					sIndex = strt;
				}
			}
		}
		if (sIndex == -1) {
			return "";
		}

		return large.substring(sIndex, sIndex + min_len);
	}

}
