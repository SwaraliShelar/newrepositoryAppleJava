package AssignmentNo7;
//6. Write a program to find the sum and product of all elements of an array.

import java.util.Arrays;
import java.util.Scanner;
public class SumAndProductOfNumber 
{
void sumOfNumber(int a[])
{
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("\nsum of the given number is:"+sum);
}
void productOfNumber(int a[])
{
	int product=1;
	for(int i=0;i<a.length;i++)
	{
		product=product*a[i];
	}
	System.out.println("\nproduct of the given number is:"+product);
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter array size:");
		   int size=sc.nextInt();
		   int arr[]=new int [size];
		   System.out.println("Enter array elements:");
		   for(int i=0;i<arr.length;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
		   System.out.print(Arrays.toString(arr));
		   SumAndProductOfNumber  sp=new SumAndProductOfNumber();
		   
		   sp.sumOfNumber(arr);
		   sp.productOfNumber(arr);
	}
}
