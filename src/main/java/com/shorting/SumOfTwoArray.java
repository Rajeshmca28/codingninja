package com.shorting;

public class SumOfTwoArray {

	public static int[] sumTwoArray(int[] arr1,int[] arr2) {
		int length=arr1.length>arr2.length?arr1.length:arr2.length;
		int[] result=new int [length+1];
		int i=arr1.length-1,j=arr2.length-1,k=result.length-1;
		int carry=0;
		while(i>=0&&j>=0) {
			
			int sum=arr1[i--]+arr2[j--]+carry;
			result[k--]=sum%10;
			carry=sum/10;
		}
		while(i>=0) {
			int sum=arr1[i--]+carry;
			result[k--]=sum%10;
			carry=sum/10;
		}
		while(j>=0) {
			int sum=arr2[j--]+carry;
			result[k--]=sum%10;
			carry=sum/10;
		}
		result[0]=carry;
		return result;
			
	}
	public static void main(String[] args) {
		int[] arr1= {2,4,6,7,8};
		int[] arr2= {3,4,9,5};
		sumTwoArray(arr1,arr2);
		
	}
}
