package Arrays_1;
/*Given an array of length N, you need to find and return the sum of all elements of the array.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
*/
public class ArraySum {
	public static void main(String[] args) {
		int[] arr= {4,6,8,2,9,7,3,1};
	System.out.println(sum(arr));
		
	}
	public static int sum(int[] input){
		
	int sum=0;
    int i;
    for(i= input.length - 1; 0 <= i; sum+= input[i--]);
    return sum;
    }
}
