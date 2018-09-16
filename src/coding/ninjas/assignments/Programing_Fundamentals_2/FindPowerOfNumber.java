package Programing_Fundamentals_2;
//Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.

import java.util.Scanner;

public class FindPowerOfNumber {
	public static void main(String[] args) {
		// Write your code here
	Scanner s=new Scanner(System.in);
int b=s.nextInt();
int e=s.nextInt();
    powerN(b,e);
    }
      public static void powerN(int b,int e){
    long  res = 1;
        while (e != 0)
    {
        res *= b;
        --e;
    }

   System.out.println(res);
}

}
