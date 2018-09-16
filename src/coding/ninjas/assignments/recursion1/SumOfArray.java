package recursion1;
/*Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
*/
public class SumOfArray {
	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
    if(input.length==1){
      return input[0];
    }      
      int[] smallAns= new int[input.length-1];
      for(int i=0;i<smallAns.length;i++)
        smallAns[i]=input[i+1];
      
      return input[0]+sum(smallAns);
    }
}
