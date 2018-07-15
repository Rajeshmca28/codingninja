package coding.ninjas.recurcion_2a;

public class BinarySearch {
	public static void main(String[] args) {
      int start=0;
      int[] arr= {2,3,9,6,4,7};
      int end=arr.length-1;
	 System.out.println(binarySearch(arr, 9, start, end));
	 
	}

	static int binarySearch(int[] input, int element, int start, int end) {

		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;

		if (input[mid] > element) {
			return binarySearch(input, element, start, mid - 1);
		} else if (input[mid] < element) {
			return binarySearch(input, element, mid + 1, end);
		} else {
			return mid;

	}
}
}
