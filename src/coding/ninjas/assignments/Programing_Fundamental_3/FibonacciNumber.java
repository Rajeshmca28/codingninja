package Programing_Fundamental_3;
/*Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
*/
public class FibonacciNumber {
	public static boolean checkMember(int n){
		
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
      	 int a = 0;
         int b = 1;
         int c = a+b;
         
        while (a < n)
        {
            
            a = b;
            b=c;c=a+b;
        }
         
        if(a == n)
        {
            return true;
        }
        else
        {
        return false;
        }
        }
      
}
