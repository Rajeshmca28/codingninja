package QuickSort;

/*
Sort an array A using Quick Sort.
Change in the input array itself. So no need to return or print anything*/
public class QuickSort {
	public static void quickSort(int[] input) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. No need to print or return the output. Taking
		 * input and printing output is handled automatically.
		 */
		int len = input.length;
		quickSortDemo(input, 0, len - 1);

	}

	static void quickSortDemo(int[] arr, int start, int end) {
		if (end <= start) {
			return;
		}
		int pivot = arr[start];
		int i = start;
		int j = end;
		while (start < end) {
			while (arr[start] <= pivot && start < end) {
				start++;
			}
			while (arr[end] > pivot && start <= end) {
				end--;

			}
			if (start < end) {
				swap(arr, start, end);
			}
		}
		swap(arr, i, end);
		quickSortDemo(arr, i, end - 1);
		quickSortDemo(arr, end + 1, j);
	}

	public static void swap(int[] input, int start, int end) {
		int temp = input[start];
		input[start] = input[end];
		input[end] = temp;
	}
}
