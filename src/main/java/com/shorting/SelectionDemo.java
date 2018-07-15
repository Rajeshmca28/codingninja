package com.shorting;
public class SelectionDemo {
	public static void main(String[] args) {
		int[] arr = { 2, 0, 8, 6, 4 };
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = getMinIndex(arr, i);
			int temp=arr[i];
			 arr[i]=arr[minIndex];
			 arr[minIndex]=temp;
		
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
		}
	}

	private static int getMinIndex(int[] arr, int index) {
		int min = Integer.MAX_VALUE;
		int reqIndex = 0;
		for (int i = index; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				reqIndex = i;
			}
		}
		return reqIndex;
	}
}
