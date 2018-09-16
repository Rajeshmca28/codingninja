package Arrays_4;
/*Given an integer array, which is sorted (in increasing order) and has been rotated by some number k in clockwise direction. Find and return the k.
Input format :
Line 1 : Integer n (Array Size)
Line 2 : Array elements (separated by space)
*/
public class CheckArrayRotation {
public static void main(String[] args) {
		
		int[] arr= {3,4,7,5,7,6,8};
		arrayRotateCheck(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}
	public static int arrayRotateCheck(int[] arr){
		
	  int min = arr[0], min_index = -1;
        for (int i = 0; i < arr.length; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
                min_index = i;
            }
        } 
        return min_index;
    }
}
