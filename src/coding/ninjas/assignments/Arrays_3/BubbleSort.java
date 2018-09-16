package Arrays_3;

import javax.swing.plaf.synth.SynthScrollBarUI;

/*Given a random integer array. Sort this array using bubble sort.
Change in the input array itself. You don't need to return or print elements.
Input format :
Line 1 : Integer N, Array Size
Line 2 : Array elements (separated by space)
*/
public class BubbleSort {
public static void main(String[] args) {
	int[] arr= {2,4,6,73,9,1,3};
	bubbleSort(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
public static void bubbleSort(int[] arr){
  for(int j=0;j<arr.length;j++){
for(int i=0;i<arr.length-1-j;i++)
{
if(arr[i]>arr[i+1])
{
int temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
}
    }
  }
}
}
