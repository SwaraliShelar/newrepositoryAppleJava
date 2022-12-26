package StringVideo;

public class StringMethod 
{
public static void main(String[] args)
{
	String str1=new String("HelloWorld");
	String str2=new String("helloworld");
	System.out.println("Index of Given character is:"+str1.indexOf("H"));
	System.out.println("Index of Given String is:"+str2.indexOf("wor"));
	
	//compare to
	if(str1.compareTo(str2)==0)
		System.out.println("String are equal");
	else if(str1.compareTo(str2)<0)
		System.out.println("str1 is less than str2");
	else if(str1.compareTo(str2)>0)
		System.out.println("str1 is greater than str2");
//String str1=new String("helloworld");String str2=new String("helloworld"); both are contain same String with same ascii value of string	
//String str1=new String("helloworld");String str2=new String("HelloWorld"); Str1 contains All string in small letter  ascii value of string is greater than capital HW
//String str1=new String("HelloWorld");String str2=new String("helloworld"); str2 contains all string in small letter and in str2 hw is in capital Ascci value of lees than small letter in hw 	
	
	
	//substring
System.out.println("substring:"+str1.substring(1));//print from index we enter
System.out.println("substring:"+str2.substring(2, 8));

//last index
System.out.println("last index l is:"+str1.lastIndexOf("l"));

//startwith
System.out.println("startwith:"+str2.startsWith("he"));

//endwith
System.out.println("endswith:"+str1.endsWith("ld"));

//touppercase
System.out.println("Uppercase:"+str1.toUpperCase());

//tolowercase
System.out.println("lowercase:"+str2.toLowerCase());
}
}
