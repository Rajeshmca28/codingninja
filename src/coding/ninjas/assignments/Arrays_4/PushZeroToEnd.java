package Arrays_4;

/*Given a random integer array, push all the zeros that are present to end of the array. The respective order of other elements should remain same.
Change in the input array itself. You don't need to return or print elements. Don't use extra array.
Note : You need to do this in one scan of array only.
Input format :
Line 1 : Integer N, Array Size
Line 2 : Array elements (separated by space)
*/
public class PushZeroToEnd {
public static void main(String[] args) {
	int[] arr= {4,6,1,2,7,6};
	pushZerosAtEnd(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
	public static void pushZerosAtEnd(int[] arr) {

		{
			int x = 0;

			for (int i = 0; i < arr.length; i++)

				if (arr[i] != 0)

					arr[x++] = arr[i];

			while (x < arr.length)

				arr[x++] = 0;
		}

	}
}
