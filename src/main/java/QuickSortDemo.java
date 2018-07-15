
public class QuickSortDemo {
	public  void sort(int[] input) {
		if(input==null||input.length==0) {
			return;
		}
		int length=input.length;
		quickSort(input,0,length-1);
		}
public void quickSort(int[] input,int start,int end) {
	int i=start;
	int j=end;
	
	int pivot=(start-end)/2;
	while(i<j) {
		while(input[i]<=pivot) {
			i++;
			while(input[j]<pivot) {
				j--;
				int temp=input[i];
				input[i]=input[j];
				input[j]=temp;
				i++;
				j--;
			}
		}
		if(start<j)
			quickSort(input,start-1,j);
		if(i<end)
			quickSort(input,i,end);
		
	}
	
}	
	
	
public static void main(String[] args) {
	QuickSortDemo q=new QuickSortDemo();
	int[] arr= {2,8,9,4,5,1,3};
q.sort(arr);

}	
	
}	
	
	
	
	
	
	
	
	
	
