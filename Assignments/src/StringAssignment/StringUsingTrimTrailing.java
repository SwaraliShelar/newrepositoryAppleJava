package StringAssignment;
//18.Write a Java program to trim trailing white space characters in a string.
public class StringUsingTrimTrailing
{
public static void main(String[] args)
{
	String s="       thinkQuotient soft sol          ";
	System.out.println(s.trim());
	
}
}
/*
 This method checks for value before and after the string and if it exists 
 then eliminates the spaces(leading and trailing) and returns the string
 (without leading and trailing spaces).
 */
