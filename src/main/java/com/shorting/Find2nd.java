package com.shorting;

public class Find2nd {
	  
	public static int print2largest(int arr[], 
	                                     int arr_size)
	    {
	        int i, first, second;
	      
	        first = second = Integer.MIN_VALUE;
	        for (i = 0; i < arr_size ; i++)
	        {
	            if (arr[i] > first)
	            {
	                second = first;
	                first = arr[i];
	            }
	      
	            else if (arr[i] > second && arr[i] != first)
	                second = arr[i];
	        }
	         
	        if (second == Integer.MIN_VALUE)
return first;
	        	else
	         return second;
	    }
	     
	    public static void main(String[] args) 
	    {
	            int arr[] = {12, 35, 1, 10, 34, 56,7,98,78,0,1};
	            int n = arr.length;
	            print2largest(arr, n);
	    }
	}
