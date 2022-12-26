package String;

import java.util.Arrays;

public class RemovetheDuplicateNumberfromArray
{
public static void main(String[] args)
{
	int a[]= {10,20,30,30,20,10};
	int mid=a.length/2;
	int b[]=new int [mid];
	int k=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				b[k]=a[i];
				k++;
			}
		}
	}
	System.out.println(Arrays.toString(b));
}
}
