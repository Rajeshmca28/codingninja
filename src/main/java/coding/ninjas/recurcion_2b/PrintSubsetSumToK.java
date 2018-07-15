package coding.ninjas.recurcion_2b;

public class PrintSubsetSumToK {
	public static void main(String[] args) {
		int[] input= {4,8,6,2,3,7};
		int k=14;
		printSubsetsSumTok(input,k);
	}
	
	public static void printSubsetsSumTok(int input[], int k) {
      int[] result={};
      
    subSetSumToK(input,k,0,result);
    }
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

}
