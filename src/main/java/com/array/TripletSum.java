package com.array;

class TripletSum {
	static void printTriplet(int[] arr, int num) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
int a=0;
int b=0;
int c=0;
			
for (a = 0; a < arr.length - 2; a++) 
	for (b = a + 1; b < arr.length - 1; b++) 
	for (c = b + 1; c < arr.length; c++) 
										
		
	if (arr[a] + arr[b] + arr[c] == num) {
		if (arr[a] < arr[b] && arr[b] < arr[c]) {
			System.out.println(arr[a] + " " + arr[b] + " " + arr[c]);
		} else if (arr[b] < arr[a] && arr[b] < arr[c]) {
			System.out.println(arr[b] + " " + arr[a] + " " + arr[c]);
		} else {
			System.out.println(arr[a] + " " + arr[b] + " " + arr[c]);
		}
	}
		
	}

	

	public static void main(String[] args) {
		int arr[] ={9,5,7,27,22,21,2,7,10,12,3,26,10,19,18,24,9,30,12,18,12,13,11,18,3,3,12,22,29,19,11,21,29,3,1,9,5,26,29,23,30,27,8,11,12,20,5,28,5,3,11,22,18,24,12,29,25,17,29,18,20,18,25,27,10,5,30,29,5,14}
;
		int num = 66;
		printTriplet(arr, num);

	}
}
