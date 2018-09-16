package Arrays_3;
/*Given a random integer array. Sort this array using insertion sort.
Change in the input array itself. You don't need to return or print elements.
Input format :
Line 1 : Integer N, Array Size
Line 2 : Array elements (separated by space)
*/
public class InsertionSorrt {
	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 73, 9, 1, 3 };
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
		public static void insertionSort(int[] arr){
			//write your code here
	      for(int i=1;i<arr.length;i++){
	        int el=arr[i];
	        int j=i-1;
	        while((j>=0)&&(arr[j]>el)){
	          arr[j+1]=arr[j];
	          j--;
	        }
	        arr[j+1]=el;
	      
	       
	      }
		}
}
