package Exception;

public class Finally
{
public static void main(String[] args) 
{
	int a=10,b=0;
	try
	{
		System.out.println("divide:"+(a/b));
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.println("there is exception occure or not occures finally is block of code which is mendatory to execute ");
	}
	System.out.println();
}
}
