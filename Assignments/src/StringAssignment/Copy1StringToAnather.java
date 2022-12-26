package StringAssignment;
//8.Write a Java program to copy one string to another string.
//we can copy one string into another by using valuOf();
public class Copy1StringToAnather 
{
public static void main(String[] args) 
{
	String s1="shyam";//using string literal
	String s2=s1.valueOf(s1);
	System.out.println("1st string:"+s1);
	System.out.println("2nd string:"+s2);
	
	String s3=new String("Ram");//using new object
	String s4=s3.valueOf(s3);
	System.out.println("3rd string:"+s3);
	System.out.println("4th string:"+s4);
	
	
}
}
