package Exception;

public class SimpleException
{

	void addition(int a,int b)
	{
		System.out.println("addition is:"+(a+b));
	}
	void division(int a,int b)//we can write any where means at time 
	{
		try
		{
		System.out.println("division:"+(a/b));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	void multiplication(int a,int b)
	{
		System.out.println("multiplication is:"+(a*b));
	}void substraction(int a,int b)
	{
		System.out.println("substraction:"+(a-b));
	}
	
	public static void main(String[] args)//calling method
	{
		int a=150,b=0;
		SimpleException se=new SimpleException();
		se.addition(a, b);
		/*try                 //we can write any where means at time 
		{
			se.division(a, b);
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			e.printStackTrace();//ystem.ot     system.in    system.err    printStackTrace()  it display the which line exception is occurs    s
		}*/
		se.division(a, b);
		se.multiplication(a, b);
		se.substraction(a, b);

		
    }
}
