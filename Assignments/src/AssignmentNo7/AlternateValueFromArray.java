package AssignmentNo7;

import java.util.Arrays;
import java.util.Scanner;

//2. WAP to print the alternate values from an array.
public class AlternateValueFromArray
{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter array size:");
		   int size=sc.nextInt();
		   int arr[]=new int [size];
		   System.out.println("Enter array elements:");
		   for(int i=0;i<arr.length;i+=2)
		   {
			   arr[i]=sc.nextInt();
		   }
		   System.out.print("\nArray values are:");
		   for(int i=0;i<arr.length;i+=2)//only write these for loop otherwise  output print like these 0 means 1 0 3 0 5
		   {
			  System.out.print(arr[i]+" ");
		   }
		   AlternateValueFromArray av=new AlternateValueFromArray();
		 
	}

}
