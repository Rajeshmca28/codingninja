package recursion5;

/*A child is running up a staircase with n steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return all possible number of ways.
Input format :
Integer n (No. of steps)
*/
public class StairCase {
	public static int findWays(int n) {

		/*
		 * Your class should be named Solution. Don't write main(). Don't take input, it
		 * is passed as function argument. Don't print output. Taking input and printing
		 * output is handled automatically.
		 */
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		if (n == 3) {
			return 4;
		}
		return findWays(n - 1) + findWays(n - 2) + findWays(n - 3);
	}
}
