package ArrayVideo;

import java.util.Arrays;
import java.util.Scanner;

public class VarArgExample 
{
	void show(int ...a)//(int ...a) VarArg write number of variables number of arguments in only one methods
	{
		System.out.println();
		for(int val : a)
		{
			System.out.print(val+" ");
		}
	}
public static void main(String[] args)
{
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
	VarArgExample  va= new VarArgExample();
	va.show(15,33);
	va.show(87,90,65,84,34,76,98,656,98);
	va.show(2,4,5);
	va.show(67,56,78,54);
	va.show(2);
	va.show(a);
}
}
