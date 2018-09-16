package recursion2;
//Given an integer n, count and return the number of zeros that are present in the given integer using recursion.

public class CountZeros {
	public static int countZerosRec(int input) {
		if (input == 0)
			return 0;

		if (input % 10 == 0)
			return 1 + countZerosRec(input / 10);
		else
			return countZerosRec(input / 10);
	}
}
