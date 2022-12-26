package WrittenTest9;

import java.util.Arrays;
//1.WAP to split string into 2 tokens where string is “HELLO@WORLD”
public class SplitTheString 
{
public static void main(String[] args)
{
	String s1="HELLO@WORLD";
	String s2[]=s1.split("@");
	//System.out.println(Arrays.toString(s2));
	for(String a:s2)
		System.out.println(a);
}
}
