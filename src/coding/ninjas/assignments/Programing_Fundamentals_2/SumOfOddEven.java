package Programing_Fundamentals_2;
//Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.

import java.util.Scanner;

public class SumOfOddEven {

	public static void main(String[] args) {
		// Write your code here
Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int evenSum=0;
	int oddSum=0;
	int rem=0;
      
      sumOddEven(n,rem,evenSum,oddSum);
    }
      public static void sumOddEven(int n,int rem,int evenSum,int oddSum){
	while(n!=0) {
		rem=n%10;
		if(n%2==0)
		{
			evenSum=evenSum+rem;
		}else
			oddSum=oddSum+rem;
		n=n/10;
	}
	System.out.println(evenSum+" "+oddSum);
	

	}
}
