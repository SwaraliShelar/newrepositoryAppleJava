package ArrayVideo;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddNumbers {
void evenNumbers(int a[])
{
	System.out.println("\nEven elements are:");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.print(a[i]+" ");
		}
	}
}
void oddNumbers(int a[])
{
	System.out.println("\nOdd elements are:");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		{
			System.out.print(a[i]+" ");
		}
	}

}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Length of array is:"+a.length);
		System.out.println("enter the array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		EvenOddNumbers eo=new EvenOddNumbers();
		eo.evenNumbers(a);
		eo.oddNumbers(a);
	}
}
