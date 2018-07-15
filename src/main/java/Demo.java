
public class Demo {
	public static void main(String[] args) {
		int[] arr= {15,20,12};
		int[] result= {};
	    printSubSet(arr,result,0);
		
	}
	
      static void printSubSet(int[] input, int[] result, int index){
		
		if(index==input.length){
			for(int i =0;i<result.length;i++){
				System.out.print(result[i]+" ");
			}
		}
		int[] res = new int[input.length];
		for(int i =0;i<res.length;i++){
			res[i] = result[i];
		System.out.print(res[i]+" ");
		}
		res[result.length] = input[index];
		
		printSubSet(input, res, index+1);
		
	}
	}
