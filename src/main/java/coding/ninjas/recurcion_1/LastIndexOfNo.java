package coding.ninjas.recurcion_1;

public class LastIndexOfNo {
	public static void main(String[] args) {
		int[] arr= {2,4,3,7,5,9,1};
		int x=5;
		System.out.println(lastIndex(arr,x));
		
	}

	public static int lastIndex(int input[], int x) {
		
      int n=input.length;
       for (int i = n-1; i >0; i--)
      
            if (input[i] == x)
                return i;
      
      return -1;

	}
	
}
