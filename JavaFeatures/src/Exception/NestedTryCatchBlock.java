package Exception;

public class NestedTryCatchBlock 
{
public static void main(String[] args) 
{
	int a=200, b=2;
	int arr[]= {10,20,30,40,50};
	String s="satara";
	String s1=null;
	try
	{
		try
		{
			try 
			{
				try//in inner try the 1st stmt should be at last try block
				{
					System.out.println("divide:"+(a/b));
				}
				catch(ArithmeticException e)
				{
					System.out.println(e);
				}
				System.out.println("element at index:"+arr[8]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println("char at index:"+s.charAt(9));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		System.out.println(s1.length());
	}
	catch(NullPointerException e)
	{
		//System.out.println(e);
		e.printStackTrace();
	}
	System.out.println("done nested try catch......");
}
}
