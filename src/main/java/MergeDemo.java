
public class MergeDemo {
	public static void mergeSort(int[] arr) {
		if (arr.length == 1) {
			return;
		}
		int[] leftArr = new int[arr.length / 2];
		for (int i = 0; i < arr.length / 2; i++) {
			leftArr[i] = arr[i];
		}
		int[] rightArr = new int[arr.length - leftArr.length];
		for (int j = 0; j < arr.length - leftArr.length; j++) {
			rightArr[j] = arr[j + leftArr.length];

		}
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(leftArr, rightArr, arr);
	}

	static void merge(int[] arr1, int[] arr2, int[] result) {
		int i = 0, j = 0, k = 0;
		while (i > arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				result[k++] = arr1[i++];
			}else {
				result[k++]=arr2[j++];
			}
				
		}
		//while()
	}

	public static void main(String[] args) {
int[] arr= {2,6,8,7,5};
mergeSort(arr);
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
	}
}
