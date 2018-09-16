package Arrays_2;

/*Given two random integer arrays, print their intersection. That is, print all the elements that are present in both the given arrays.
Input arrays can contain duplicate elements.
Note : Order of elements are not important
Input format :
Line 1 : Integer N, Array 1 Size
Line 2 : Array 1 elements (separated by space)
Line 3 : Integer M, Array 2 Size
Line 4 : Array 2 elements (separated by space)
*/
public class PrintArrayIntersection {
	public static void main(String[] args) {
		int[] arr1= {4,3,6,8,5};
		int[] arr2= {3,2,1,9,7,4};
		intersection(arr1,arr2);
	}
	public static void intersection(int[] arr1, int[] arr2){
	
   	int length1=arr1.length;
	int length2=arr2.length;
	int x;
	if(length1<length2) {
		for(int i=0;i<length1;i++) {
			for(int j=0;j<length2;j++)
{
				if(arr1[i]==arr2[j]) {
					System.out.print(arr2[j]+" ");
				break;
				}
	
				}
			}
	}
	else {
		for(int k=0;k<length2;k++)
		{
			for(int l=0;l<length1;l++)
			{
				if(arr2[k]==arr1[l]) {
					System.out.print(arr1[l]+" ");
					break;
				}
			}
		}
	} }
}
