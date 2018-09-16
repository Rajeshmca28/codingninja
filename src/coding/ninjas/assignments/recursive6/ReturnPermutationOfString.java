package recursive6;

/*Given a string, find and return all the possible permutations of the input string.
Note : The order of permutations are not important.
Sample Input :abc
Sample Output :
abc
acb
bac
bca
cab
cba
*/
public class ReturnPermutationOfString {
	public static String[] permutationOfString(String input) {
		// Write your code here

		if (input.length() == 0) {
			String[] arr = { "" };
			return arr;
		}
		String[] smallAns = permutationOfString(input.substring(1));
		String[] ans = new String[smallAns.length * (smallAns[0].length() + 1)];

		int k = 0;
		for (int i = 0; i < smallAns.length; i++) {
			String word = smallAns[i];
			for (int j = 0; j <= word.length(); j++) {
				ans[k++] = word.substring(0, j) + input.charAt(0) + word.substring(j);
			}
		}

		return ans;
	}
}
