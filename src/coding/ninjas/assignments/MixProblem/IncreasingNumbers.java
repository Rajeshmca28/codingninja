package MixProblem;

/*Given an integer n, print all n digit increasing numbers in increasing order in one line.
Numbers you need to print should be in increasing order and only those numbers should be printed which have digits in increasing order.
Input Format :
Integer n
Output Format :
 Numbers in increasing order
*/
public class IncreasingNumbers {
	public static void printIncreasingNumber(int n) {
		/*
		 * Your class should be named Solution. Don't write main() function. Don't read
		 * input, it is passed as function argument. Print output as specified in the
		 * question
		 */
		printIcreasingOrder(0, 0, n);
	}

	static void printIcreasingOrder(int num, int m, int n) {
		if (n == 0) {
			System.out.print(num + " ");
			return;
		}

		for (int i = (m + 1); i < 10; i++)
			printIcreasingOrder(num * 10 + i, i, n - 1);
	}

}
