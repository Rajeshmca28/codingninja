package coding.ninjas.recurcion_1;

import java.util.Scanner;

public class NumberOfDigit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(count(n));
	}
	public static int count(int n){
	     if ((n/10) == 0)
		{ 
	       return 1;
	    }
	else
	{
	  return 1 + count(n/10);
	}
	    }
}
