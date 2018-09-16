package Arrays_3;
/*Given a sorted integer array (in ascending order) and an element x. You need to search this element x in the given input array using binary search. Return the index of element in the input.
Indexing starts from 0.
Return -1 if x is not present in the input array.
Input format :
Line 1 : Integer N, Array Size
Line 2 : Array elements (separated by space)
Line 3 : Element to be searched (i.e. x)
*/
public class BinarySearch {
public static void main(String[] args) {
	int[] array= {1 ,3, 7, 9 ,3,11 ,12 ,45};
int n=3;
System.out.println(binarySearch(array,n));
}
	public static int binarySearch(int[] arr, int num){
     int l = 0;
        int h = arr.length - 1;

        while(l <= h){
            int mid = (l + h)/2;
            if(arr[mid] == num){
                return mid;
            }
            else if(num > arr[mid]){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
         }
        return -1;
    }
}
