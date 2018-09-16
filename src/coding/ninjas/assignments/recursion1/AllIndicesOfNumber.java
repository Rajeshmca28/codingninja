package recursion1;

/*Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x*/
public class AllIndicesOfNumber {
	public static int[] allIndexes(int input[], int x) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */

		return allIndexDemo(input, x, 0);
	}

	static int[] allIndexDemo(int[] input, int x, int index) {
		if (index == input.length) {
			int[] arr = {};
			return arr;
		}
		int[] smallAns = allIndexDemo(input, x, index + 1);
		if (input[index] == x) {
			int[] ans = new int[smallAns.length + 1];
			for (int i = 1; i < ans.length; i++) {
				ans[i] = smallAns[i - 1];
			}
			ans[0] = index;
			return ans;
		}
		return smallAns;
	}
}
