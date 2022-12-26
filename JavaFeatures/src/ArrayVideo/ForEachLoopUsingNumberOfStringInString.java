package ArrayVideo;

import java.util.Scanner;

public class ForEachLoopUsingNumberOfStringInString
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int size=sc.nextInt();
String arr[]=new String [size];
System.out.println("enter a array elements in a String format:");
for(int i=0;i<arr.length;i++)
{
	arr[i]=sc.next();
}
for(String x:arr)
{
	System.out.print(x +" => ");
	System.out.println("length of the given string is:"+x.length());

}
}
}