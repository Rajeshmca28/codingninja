package Arrays_1;
/*Given an array of length N, swap every pair of alternate elements in the array.
You don't need to print or return anything, just change in the input array itself.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
*/
public class SwapAlternate {
	public static void main(String[] args) {
		int[] arr= {3,5,6,2,9,8};
		swapAlternate(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}
public static void swapAlternate(int[] input){
		
		
      int i,temp;
 for(i=0;i <input.length-1;i+=2)
    {
        temp    = input[i];
        input[i]  = input[i+1];
        input[i+1]= temp;
    }
   
	}

}
