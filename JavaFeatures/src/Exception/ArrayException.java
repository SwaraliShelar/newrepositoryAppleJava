package Exception;

public class ArrayException 
{
public static void main(String[] args)
{
	int a[]= {10,20,30,40,50};
	try
	{
	System.out.println(a[10]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
		//e.printStackTrace();
	}  
}
}
