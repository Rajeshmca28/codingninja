package MixProblem;

import java.util.ArrayList;
import java.util.LinkedList;

//An array of nonnegative single digit integers is given. Find the largest multiple of 3 that can be formed from the elements that are present in array.

//For example, if the input array is {8, 1, 9}, the output should be “9 8 1″, and if the input array is {8, 1, 7, 6, 0}, output should be “8 7 6 0″.
//Input format :
//Line 1 : Size of input array
//Line 2 : Array elements (separated by space)

public class LargestMultipleOfThree {
	public static ArrayList<Integer> largestMultiple3(ArrayList<Integer> input) {
		input.sort(null);
		LinkedList<Integer> q0 = new LinkedList<Integer>();
		LinkedList<Integer> q1 = new LinkedList<Integer>();
		LinkedList<Integer> q2 = new LinkedList<Integer>();
		int sum = 0;
		for (int i = 0; i < input.size(); i++) {
			if (input.get(i) % 3 == 0) {
				q0.add(input.get(i));
			}
			if (input.get(i) % 3 == 1) {
				q1.add(input.get(i));
			}
			if (input.get(i) % 3 == 2) {
				q2.add(input.get(i));
			}
			sum = sum + input.get(i);
		}
		if (sum % 3 == 1) {
			if (!q1.isEmpty()) {
				q1.remove();
			} else if (q2.size() > 1) {
				q2.remove();
				q2.remove();
			} else {
				return new ArrayList<>();
			}
		}
		if (sum % 3 == 2) {
			if (!q2.isEmpty()) {
				q2.remove();
			} else if (q1.size() > 1) {
				q1.remove();
				q1.remove();
			} else {
				return new ArrayList<>();
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		while (!q0.isEmpty()) {
			ans.add(q0.remove());
		}
		while (!q1.isEmpty()) {
			ans.add(q1.remove());
		}
		while (!q2.isEmpty()) {
			ans.add(q2.remove());
		}
		ans.sort(null);
		ArrayList<Integer> result = new ArrayList<>();
		while (!ans.isEmpty()) {
			result.add(ans.remove(ans.size() - 1));
		}
		return result;
	}
}
