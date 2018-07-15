package com.array;

class MaxSum{

    public static void main(String[] args) 
{
    int arr1[] = {1, 5, 10,15, 20, 25};
    int arr2[] = {2,4, 5,9, 15};
    int m = arr1.length;
    int n = arr2.length;
    System.out.println(maxSumDemo(arr1, arr2, m, n));
}

static int maxSumDemo(int arr1[], int arr2[],int m,int n)
{
int i = 0;
int j = 0;
int sum1 = 0;
int sum2 = 0;
int result = 0;
m=arr1.length;
n=arr2.length;
while (i < arr1.length && j < arr2.length)
{
    if (arr1[i] < arr2[j])
        sum1 += arr1[i++];

    else if (arr1[i] > arr2[j])
        sum2 += arr2[j++];

    else  
    {
        result +=(sum1 > sum2) ? sum1 : sum2;
        sum1 = 0;
        sum2 = 0;

        while (i < arr1.length &&  j < arr2.length && arr1[i] == arr2[j])
        {
            result = result + arr1[i];
            i++;
            j++;
        }
    }
}

while (i < arr1.length)
    sum1  +=  arr1[i++];
while (j <arr2.length)
    sum2 +=  arr2[j++];

result += (sum1 > sum2) ? sum1 : sum2;

return result;
}

}