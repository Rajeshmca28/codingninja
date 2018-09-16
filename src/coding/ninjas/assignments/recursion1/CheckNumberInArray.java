package recursion1;

/*Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
*/
public class CheckNumberInArray {
	public static boolean checkNumber(int input[], int x) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		// int index=0;

		if (input.length == 0) {
			return false;
		}
		if (input[0] == x) {
			return true;
		}
		int[] smallArr = new int[input.length - 1];
		for (int i = 0; i < smallArr.length; i++) {
			smallArr[i] = input[i + 1];
		}

		boolean smallAns = checkNumber(smallArr, x);
		return smallAns;
	}
}
