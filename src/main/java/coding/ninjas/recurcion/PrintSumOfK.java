package coding.ninjas.recurcion;

public class PrintSumOfK {
public static void subSetSumToK(int[] input,int k,int index,int[] result) {
	if(index==input.length) {
		int sum=0;
		for(int i=0;i<result.length;i++) {
			sum=sum+result[i];
		}
		if(sum==k) {
			for(int i=0;i<result.length;i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
		}
		return;
	}
	subSetSumToK(input,k,index+1,result);
	int[] newResult=new int[result.length+1];
	int i=0;
	for(;i<result.length;i++) {
		newResult[i]=result[i];
	}
	newResult[i]=input[index];
	subSetSumToK(input,k,index+1,newResult);
}
public static void main(String[] args) {
	int[] arr= {2,4,1,7,8,9,5};
	int[] result= {};
	int k=13;
	subSetSumToK(arr,k,0,result);
}
}
