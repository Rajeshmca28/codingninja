package HashMap2;

/*You are given with an array of integers and an integer K. Write a program to find and print all pairs which have difference K.
Best solution takes O(n) time. And take difference as absolute.
Input Format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)
Line 3 : K
*/
public class PairWithDifferenceK {
	public static void findPairsDifferenceK(int[] input, int k) {

		for (int i = 0; i < input.length - 1; i++)
			for (int j = 1; j < input.length - 1; j++)
				if (((input[i] - input[j]) == k)) {
					if (input[i] < input[j]) {
						System.out.println(input[i] + " " + input[j]);
					} else {
						System.out.println(input[j] + " " + input[i]);
					}
				}

	}

}
