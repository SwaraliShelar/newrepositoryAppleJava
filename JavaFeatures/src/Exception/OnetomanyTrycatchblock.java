package Exception;

public class OnetomanyTrycatchblock
{
	public static void main(String[] args) {

		int a[] = {10,20,30,40,50};
		String s ="abc";
		String s1 = null;
		try
		{
		   System.out.println(a[1]);
		   System.out.println(s.charAt(2));
		   System.out.println(s1.length());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			//e.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println(se);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
