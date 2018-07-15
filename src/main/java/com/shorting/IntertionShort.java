package com.shorting;

public class IntertionShort {

	public static void main(String[] args) {
		int[] arr= {6,4,3,9,8,7,1,2,3};
		insertionShorting(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void insertionShorting(int[] arr) {
		int x=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j>=1;j--) {
				if(arr[j]<arr[j-1]) {
					x=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=x;
				}else 
				break;
			}
			
		}
	}
}
