package recursive6;

/*Given an array A and an integer K, print all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print them in different lines.
Input format :
Line 1 : Size of input array
Line 2 : Array elements separated by space
Line 3 : K 
*/
public class PrintSubSetSumToK {
	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
		int[] result = {};
		subSetSumToK(input, k, 0, result);
	}

	public static void subSetSumToK(int[] input, int k, int index, int[] result) {
		if (index == input.length) {
			int sum = 0;
			for (int i = 0; i < result.length; i++) {
				sum = sum + result[i];
			}
			if (sum == k) {
				for (int i = 0; i < result.length; i++) {
					System.out.print(result[i] + " ");
				}
				System.out.println();
			}
			return;
		}
		subSetSumToK(input, k, index + 1, result);
		int[] newResult = new int[result.length + 1];
		int i = 0;
		for (; i < result.length; i++) {
			newResult[i] = result[i];
		}
		newResult[i] = input[index];
		subSetSumToK(input, k, index + 1, newResult);
	}

}
