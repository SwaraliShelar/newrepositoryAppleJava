package ArrayVideo;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	      
	      System.out.println("Enter the size of array:");
	      int size=sc.nextInt();//a.length=size
	      int a[]=new int[size];
	      System.out.println("Enter the elements of array:");
			int n=a.length;
			int mid= n/2;
	      for(int i=0;i<size;i++)
	      {
	    	  a[i]=sc.nextInt();
	      }
	      for(int i=0;i<mid;i++)
	      {
	    	  int temp=a[i];
	    	  a[i]=a[n-1-i];
	    	  a[n-1-i]=temp;
	      }
	    System.out.println(Arrays.toString(a));
	}	
}
