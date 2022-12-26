package String;

import java.util.Arrays;

public class Deleteelmentusingindex
{
	void elementDelete(int arr[],int index)
	{
		int len=arr.length;
		int a[]=new int[len];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(i!=index)
			{
				a[j]=arr[i];
				j++;
			}
			else
				continue;
		}
		System.out.println(Arrays.toString(a));
	}

public static void main(String[] args) 
{
	int a[]= {10,20,30,60,50,70};
	System.out.println(Arrays.toString(a));
	Deleteelmentusingindex da=new Deleteelmentusingindex();
	da.elementDelete(a, 3);
	System.out.println();
}
}
