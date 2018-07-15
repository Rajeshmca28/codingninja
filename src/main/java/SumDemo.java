
public class SumDemo {
	public static void main(String[] args) {
		int[] arr= {7,1,5,4,2};
		System.out.println(sum(arr));
	}
public static int sum(int[] input){
	if(input.length==1) {
		return input[0];
	}
	int[] smallAns=new int[input.length-1];
	for(int i=0;i<smallAns.length;i++) {
		smallAns[i]=input[i+1];
		return input[i]+sum(smallAns);
	}
	return -1;
	
}
}
