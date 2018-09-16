package Arrays_1;
/*Given an array A with N elements, you need to find difference of sum of elements at even indices (E) and sum of elements at odd indices(O).
Note : Array indexes start from 0.
Input Format :
  Line 1 : Size of the array i.e N
  Line 2 : N integers i.e. elements of the array separated by space
*/
public class FindDifference {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
	System.out.println(findDifference(arr));

	}
	public static int findDifference(int[] input){

		
        int x,sumE = 0, sumO = 0;
        
        for(int i=0; i <input.length; i++)
        {
            if(input[i] % 2 == 0)
            {
                sumE = sumE + input[i];
            }
            else
            {
                sumO = sumO + input[i];
            }
        }
  
        x=sumE-sumO;
  return x;
	}
	

}
