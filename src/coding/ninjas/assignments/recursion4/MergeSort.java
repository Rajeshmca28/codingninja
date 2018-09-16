package recursion4;

/*Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
*/
public class MergeSort {
	public static void mergeSort(int[] input) {
		// Write your code here
		if (input.length == 1) {
			return;
		}

		int[] leftArray = new int[input.length / 2];
		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = input[i];
		}

		int[] rightArray = new int[input.length - leftArray.length];
		for (int i = 0; i < rightArray.length; i++) {
			rightArray[i] = input[i + leftArray.length];
		}
		mergeSort(leftArray);
		mergeSort(rightArray);

		merge(leftArray, rightArray, input);
	}

	static void merge(int[] arr1, int[] arr2, int[] result) {

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				result[k++] = arr1[i++];
			} else {
				result[k++] = arr2[j++];
			}
		}

		while (i < arr1.length) {
			result[k++] = arr1[i++];
		}

		while (j < arr2.length) {
			result[k++] = arr2[j++];
		}
	}

}
