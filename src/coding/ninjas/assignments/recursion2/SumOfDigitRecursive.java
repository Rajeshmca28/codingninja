package recursion2;
//Write a recursive function that returns the sum of the digits of a given integer.

public class SumOfDigitRecursive {
	public static int sumOfDigits(int input) {
		// Write your code here
		if (input == 0)
			return 0;
		return (input % 10 + sumOfDigits(input / 10));
	}

}
