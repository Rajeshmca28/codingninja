package Arrays_3;
/*Given two sorted arrays of Size M and N respectively, merge them into a third array such that the third array is also sorted.
Input Format :
 Line 1 : Size of first array i.e. M
 Line 2 : M elements of first array separated by space
 Line 3 : Size of second array i.e. N
 Line 2 : N elements of second array separated by space
*/
public class MergeTwoSortedArray {
	public static void main(String[] args) {

		int[] arr1 = { 2, 4, 6, 73, 9, 1, 3 };
		int[] arr2 = { 2, 4, 6, 73, 9, 1, 3 };
			merge(arr1,arr2);

	}
public static int[] merge(int arr1[], int arr2[]){
		
		int i = 0, j = 0, k = 0;
      int[] arr3=new int[arr1.length+arr2.length];
while (i<arr1.length && j <arr2.length)
{
if (arr1[i] < arr2[j])
arr3[k++] = arr1[i++];
else
arr3[k++] = arr2[j++];
}

while (i < arr1.length)
arr3[k++] = arr1[i++];

while (j < arr2.length)
arr3[k++] = arr2[j++];
    
      return arr3;

}

}
