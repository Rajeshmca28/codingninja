package Programing_Fundamental_4;

import java.util.Scanner;

/*You are given S a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one.
That is, in the sequence if numbers are decreasing, they can start increase at one point. And once number starts increasing, they cannot decrease at any point further.
Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. So in both the cases, print true.
You just need to print true/false. No need to split the sequence.
*/
public class CheckNumberSequence {
	public static void main(String[] args) {
		// Write your code here
Scanner s = new Scanner(System.in);
      int N = s.nextInt();
      int[] Arr = new int[N];
      int j=0,k=0,previous,current,count=0;
      boolean IsDecrease = true;
      for(int i=0;i<N;i++){
       Arr[i]= s.nextInt();
      }
      while(j<N-1){
        previous = Arr[j];
        current = Arr[j+1];
        //decreasing sequence
        if(current<previous){
          if(IsDecrease){
            k=k+1;
          }
          IsDecrease = false;
        }
        //increasing sequence
        else if(current>previous){
          if(!IsDecrease){
            k=k+1;
          }
          IsDecrease = true;
          count = count+1;
        }
        else {
          IsDecrease  = false;
        }
 
        
         j=j+1;   
      }
      if((k==0 || k>2) && count!=N-1){
            System.out.print(false);
        }
        if(k==1 || k==2 ||(count==N-1)){
            System.out.print(true);
        }
     
      	}
}
