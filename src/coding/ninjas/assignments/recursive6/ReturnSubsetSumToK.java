package recursive6;

/*Given an array A of size n and an integer K, return all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :
Line 1 : Integer n, Size of input array
Line 2 : Array elements separated by space
Line 3 : K 
*/
public class ReturnSubsetSumToK {
	public static int[][] subsetsSumK(int input[], int k) {
		return subsetSumK(input, k, 0);
	}

	// Write your code here
	public static int[][] subsetSumK(int input[], int k, int index) {
		if (input.length == index) {
			if (k == 0) {
				int[][] arr = new int[1][0];
				return arr;
			} else {
				int[][] arr = new int[0][0];
				return arr;
			}
		}
		// create first 2d Array s1 include index
		int[][] s1 = subsetSumK(input, k - input[index], index + 1);

		// create first 2d Array s1 include index
		int[][] s2 = subsetSumK(input, k, index + 1);

		// creating a third array for the store the element for the both the array
		int[][] result = new int[s1.length + s2.length][];

		// fill the element of first
		for (int i = 0; i < s1.length; i++) {

			result[i] = new int[s1[i].length + 1];
			result[i][0] = input[index];
			for (int j = 0; j < s1[i].length; j++) {
				result[i][j + 1] = s1[i][j];
			}
		}

		for (int i = 0; i < s2.length; i++) {
			result[i + s1.length] = new int[s2[0].length];
			result[i + s1.length] = s2[i];
		}
		return result;

	}

}
