package com.shorting;

public class InterSectionDemo {
public static void main(String[] args) {
	int[] arr1= {1,3,5,2,9,6,7};
	int[] arr2= {3,4,9,8,5};
	interSection(arr1,arr2);
}
public static void interSection(int[] arr1,int[] arr2) {
	int length1=arr1.length;
	int length2=arr2.length;
	int x;
	if(length1<length2) {
		for(int i=0;i<length1;i++) {
			for(int j=0;j<length2;j++)
{
				if(arr1[i]==arr2[j]) {
					System.out.println(arr2[j]);
				break;
				}
	
				}
			}
	}
	else {
		for(int k=0;k<length2;k++)
		{
			for(int l=0;l<length1;l++)
			{
				if(arr2[k]==arr1[l]) {
					System.out.println(arr1[l]);
					break;
				}
			}
		}
	}
}
}
