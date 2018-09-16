package Arrays_2;

/*Given a random integer array A and a number x. Find and print the pair of elements in the array which sum to x.
Array A can contain duplicate elements.
While printing a pair, print the smaller element first.
That is, if a valid pair is (6, 5) print "5 6". There is no constraint that out of 5 pairs which have to be printed in 1st line. You can print pairs in any order, just be careful about the order of elements in a pair.
Input format :
Line 1 : Integer N (Array size)
Line 2 : Array elements (separated by space)
Line 3 : Integer x
*/
public class PairSumInArray {
	public static void main(String[] args) {
		int[] arr= {5 ,1 ,2, 4};
		int n=3;
		pairSum(arr,n);
		
	}
	public static void pairSum(int[] arr, int num) {

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[i] > arr[i + 1]) {
					temp=arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

		}
		for (int k = 0; k < arr.length; k++)
			for (int l = k + 1; l < arr.length; l++)
				if ((arr[k] - arr[l]) == num) {
					if (arr[k] <= arr[l]) {
						System.out.println(arr[k] + " " + arr[l]);
					} else
						System.out.println(arr[l] + " " + arr[k]);
				}
	}
}
