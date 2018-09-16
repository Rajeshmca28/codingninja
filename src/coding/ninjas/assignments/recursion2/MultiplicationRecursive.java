package recursion2;

/*Given two integers m & n, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.
Input format : m and n (separated by space)

*/
public class MultiplicationRecursive {
	public static int multiplyTwoIntegers(int m, int n) {
		// Write your code here
		if (m < n) {
			return multiplyTwoIntegers(n, m);

		} else if (n != 0) {
			return (m + multiplyTwoIntegers(m, n - 1));

		} else {
			return 0;
		}

	}
}
