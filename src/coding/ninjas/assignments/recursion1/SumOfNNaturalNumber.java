package recursion1;
//Given an integer n, find and return the sum of numbers from 1 to n using recursion.

public class SumOfNNaturalNumber {
	public static int sum(int n) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		if (n != 0)
			return n + sum(n - 1);
		else
			return n;
	}
}
