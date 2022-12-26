package Array;

import java.util.Arrays;
import java.util.Scanner;
//swapping of number using bubble sort with ascending order 
public class ascendingUsingBubbleArrayScanner
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size:");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter a array element:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}