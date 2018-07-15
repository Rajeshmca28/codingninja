package com.array;

public class RotateArrayDemo {	

	public static void rotate(int[] arr, int d) {
		  int j,n=arr.length;
 for (j = 0; j < d; j++){
  int i, temp;
  temp = arr[0];
 }
	}
	public static void main(String[] args) {
		int[] arr= {1 ,2 ,3, 4, 5 ,6};
		int d=2;
		rotate(arr,d);
		for(int  i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

    }
