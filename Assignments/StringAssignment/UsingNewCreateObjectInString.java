package StringAssignment;
//1.String create with “” and with new operator
public class UsingNewCreateObjectInString 
{
public static void main(String[] args)
{
	//we create the object using new keyword
	String s=new String("swarali");
	System.out.println(s);
	
	//anything which is inside double quotes are String literal in Java) are maintained in a String pool.
	String s1="abc";
	System.out.println(s1);
}
}
