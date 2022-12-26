package AssignmentNo7;

import java.util.Arrays;
import java.util.Scanner;
/*3. Take 10 integer inputs from user and store them in an array. Again ask user 
to give a number. Now, tell user whether that number is present in array or 
not*/
public class ArrayNumberIsPresentorNot 
{
void arrayElementPresentOrNot(int a[])
{
	
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter array size:");
		   int size=sc.nextInt();
		   int arr[]=new int [size];
		   System.out.println("Enter array elements:");
		   for(int i=0;i<arr.length;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
		   System.out.print("\nArray :"+Arrays.toString(arr));
		  /* 
		   System.out.print("\nEnter a number : so we show number is present in array or not: ");
		   boolean flag=true;
		    int num=sc.nextInt();
			for(int i=0;i<arr.length;i++)
			{
				if(num==arr[i])
					flag = false;
				    break;
			}
			if(flag==true)
				System.out.print("present");
		    else
				System.out.print("absent");
			*/
		   ArrayNumberIsPresentorNot  ip= new ArrayNumberIsPresentorNot();
		   ip.arrayElementPresentOrNot(arr);
	}

}
