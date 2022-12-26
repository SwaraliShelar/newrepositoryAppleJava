package AssignmentOnArray;

import java.util.Arrays;
import java.util.Scanner;

/*20. Accept number from user and add table of number in array and display*/
public class PrintTable
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	      
	      System.out.println("Enter the size of array:");
	      int size=sc.nextInt();
	      int arr[]=new int[size];//int[] arr=new int[size];
	      
	     System.out.println("Enter number to print a table:");
	      int num=sc.nextInt();
	      for(int i=1;i<=size;i++)
	      {  
	    	  System.out.println(i*num);
	      }
	}

}
