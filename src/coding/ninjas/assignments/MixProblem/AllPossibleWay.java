package MixProblem;

/*Given two integers a and b. You need to find and return the count of possible ways in which we can represent the number a as the sum of unique integers raise to the power b.
For eg. if a = 10 and b = 2, only way to represent 10 as -
10 = 1^2 + 3^2 
Hence, answer is 1.
Note : x^y represents x raise to the power y
Inout Format :Two integers a and b (separated by space)
Output Format :Count
*/
public class AllPossibleWay {
	public static int allWays(int x, int n) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		return findAllWay(x, n, 1);

	}

	static int findAllWay(int x, int n, int num) {
		int res = (int) (x - Math.pow(num, n));
		if (res == 0)
			return 1;
		if (res < 0)
			return 0;

		return findAllWay(res, n, num + 1) + findAllWay(x, n, num + 1);
	}

}
