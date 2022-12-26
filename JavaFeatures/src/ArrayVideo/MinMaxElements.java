package ArrayVideo;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxElements {
void miniumNumber(int a[])
{
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<min)
			min=a[i];
	}
	System.out.println("these is a minimum value:"+min);
}
void MaximumNumber(int a[])
{
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max)
			max=a[i];
	}
	System.out.println("these is a maximum value:"+max);
}
	public static void main(String[] args)
	{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int size=sc.nextInt();
    int a[]=new int [size];
    System.out.println("enter the array elements:");
    for(int i=0;i<a.length;i++)
    {
    	a[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(a));
    MinMaxElements nx=new MinMaxElements();
    nx.miniumNumber(a);
    nx.MaximumNumber(a);
	}

}
