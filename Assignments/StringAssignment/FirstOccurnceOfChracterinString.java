package StringAssignment;
//10.Write a Java program to find first occurrence of a character in a given string.
public class FirstOccurnceOfChracterinString 
{
public static void main(String[] args) 
{
	//by using indexof() we can calculate first occurrence of the character in string
	//        012345678910
	String s="Hello planet earth, you are a great planet.";
	
    System.out.println("First occurence of a character:"+s.indexOf("e",5));	
    
    System.out.println("occurence of the y in string:"+s.indexOf('y'));
    
    System.out.println("First occurence of a pl :"+s.indexOf("pl",3));//from index 3
}
}
