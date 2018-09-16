package HashMap1;

import java.util.HashMap;

/*Given a random integer array A of size N. Find and print the pair of elements in the array which sum to 0.
Array A can contain duplicate elements.
While printing a pair, print the smaller element first.
That is, if a valid pair is (6, -6) print "-6 6". There is no constraint that out of 5 pairs which have to be printed in 1st line. You can print pairs in any order, just be careful about the order of elements in a pair.
Input format :
Line 1 : Integer N (Array size)
Line 2 : Array elements (separated by space)
*/
public class PairSumTo0 {
	public static void PairSum(int[] input, int size) {

		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Print the desired output and don't return
		 * anything. Taking input is handled automatically.
		 */
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				if (map.containsKey(input[i])) {
					map.put(input[i], map.get(input[i]) + 1);
				} else {
					map.put(input[i], 1);
				}

			}
		}
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				if (map.containsKey(-input[i])) {
					for (int j = map.get(-input[i]); j > 0; j--) {
						System.out.println(input[i] + " " + (-input[i]));
					}
				}
			}
		}
	}

}
