import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInUsingIndexArray 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int a[]= {10,20,60,40,70,60};
	System.out.println(Arrays.toString(a));
	System.out.println("enter the index to element in array:");
	int index=sc.nextInt();
	int b[]=new int [a.length];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(index==i)
			{
				a[i]=b[j];
				j++;
			}
			else
			continue;
		}
	}
	System.out.println(Arrays.toString(a));
}
}
