package sorting;

public class Quick {
		static void quickSort(int[] arr,int start, int end)
		{
		if(end<=start)
		{
		return;
		}
		int pivot=arr[start];
		int i=start;
		int j=end;
		int temp;
		while(start<end) {
			while(arr[start]<=pivot&&start<end) {
				start++;
			}
			while(arr[end]>pivot&&start<=end) {
				end--;
				
			}
			if(start<end) {
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		temp=arr[i];
		arr[i]=arr[end];
		arr[end]=temp;
		quickSort(arr,i,end-1);
		quickSort(arr,end+1,j);
		}
		public void sort(int[] arr) {
			int size=arr.length;
			quickSort(arr,0,size-1);
		}
		public static void main(String[] args)
		{
		int[] input={5,1,2,4,3,7,6};
		int size=input.length;
		quickSort(input,0,size-1);
		for(int i=0;i<input.length;i++)
		{
		System.out.print(input[i]+" ");
		}
		}
		
}
