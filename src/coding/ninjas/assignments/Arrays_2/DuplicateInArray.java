package Arrays_2;

/*Given an array of integers of size n which contains numbers from 0 to n - 2. Each number is present at least once. That is, if n = 5, numbers from 0 to 3 is present in the given array at least once and one number is present twice. You need to find and return that duplicate number present in the array.
Assume, duplicate number is always present in the array.
Input format :
Line 1 : Size of input array
Line 2 : Array elements (separated by space)
*/
public class DuplicateInArray {
	public static void main(String[] args) {
		int[] arr = { 4, 8, 7, 6, 4, 2 };
		duplicate(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int duplicate(int[] arr) {
		int search;
		int sum = 0;
		int numSum = 0;
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		for (int j = 0; j < arr.length - 1; j++) {
			numSum = numSum + j;

		}

		search = sum - numSum;
		return search;
	}
}
