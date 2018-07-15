package coding.nijas.test1;
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
 Scanner sc=new Scanner(System.in);
	      char ch=sc.next().charAt(0);
	      int s1=sc.nextInt();
	      int s2=sc.nextInt();
	      int s3=sc.nextInt();
int avg=0,max=0,max1=0;
      if(s1<s2&&s1<s3){
        max=s2;
        max1=s3;
      }else if(s2<s3&&s2<s1){
        max=s3;
        max1=s1;
      }else{ 
        max=s1;
      max1=s2;
    }  
      avg=(s1+s2+s3)/3;
      System.out.println(ch);
	      System.out.print(avg);
     
		
	}

}
