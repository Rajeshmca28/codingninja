package HashMap1;

import java.util.HashMap;

/*Given two random integer arrays, print their intersection. That is, print all the elements that are present in both the given arrays.
Input arrays can contain duplicate elements.
Note : Order of elements are not important
Input format :
Line 1 : Integer N, Array 1 Size
Line 2 : Array 1 elements (separated by space)
Line 3 : Integer M, Array 2 Size
Line 4 : Array 2 elements (separated by space)
*/
public class PrintArrayInterSection {
	public static void intersection(int[] arr1, int[] arr2) {
		/*
		 * Your class should be named Intersection Don't write main(). Don't read input,
		 * it is passed as function argument. Print output and don't return it. Taking
		 * input is handled automatically.
		 */
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if (!map.containsKey(arr1[i])) {
				map.put(arr1[i], 1);
			} else {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				System.out.println(arr2[i] + " ");
				if (map.get(arr2[i]) > 1) {
					map.put(arr2[i], map.get(arr2[i]) - 1);
				} else {
					map.remove(arr2[i]);
				}
			}
		}
	}

}
