package coding.ninjas.array.TwoD;

import java.util.Arrays;

class WaveDemo
{
 
   public static void sortInWave(int arr[], int n)
    {
        Arrays.sort(arr);
 int temp=0;
        for (int i=0; i<n-1; i += 2) {
        	  temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
        }
    }
 
    public static void main(String args[])
    {
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
       sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
