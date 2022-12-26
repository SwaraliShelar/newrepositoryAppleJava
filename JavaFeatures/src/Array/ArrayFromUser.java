package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromUser {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the size of array:");
      int size=sc.nextInt();
      
      int arr[]=new int[size];
      //int[] arr=new int[size];
      System.out.println("Enter the elements of array:");
      for(int i=1;i<size;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      /*for(int i=0;i<size;i++)
      {
    	  System.out.print(arr[i]+" ");
      }*/
      System.out.println(Arrays.toString(arr));//Arrays - utility class
	}

}
