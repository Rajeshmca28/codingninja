package HashMap2;

import java.util.ArrayList;
import java.util.HashMap;

/*Given an array consisting of positive and negative integers, find the length of the longest continuous subset whose sum is zero.
NOTE: You have to return the length of longest subset .
Input Format :
Line 1 : Contains an integer N i.e. size of array
Line 2 : Contains N elements of the array, separated by spaces
*/
public class LongestSubSetZeroSum {
	public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		// write your code here.
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int sum = 0;
		int mLen = 0;
		for (Integer keys : map.keySet()) {
			{
				sum += keys;

				if (keys == 0 && mLen == 0)
					mLen = 1;

				if (sum == 0)
					mLen = keys + 1;

				Integer prev = map.get(sum);

				if (prev != null)
					mLen = Math.max(mLen, keys - prev);
				else
					map.put(sum, keys);
			}

			return keys;
		}
		return mLen;
	}

}
