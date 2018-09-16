package Arrays_4;
/*Given a random integer array of size n, find and return the second largest element present in the array.
If n <= 1 or all elements are same in the array, return -2147483648 i.e. -2^31.
Input format :
Line 1 : Integer n (Array Size)
Line 2 : Array elements (separated by space)
*/
public class SecondLargestInArray {
	public static void main(String[] args) {
		int[] arr= {1,3,2,7,5,4};
		System.out.println(secondLargestElement(arr));
	}
	public static int secondLargestElement(int[] arr) {
		   int i, first, second;
	      
	        first = second = Integer.MIN_VALUE;
	        for (i = 0; i < arr.length ; i++)
	        {
	            if (arr[i] > first)
	            {
	                second = first;
	                first = arr[i];
	            }
	      
	            else if (arr[i] > second && arr[i] != first)
	                second = arr[i];
	        }
	         
	        if (second == Integer.MIN_VALUE)
return first;
	        	else
	         return second;
	    }
}
