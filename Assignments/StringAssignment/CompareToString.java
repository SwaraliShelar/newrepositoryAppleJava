package StringAssignment;
//6.Write a Java program to compare two strings.
public class CompareToString 
{
public static void main(String[] args)
{
	//create object by using string literal
	String str1="HelloWorld";
	//String str2="HelloWorld";
	
	//create object by using new keyword
	String s1=new String("HelloWorld");
	
	System.out.println(str1==s1);
	System.out.println(str1.equals(s1));
	
	//System.out.println(str1==str2);	
	
	//System.out.println(str2==s1);
	
	//System.out.println(str2.equals(s1));
}
}
