package coding.ninjas.practice;

import java.util.Arrays;

public class MergeDemo {
	public static void mergeSort(int[] input){
		if (input.length == 1) {
			return;
		}

		int[] arr1 = new int[input.length / 2];
		/*for (int i = 0; i < arr1.length; i++) {
			arr1[i] = input[i];
		}*/
		System.arraycopy(input, 0, arr1, 0, arr1.length);
		
	/*	for (int i = 0; i < arr1.length; i++) {
		System.out.print(arr1[i]);
	}*/
		//System.out.println(Arrays.asList(arr1.toString()).toString());
		

		int[] arr2 = new int[input.length - arr1.length];
		/*for (int i = 0; i < arr2.length; i++) {
			arr2[i] = input[i + arr1.length];
		}*/
		System.arraycopy(input, input.length - arr2.length, arr2, 0, arr2.length);
		mergeSort(arr1);
		mergeSort(arr2);

		merge(arr1, arr2, input);
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
public static void main(String[] args) {
	int[] arr= {2,5,1,7,9,3,4};
	mergeSort(arr);
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
