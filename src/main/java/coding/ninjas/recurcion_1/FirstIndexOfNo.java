package coding.ninjas.recurcion_1;

public class FirstIndexOfNo {
public static int firstIndex(int[] arr,int n) {
	for (int i = 0; i < arr.length; i++)
	      
        if (arr[i] == n)
            return i;
  
    return -1;
}
public static void main(String[] args) {
	int[] arr= {2,4,3,7,5,9,1};
	int x=5;
	System.out.println(firstIndex(arr,x));
	
}
}

