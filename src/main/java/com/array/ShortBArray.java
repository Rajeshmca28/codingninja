package com.array;

class ShortBArray {
    
    static void shorBinaryArray(int arr[])
    {
        int n = 0; 
     
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                n++;
        }
 
        for (int j = 0;j< n; j++)
            arr[j] = 0;
 
        for (int k = n; k < arr.length; k++)
            arr[k] = 1;
    }
     
    public static void main(String[] args)
    {
        int arr[] = new int[]{ 0, 1, 0, 1, 1, 1 };
        int n = arr.length;
 
        shorBinaryArray(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");    
  
    }
}
 