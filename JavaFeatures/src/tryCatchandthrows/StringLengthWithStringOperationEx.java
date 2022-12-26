package tryCatchandthrows;

public class StringLengthWithStringOperationEx 
{
	int getStringLength(String s)throws NullPointerException//called method
	{
		return s.length();
	}
	void stringOperation(String s)
	{
		try
		{
			System.out.println(getStringLength(s));
			
			System.out.println(s.toLowerCase());
			System.out.println(s.toUpperCase());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args)//calling method
	{
		StringLengthWithStringOperationEx  slm=new StringLengthWithStringOperationEx ();
		slm.stringOperation("mumbai");
		slm.stringOperation("pune");
		slm.stringOperation(null);
		slm.stringOperation("nashik");
		slm.stringOperation("chennai");
	}
}
