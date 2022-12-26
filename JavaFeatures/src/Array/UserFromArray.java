package Array;

import java.util.Arrays;
import java.util.Scanner;

public class UserFromArray {
	
	void Addition(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.print("\nsum of array elements:"+sum);
	}
void prime(int arr[])
{
	for(int i = 0;i<arr.length;i++)
	{
		 int k=2;
		int mid= arr[i]/2; 
		while(mid >= k)
		{
			if(arr[i] % k== 0)
			{
				break;
			}
			k++;
		}
		if(k>mid)
        {
        	System.out.print("Prime nubers are:"+arr[i]+" ");
        }
		
	}
}
void Reverse(int arr[])
{
	System.out.println("\nArray in reverse order:");

	for(int i=arr.length-1;i>0;i--)
	{
		System.out.println(arr[i]+" ");
	}
}
	public static void main(String[] args) 
	{
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
   /*for(int i=0;i<=size-1;i++)
   {
	   System.out.print(arr[i]+" ");
   }*/
   System.out.println(Arrays.toString(arr));
   UserFromArray ua= new UserFromArray();
   ua.prime(arr);
   ua.Addition(arr);  
   ua.Reverse(arr);
   }

}
