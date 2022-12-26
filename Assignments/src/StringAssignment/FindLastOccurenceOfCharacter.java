package StringAssignment;
//25.Write a Java program to find last occurrence of a character in a given string.
public class FindLastOccurenceOfCharacter
{
public static void main(String[] args)
{
	//or -1 if the character or string does not occur before that point.
	//beg : start search from
	String s="java is easy language";
	int  s1=s.lastIndexOf('l',15);//before 15 last index of l is 
	System.out.println("the last occurence of character in string is:"+s1);
	
	String str="india is my country";
	int str1=str.lastIndexOf('m', 11);//before 11 last index of m is 
	System.out.println("the last occurence of character in string is:"+str1);

	String s5="how are you doing are you fine";
	int s6=s5.lastIndexOf("you", 22);//before 22 last index of you is 
	System.out.println("the last occurence of string in string is:"+s6);

}
}
