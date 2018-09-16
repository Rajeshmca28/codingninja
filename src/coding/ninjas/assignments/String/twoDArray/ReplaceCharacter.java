package String.twoDArray;
/*Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
Input Format :
Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)*/
public class ReplaceCharacter {
	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
	int l = input.length();
		char arr[] = input.toCharArray();

		for (int i = 0; i < l; i++) {
			if (arr[i] == c1) {
				arr[i] = c2;

			}

		
		}
		String ss = String.valueOf(arr);
		return ss;
	}
}
