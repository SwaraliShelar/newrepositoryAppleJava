package StringAssignment;
// concat() : The Java String concat() method combines a specific string at the end of another string 
public class Concate2String 
{
public static void main(String[] args) 
{
	String s1="hello!!";
	s1=s1.concat(" how are you");//concat and store in same variable s1
	System.out.println(s1);
	
	String s2="are";
	String s3 = s2.concat(" you available now");//concat and store in different variable s3
	System.out.println(s3);
	
	
}
}
