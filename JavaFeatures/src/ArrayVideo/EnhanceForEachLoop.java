package ArrayVideo;

import java.util.Scanner;

public class EnhanceForEachLoop {

	public static void main(String[] args) 
		{
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the size of array:");
		    int size=sc.nextInt();
		    int arr[]=new int [size];
		    System.out.println("enter a array elements:");
		    for(int i=0;i<arr.length;i++)
		    {
		    	arr[i]=sc.nextInt();
		    }
		    for(int x :arr)
		    {
		    	System.out.print(x+" ");
		    }
 /*for each loop  java version 1.5 for each loop or enhance for loop
advantage:-it helps to access element in forward direction only we can display value from index 0 to up to there size
disadvantage:-it helps to access element in backward direction  we cannot display the middle values and we cannot display the reverse values from Size up to 0th index
 */		  
	}

}
