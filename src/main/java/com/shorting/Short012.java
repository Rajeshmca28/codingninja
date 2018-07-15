package com.shorting;

public class Short012 {
	
		public static void sortDemo(int[] arr){
						
			//for(int j=0;j<arr.length-1;j++){
				// for(int i=0;i<arr.length-1-j;i++)
			int i=0,j=0;
			while(j<arr.length-1&&i<arr.length-1-j)
			{
				 if(arr[i]>arr[i+1])
				 {
				 int x=arr[i];
				 arr[i]=arr[i+1];
				 arr[i+1]=x;
				 }
			j++;
			}
			i++;
			 }
		
			public static void main(String[] args) {
			int[] arr= {0,2,1,0,0,1,2,2,1,2,2,0};
			sortDemo(arr);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
			
		}
	}

