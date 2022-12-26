package StringBufferandStringBuilder;

public class StringBufferVideo
{
public static void main(String[] args) 
{
	StringBuffer sbf1=new StringBuffer("hello ");
	
	//append()  method
	sbf1.append("java");//now original string is changed
	System.out.println("After apppend:"+sbf1);
	
	//insert()  method
	StringBuffer sbf2=new StringBuffer("hello ");
	sbf2.insert(1, "java");//now original string is changed
	System.out.println("After insert:"+sbf2);
	
	//replace()  method
	StringBuffer sbf3=new StringBuffer("hello ");
	sbf3.replace(1, 3, "best");
	System.out.println("After replace:"+sbf3);
	
	
	//delete()  method
	StringBuffer sbf4=new StringBuffer("hello ");
	sbf4.delete(1, 3);
	System.out.println("After delete:"+sbf4);
	
	//reverse()  method
	StringBuffer sbf5=new StringBuffer("hello");
	sbf5.reverse();
	System.out.println("After reverse:"+sbf5);
	
	//capacity() method
	StringBuffer sbf6=new StringBuffer();
	System.out.println(sbf6.capacity());//default 16
	sbf6.append("hello");
	System.out.println(sbf6.capacity());//now 16
	sbf6.append("java is my favourite language");
	System.out.println(sbf6.capacity());//now
}
}
