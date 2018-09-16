package HashMap1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/*You are given with an array of integers that contain numbers in random order. Write a program to find and return the number which occurs maximum times in the given input.
If more than one element occurs same number of times in the input, return the element which is present in the input first.
Best solution takes O(n) time.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
*/
public class HighestFrequencyNumber {
	public static int maxFrequencyNumber(int[] arr) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		int maxFreq = Integer.MIN_VALUE;
		int res = 0;
		for (Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > maxFreq) {
				maxFreq = e.getValue();
				res = e.getKey();
			}

		}
		return res;

	}

}
