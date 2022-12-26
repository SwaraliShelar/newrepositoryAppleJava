package tryCatchandthrows;

public class StringLengthexample
{
	//using try catch does not holt the program
	/*int getStringLength(String s)//called method
	{
		return s.length();
	}
	public static void main(String[] args)//calling method
	{
		StringLengthexample sl=new StringLengthexample();
		System.out.println(sl.getStringLength("mumbai"));
		System.out.println(sl.getStringLength("pune"));
		try
		{
		System.out.println(sl.getStringLength(null));
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		System.out.println(sl.getStringLength("java"));
		System.out.println(sl.getStringLength("language"));
	}*/
	
	//using throws holt the program
	int getStringLength(String s) throws NullPointerException//called method
	{
		return s.length();
	}

	public static void main(String[] args)//calling method
	{
		StringLengthexample sl=new StringLengthexample();
		System.out.println(sl.getStringLength("mumbai"));
		System.out.println(sl.getStringLength("pune"));
		System.out.println(sl.getStringLength(null));
		System.out.println(sl.getStringLength("java"));
		System.out.println(sl.getStringLength("language"));
	}
}
