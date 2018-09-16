package Arrays_4;
/*Two random integer arrays are given A1 and A2, in which numbers from 0 to 9 are present at every index (i.e. single digit integer is present at every index of both given arrays).
You need to find sum of both the input arrays (like we add two integers) and put the result in another array i.e. output array (output arrays should also contain only single digits at every index).
The size A1 & A2 can be different.
Note : Output array size should be 1 more than the size of bigger array and place 0 at the 0th index if there is no carry. No need to print the elements of output array.
Input format :
Line 1 : Integer n1 (A1 Size)
Line 2 : A1 elements (separated by space)
Line 3 : Integer n2 (A2 Size)
Line 4 : A2 elements (separated by space)
*/
public class SumOfTwoArray {
	public static void main(String[] args) {
		int[] arr1= {2,4,6,4,9,8,7};
		int[] arr2= {2,4,7,3,9,8,7};
		int[] arr3=sumOfTwoArrays(arr1,arr2);
	for(int i=0;i<arr3.length;i++) {
		System.out.println(arr3[i]);
	}
	}
	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
		
      int length=arr1.length>arr2.length?arr1.length:arr2.length;
		int[] result=new int [length+1];
		int i=arr1.length-1,j=arr2.length-1,k=result.length-1;
		int carry=0;
		while(i>=0&&j>=0) {
			
			int sum=arr1[i--]+arr2[j--]+carry;
			result[k--]=sum%10;
			carry=sum/10;
		}
		while(i>=0) {
			int sum=arr1[i--]+carry;
			result[k--]=sum%10;
			carry=sum/10;
		}
		while(j>=0) {
			int sum=arr2[j--]+carry;
			result[k--]=sum%10;
			carry=sum/10;
		}
		result[0]=carry;
		return result;
			
	}
}
