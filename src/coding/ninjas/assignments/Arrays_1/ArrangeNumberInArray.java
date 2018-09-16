package Arrays_1;
/*Given a number n, put all elements from 1 to n in an array in order - 1,3,.......4,2.
Input Format :
 Integer n
*/
public class ArrangeNumberInArray {
	public static void main(String[] args) {
		int n=7;
		arrange(n);
	}
	public static int[] arrange(int n){

	int arr[]=new int[n];
    int k=0,i;
    int p=n-1;
    for(i=1;i<=n;i++){
      if(i%2!=0){
        arr[k]=i;
        
        k++;
      }
      else{
        arr[p]=i;
        p--;
      }
    }
    return arr;
	}
}
