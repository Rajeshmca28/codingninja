package Arrays_4;
/*Given a random integer array of size n, write a function that rotates the given array by d elements (towards left)
Change in the input array itself. You don't need to return or print elements.
Input format :
Line 1 : Integer n (Array Size)
Line 2 : Array elements (separated by space)
Line 3 : Integer d
*/
public class RotateArray {
	public static void main(String[] args) {
		
		int[] arr= {3,4,7,5,7,6,8};
		int d=5;
		rotate(arr,d);
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}
	public static void rotate(int[] arr, int d) {
		

 			int j,n=arr.length;

      for (j = 0; j < d; j++){
  
        	int i, temp;
 		    temp = arr[0];
  	   for (i = 0; i < n-1; i++)
    		 arr[i] = arr[i+1];
  			 arr[i] = temp;
 }
 
    }

}
