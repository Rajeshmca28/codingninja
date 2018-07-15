package com.shorting;

class SecondLargestNo
{
public static void main(String[] args)
{
//int i=0;
int[] arr={2,43,12,45,5,10,9,11,8};
System.out.println(secLarge(arr));
}


static int secLarge(int[] arr) {
	int temp, i=0;
for(int j=0;j<arr.length;j++){
for(i=0;i<arr.length-2;i++)
{
if(arr[i]>arr[i+1])
{
 temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;

}
}

}
int x=arr[i-1];
return x;
/*for(int k=0;k<arr.length;k++) {
	System.out.print(arr[k]+" ");
}*/
}}