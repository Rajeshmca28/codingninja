package coding.ninjas.recurcion_1;


public class SumOfArray {
public static int sumArray(int[] arr) {

    if(arr.length==1){
      return arr[0];
    }      
      int[] smallAns= new int[arr.length-1];
      for(int i=0;i<smallAns.length;i++)
        smallAns[i]=arr[i+1];
      
      return arr[0]+sumArray(smallAns);
}
public static void main(String[] args) {
	int[] n= {2,4,5,2,1,6};
	System.out.println(sumArray(n));
}
}
