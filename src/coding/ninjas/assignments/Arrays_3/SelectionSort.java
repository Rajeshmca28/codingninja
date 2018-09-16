package Arrays_3;
/*Given a random integer array. Sort this array using selection sort.
Change in the input array itself. You don't need to return or print elements.
Input format :

Line 1 : Array Size

Line 2 : Array elements (separated by space)
*/

public class SelectionSort {
	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 73, 9, 1, 3 };
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
}
