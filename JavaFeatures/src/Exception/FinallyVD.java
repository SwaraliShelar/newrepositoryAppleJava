package Exception;

public class FinallyVD
{
	public static void main(String[] args) 
	{
        int a=100,b=0;
		int arr[] = {10,20,30,40,50};
		String s ="abc";
		String s1 = null;
		try
		{
		  System.out.println("Division:"+(a/b));
		   System.out.println(arr[1]);
		   System.out.println(s.charAt(2));
		   System.out.println(s1.length());
		}
	    catch(ArithmeticException e)
		{
	    	System.out.println(e);
		}
		finally
		{
			System.out.println("Division operation done....");
		}
		
}
}