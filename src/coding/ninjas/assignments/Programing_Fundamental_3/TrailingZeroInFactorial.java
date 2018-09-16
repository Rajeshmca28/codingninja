package Programing_Fundamental_3;

import java.util.Scanner;

//Given an integer n, find the number of trailing 0s in its factorial. Do this without actually finding the n!, as the integer given can be large and its factorial can exceed the integer limits.
//Count of trailing 0s

public class TrailingZeroInFactorial {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int count=0;
for(int i=5;n/i>=1;i=i*5)
{
  count+=n/i;

}
        System.out.print(count);

      count++;

	}

}
