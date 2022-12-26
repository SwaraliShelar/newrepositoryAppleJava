package Array;

import java.util.Scanner;

public class IndexandElementshow {
void indexWithEvenElements(int a[])
{
	System.out.println("\nIndex with even numbers(elements)");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println("index:"+i+" evenelements:"+a[i]);
		}
	}
}
void indexWithOddElements(int a[])
{
	System.out.println("\nIndex with odd numbers(elements)");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		{
			System.out.println("index:"+i+" oddelements:"+a[i]);
		}
	}
}
	public static void main(String[] args)
	{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size:");
    int size=sc.nextInt();
    int a[]=new int [size];
    System.out.println("enter a elements in array:");
    for(int i=0;i<a.length;i++)
    {
    	a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++)
    {
    	System.out.println("index:"+i+" element:"+a[i]);
    }
    IndexandElementshow ie= new IndexandElementshow();
    ie.indexWithEvenElements(a);
    ie.indexWithOddElements(a);
}
}