package Array;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeReplaceNuBy0 {

void replaceNumber(int arr[])
{
	System.out.println("\nnegative number after replacing by 0");
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<0)
		{
		System.out.print(0+" ");
		}
		else
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		   System.out.println("Enter array size:");
		   int size=sc.nextInt();
		   int arr[]=new int [size];
		   System.out.println("Enter array elements:");
		   for(int i=0;i<arr.length;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
		   System.out.print(Arrays.toString(arr));
		   NegativeReplaceNuBy0 al=new  NegativeReplaceNuBy0();
		   al.replaceNumber(arr);
		   
	}


}
