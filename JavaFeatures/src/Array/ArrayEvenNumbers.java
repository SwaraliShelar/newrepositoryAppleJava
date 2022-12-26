package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEvenNumbers {
	void evenNumber(int a[])
    {
    	System.out.println("\nEven numbers are:");
    	for(int i=0;i<a.length;i++)
    	{
    	   if(a[i]%2==0)
    	  {
    		 System.out.print(a[i]+" ");
    	  }
    	}
    	System.out.println();
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayEvenNumbers an=new ArrayEvenNumbers();
	Scanner sc=new Scanner(System.in);
System.out.println("Enter a size:");
int size=sc.nextInt();
int a[]=new int [size]; 
System.out.println("Enter the elements of array:");
for(int i=0;i<size;i++)
{
	a[i]=sc.nextInt();
}	
System.out.println(Arrays.toString(a));
an.evenNumber(a);
	}
	
	
}
