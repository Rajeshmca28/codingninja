package Programing_Fundamental_4;

import java.util.Scanner;

/*Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.
*/
public class SquareRootIntegral {
	public static void main(String[] args) {
		// Write your code here
Scanner s=new Scanner(System.in);
     int n=s.nextInt();
    
  n = (int)Math.sqrt(n);
      System.out.println(n);
      
  }
}
