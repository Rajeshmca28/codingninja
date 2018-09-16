package Arrays_3;
/*Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.
That is, we can switch from one array to another array only at common elements.
If no intersection element is present, we need to take sum of all elements from the array with greater sum.
Input Format :
 Line 1 : An integer M i.e. size of first array
 Line 2 : M integers which are elements of first array, separated by spaces
 Line 3 : An integer N i.e. size of second array
 Line 4 : N integers which are elements of second array, separated by spaces
*/
public class MaximizeTheSum {
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 73, 9, 1, 3 };
		int[] arr2 = { 2, 4, 6, 73, 9, 1, 3 };
		System.out.println(maximumSumPath(arr1,arr2));
	}
	public static long maximumSumPath(int[] input1, int[] input2) {
		
      
int i = 0;
int j = 0;
int sum1 = 0;
int sum2 = 0;
long result = 0;
int m=input1.length;
int n=input2.length;
while (i < input1.length && j < input2.length)
{
    if (input1[i] < input2[j])
        sum1 += input1[i++];

    else if (input1[i] > input2[j])
        sum2 += input2[j++];

    else  
    {
        result +=(sum1 > sum2) ? sum1 : sum2;
        sum1 = 0;
        sum2 = 0;

        while (i < input1.length &&  j < input2.length && input1[i] == input2[j])
        {
            result = result + input1[i];
            i++;
            j++;
        }
    }
}

while (i < input1.length)
    sum1  +=  input1[i++];
while (j <input2.length)
    sum2 +=  input2[j++];

result += (sum1 > sum2) ? sum1 : sum2;

return result;

		
	}
}

