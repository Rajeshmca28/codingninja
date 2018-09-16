package recursive6;

/*Given an integer array (of length n), find and print all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print the subsets in different lines.
Input format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)
*/
public class PrintSubSetOfArray {
	public static void printSubsets(int input[]) {
		// Write your code here
		int[] res = {};

		printSub(input, res, 0);
	}

	public static void printSub(int[] input, int[] res, int index) {
		if (index == input.length) {
			for (int i = 0; i < res.length; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
			return;
		}
		printSub(input, res, index + 1);
		int[] result = new int[res.length + 1];
		for (int i = 0; i < res.length; i++) {
			result[i] = res[i];
		}
		result[res.length] = input[index];
		printSub(input, result, index + 1);

	}

}
