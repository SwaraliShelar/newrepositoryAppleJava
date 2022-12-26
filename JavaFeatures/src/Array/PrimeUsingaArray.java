package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeUsingaArray 
{
	void primeUsingFlag(int a[])
	{
		System.out.println("\nPrime numbers:");
		for(int i=0;i<a.length;i++)
		{
			boolean flag=true;
			for(int j=2;j<a.length;j++)
			{
				if(a[i]%j==0)
					flag=false;
					break;	
			}
			if(flag==true)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	
void primeUsingMid(int a[])
{
	System.out.println("\nPrime numbers:");
	for(int i=0;i<a.length;i++)
	{
		int mid=a[i]/2;
		int j;
	    for(j=2;j<=mid;j++)
	    {
	    	if(a[i]%j==0)
	    	{
	    		break;
	    	}	
	    }
	    if(j>mid)
    	{
    		System.out.print(+a[i]+" ");
    	}
	}
}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size:");
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("enter array elements:");
for(int i=0;i<=a.length-1;i++)
{
	a[i]=sc.nextInt();
}
System.out.println(Arrays.toString(a));
PrimeUsingaArray pa=new PrimeUsingaArray();
pa.primeUsingFlag(a);
pa.primeUsingMid(a);
	}

}
