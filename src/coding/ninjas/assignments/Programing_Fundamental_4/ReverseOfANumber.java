package Programing_Fundamental_4;

import java.util.Scanner;

//Write a program to generate the reverse of a given number N. Print the corresponding reverse number.

public class ReverseOfANumber {
	public static void main(String[] args) {
		// Write your code here
int rev=1;
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      while(n!=0){
        rev=rev*10;
        rev=rev+n%10;
        n=n/10;
      }
      System.out.println(rev);
	}
}
