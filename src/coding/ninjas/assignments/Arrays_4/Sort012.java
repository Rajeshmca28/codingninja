package Arrays_4;
/*You are given an integer array containing only 0s, 1s and 2s. Write a solution to sort this array using one scan only.
You need to change in the given array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n (Array Size)
Line 2 : Array elements (separated by space)
*/
public class Sort012 {
	public static void main(String[] args) {
		int[] arr= {0 ,1 ,2, 0, 2 ,0, 1};
		sort012(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}
	public static void sort012(int[] arr){
		
      int i = 0;
        int l = arr.length- 1;
        int mid = 0,temp=0;
        while (mid <= l)
        {
            switch (arr[mid])
            {
            case 0:
            {
                temp   =  arr[i];
                arr[i]  = arr[mid];
                arr[mid] = temp;
                i++;
                mid++;
                break;
            }
            case 1:
                mid++;
                break;
            case 2:
            {
                temp = arr[mid];
                arr[mid] = arr[l];
                arr[l] = temp;
                l--;
                break;
            }
            }
			
	}
}
}
