package Programing_Fundamental_4;

import java.util.Scanner;

//Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

public class TermsOfAP {
	public static void main(String[] args) {
		// Write your code here

     // int no=0;
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int count=0,i=1;
      while(count<n){
 int no=3*i+2;
      if(no%4!=0){
      
        System.out.print(no+" ");
        count++;
        
      }
        
      
      i++;
      }
      
      
    }
}
