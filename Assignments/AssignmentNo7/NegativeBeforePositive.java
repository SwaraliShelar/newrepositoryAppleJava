package AssignmentNo7;

import java.util.Arrays;
import java.util.Scanner;

/*11.WAP to arrange the elements of an given array of integers
where all negative integers appear before all the positive 
integers*/
public class NegativeBeforePositive
{
 	public static void main(String[] args)
	{
		 Scanner sc= new Scanner(System.in);
		    System.out.println("Enter the size of array:");
		    int size=sc.nextInt();
		    int a[]=new int [size];
		    System.out.println("enter the "+ size +" positive negative array numbers(elements):");
		    for(int i=0;i<a.length;i++)
		    {
		    	a[i]=sc.nextInt();
		    }
		    System.out.println(Arrays.toString(a));
		    NegativeBeforePositive nbp=new NegativeBeforePositive();
		  	}

}
