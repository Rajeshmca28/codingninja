package Arrays_2;
/*You are given an integer array A that contains only integers 0 and 1. Write a function to sort this array. Find a solution which scans the array only once. Don't use extra array.
You need to change in the given array itself. So no need to return or print anything.
Input format :
Line 1 : Integer N (Array Size)
Line 2 : Array elements (separated by space)
*/
public class Sort01 {
	public static void main(String[] args) {
		int[] arr= {0 ,1, 1, 0, 1, 0, 1};
		sortBinaryArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void sortBinaryArray(int[] arr){
		
   int n = 0; 
     
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                n++;
        }
 
        for (int j = 0; j < n; j++)
            arr[j] = 0;
 
        for (int k = n; k<arr.length; k++)
            arr[k] = 1;
    
 
	}
}
