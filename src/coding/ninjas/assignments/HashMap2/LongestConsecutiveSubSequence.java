package HashMap2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*You are given with an array of integers that contain numbers in random order. Write a program to find the longest possible sub sequence of consecutive numbers using the numbers from given array.
You need to return the output array which contains consecutive elements. Order of elements in the output is not important.
Best solution takes O(n) time.
If two arrays are of equal length return the array whose index of smallest element comes first.
Input Format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)
*/
public class LongestConsecutiveSubSequence {
	public static ArrayList<Integer> longestSubsequence(int[] arr) {
		// Write your code here
		ArrayList<Integer> list = new ArrayList<Integer>();
		int lcount = 0;

		Set<Integer> set = getSetFromArray(arr);

		for (Integer n : set) {
			if (set.contains(n - 1)) {
				continue;
			} else {
				int count = 0;
				ArrayList<Integer> temp = new ArrayList<Integer>();
				while (set.contains(n)) {
					temp.add(n);
					n++;
					count++;
				}
				if (count > lcount) {
					lcount = count;
					list = temp;
				}
			}

		}
		return list;
	}

	private static Set<Integer> getSetFromArray(int[] array) {
		Set<Integer> set = new HashSet<Integer>();
		if (null != array && array.length > 0) {
			for (int number : array) {
				set.add(number);
			}
		}
		return set;
	}

}
