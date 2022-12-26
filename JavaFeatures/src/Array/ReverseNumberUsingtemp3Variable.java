package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumberUsingtemp3Variable 
{

public static void main(String[] args) 
{	
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a array size:");
    int size=sc.nextInt();
    int arr[]=new int [size];
    System.out.println("Enter a array elements:");
    int n=arr.length;//6
    int mid=n/2;//3
    for(int i=0;i<arr.length;i++)
    { 
    	arr[i]=sc.nextInt();
    }
    for(int i=0;i<mid;i++)
    {	
    	int temp=arr[i];
    	arr[i]=arr[n-i-1];
    	arr[n-i-1]=temp; 
    }
    System.out.print(Arrays.toString(arr));
	}
}
/*	public static void main(String[] args) 
{
  int a[]= {10,20,30,40,50,60};
	int n=a.length;
	int mid=n/2;
    System.out.println(Arrays.toString(a));
	for(int i=0;i<mid;i++)
	{
		int temp=a[i];
		a[i]=a[n-i-1];
		a[n-i-1]=temp;
	}
    System.out.println(Arrays.toString(a));
} 
}*/