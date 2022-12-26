package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchHandlerVD 
{
public static void main(String[] args)
{
	int arr[];
	try
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
        System.out.println("enter array size:");
        int size=sc.nextInt();
        arr=new int[size];
        System.out.println("enter array elements:");
        for(int i=0;i<=arr.length;i++)
        {
        	 arr[i]=sc.nextInt();
        	 sum=sum+arr[i];
        }
        System.out.println("sum of all elements in array:"+sum);
        System.out.println("Average of all elements in array:"+(sum/arr.length));
     sc.close();
	}
/*	catch(ArithmeticException e)//if enter size = 0 then it will occurs
	{
		System.out.println("error message is:"+e.getMessage());
		System.out.println("error type is:"+e.getClass());
	}
	catch(ArrayIndexOutOfBoundsException e)//if size=0 and enter elements in array then error is occur 
	{
		System.out.println("error message is:"+e.getMessage());
		System.out.println("error type is:"+e.getClass());
	}
	catch(InputMismatchException e)//if i enter 1 2 3 a 4 5
	{
	System.out.println("error message is:"+e.getMessage());
		System.out.println("error type is:"+e.getClass());
	}
	catch(Exception e)//we dont no what exception it is
	{
		System.out.println("error message is:"+e.getMessage());
		System.out.println("error type is:"+e.getClass());
	}
	*/
	
	//java 1.7 provides multicatch block
	catch(ArithmeticException |ArrayIndexOutOfBoundsException |InputMismatchException e)
	{
		System.out.println("error message is:"+e.getMessage());
		System.out.println("error type is:"+e.getClass());
	}
	catch(Exception e)//generic catch hander apart from above exception if another exception is occur then it will handle by this generic exception
	{
		System.out.println("error message is:"+e.getMessage());
		System.out.println("error type is:"+e.getClass());
	}
	
}
}
