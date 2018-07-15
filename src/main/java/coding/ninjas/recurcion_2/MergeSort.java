package coding.ninjas.recurcion_2;

public class MergeSort {
public static void main(String[] args) {
	int[] arr= {2,3,4,1,8,0};
	mergeSort(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
}
	public static void mergeSort(int[] input){
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
