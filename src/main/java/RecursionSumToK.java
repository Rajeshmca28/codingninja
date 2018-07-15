public class RecursionSumToK {
	
	public static int[][] subsetsSumK(int input[], int k,int index) {
		if(input.length==index) {
			if(k==0) {
			  int[][]arr = new int[1][0];
			  return arr;
			}
			else {
				int[][]arr = new int[0][0];
				  return arr;
			}
		}
		// create first 2d Array s1 include index
		int[][] s1 = subsetsSumK(input,k-input[index],index+1);
		
		// create first 2d Array s1 include index
		int[][] s2 = subsetsSumK(input,k,index+1);
		
		//creating a third array for the store the element for the both the array
		int[][] result = new int[s1.length+s2.length][];
		
		//fill the element of first 
		for(int i=0;i<s1.length;i++) {
			
			result[i] = new int[s1[i].length+1];
				result[i][0] = input[index];
			for(int j=0;j<s1[i].length;j++) {
				result[i][j+1] = s1[i][j];
			}
		}
		
		//fill the result 
		for(int i=0;i<s2.length;i++) {
			result[i+s1.length] = new int[s2[0].length];
			result[i+s1.length] = s2[i];
		}
		return result;

	}


	public static void main(String[] args) {
		
		int[] input = {1,2,3,5,6,4};
		int k=13;
      int[][] arr = subsetsSumK(input,k,0);
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<arr[i].length;j++) {
    		  System.out.print(arr[i][j]+" ");
    	  }
    	  System.out.println();
      }
	}
}

