package String;

public class DisplayHiHelloHow
{
public static void main(String[] args)
{
	String s1="Hello";
	String s2="how";
	String s3="hi";
	
    if(s1.length()>s2.length() && s1.length()>s3.length())
    {
    	for(int i=0;i<s1.length();i++)
    	{
    		if(i<s1.length())
    		{
    			System.out.print(s1.charAt(i));
    		}
    		if(i<s2.length())
    		{
    			System.out.print(s2.charAt(i));
    		}
    		if(i<s3.length())
    		{
    			System.out.print(s3.charAt(i));
    		}
    		System.out.println();
    	}
    }
}
}
