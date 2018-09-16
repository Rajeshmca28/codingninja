package recursion1;
//Given the code to print number from 1 to n in increasing order recursively. But it contains few bugs, that you need to rectify such that all the test cases should pass.

public class PrintNumber {
	public static void print(int n) {

		if (n > 1) {
			print(n - 1);
		}
		System.out.print(n + " ");
	}
}
