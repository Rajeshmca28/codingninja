package Arrays_2;

/*Given an integer array of size 2N + 1. In this given array, N numbers are present twice and one number is present only once in the array.
You need to find and return that number which is unique in the array.
Note : Given array will always contain odd number of elements.
Input format :
Line 1 : Array size i.e. 2N+1
Line 2 : Array elements (separated by space)
*/
public class FindUniqueElement {
	public static void main(String[] args) {
		int[] arr= {4,8,7,6,7,1,2,3,2};
		System.out.println(findUnique(arr));
	}
	public static int findUnique(int[] arr) {

		int res = arr[0];
		for (int i = 1; i < arr.length; i++)
			res = res ^ arr[i];

		return res;

	}
}
