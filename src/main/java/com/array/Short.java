package com.array;

public class Short {
	public static void sort01Method(int[] arr) {
		int i=0;
		int nextZero=0;
		while(i<arr.length) {
			if(arr[i]==0) {
				swap(arr,nextZero);
				nextZero++;
				
			}
			i++;
		}
	}
private static void swap(int[] arr,int nextZero) {
	for(int i=0;i<arr.length;i++) {
		int temp=arr[i];
	arr[i]=arr[nextZero];
	arr[nextZero]=temp;
}
}
public static void main(String[] args) {
	int[] arr= {0,1,0,0,1,1,1,0,0};
	sort01Method(arr);
	for(int k=0;k<arr.length;k++) {
		System.out.print(arr[k]);
	}
}
}
