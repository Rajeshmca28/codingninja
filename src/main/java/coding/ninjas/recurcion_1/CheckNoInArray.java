package coding.ninjas.recurcion_1;

public class CheckNoInArray {
	public static void main(String[] args00) {
	int[] arr= {2,4,3,7,5,9,1};
	int x=5;
	System.out.println(find(arr,x,0));
	}
 
public static boolean find(int[] input,int x,int index){
  
		if (input.length == 0) {
			return false;
		}
  int[] smallAns=new int[input.length];
  for(int i=0;i<smallAns.length;i++){
		if (input[i] == x) {
			return true;
		}
  }
		 return find(input,x,index);
	}
    }


