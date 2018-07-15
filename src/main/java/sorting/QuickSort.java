package sorting;

class QuickSortIMPL {
	public static void quickSort(int[] input, int low, int high) {
		if (low < high) {
			int pivotvalue = input[low];

			int i = low + 1;
			int j = high;

			int temp;
			while (i < j ) {

				while (i <= j && input[i] <= pivotvalue) {
					i = i + 1;
				}
				while (input[j] >= pivotvalue && j >= i) {
					j = j - 1;
				}
				
				if (i < j  ) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
			temp = input[low];
			input[low] = input[j];
			input[j] = temp;

			quickSort(input, low, j - 1);
			quickSort(input, j + 1, high);
		}

	}

	static int partition(int[] input, int first, int last) {
		int pivotvalue = input[first];

		int leftmark = first + 1;
		int rightmark = last;

		boolean done = false;
		int temp;
		while (!done) {

			while (leftmark <= rightmark && input[leftmark] <= pivotvalue) {
				leftmark = leftmark + 1;
			}
			while (input[rightmark] >= pivotvalue && rightmark >= leftmark) {
				rightmark = rightmark - 1;
			}

			if (rightmark < leftmark) {
				done = true;
			} else {
				temp = input[leftmark];
				input[leftmark] = input[rightmark];
				input[rightmark] = temp;
			}
		}
		temp = input[first];
		input[first] = input[rightmark];
		input[rightmark] = temp;

		return rightmark;
	}
}
public class QuickSort {
	public static void main(String[] args) {
		 int[] input = { 5, 1, 2, 4, 3, 7, 6 };
		int len = input.length;
		QuickSortIMPL.quickSort(input, 0, len - 1);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}
