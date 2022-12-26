package Exception;

public class SingleTryMultipleCatchBlock 
{
	public static void main(String[] args)
	{
        int a=100,b=2;
		int arr[] = { 10, 20, 30, 40, 50 };
		String s1 = "india";
		String s2 = null;

		try
		{
			System.out.println("division:"+(a/b));
			System.out.println("element at index:"+arr[1]);
			System.out.println("char at index:"+s1.charAt(3));
			System.out.println(s2.length());
		}
		catch (ArithmeticException  |ArrayIndexOutOfBoundsException  |StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}*/
		catch(Exception e)//if we dont the what exception it is then we can write it as a Exception e
		{
			e.printStackTrace();
		}
		System.out.println("Done");
		System.out.println("Multiple catch block");
	}
}

