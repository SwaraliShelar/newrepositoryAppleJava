package ArrayVideo;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertAtoZ 
{
	void convertUppertoLower(char a[])//char a[]=arr
	{
		System.out.println("After conversion:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a' && a[i]<='z')
				System.out.print((char)(a[i]-32)+" ");
			else if(a[i]>='A' && a[i]<='Z')
				System.out.print((char)(a[i]+32)+" ");
			else
				System.out.print("Not-Alphabate"+" ");
		}
	}
	public static void main(String[] args)
	{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int size=sc.nextInt();
    char arr[]=new char [size];
    System.out.println("enter a array elements in a character form:");
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=sc.next().charAt(0);
    }
    System.out.println("before conversion:"+Arrays.toString(arr));
    //ConvertAtoZ az=new ConvertAtoZ();
    //ananomous object without name
    //name of object is az from ConvertAtoZ az
    new ConvertAtoZ().convertUppertoLower(arr);//ananomous object
	}

}
