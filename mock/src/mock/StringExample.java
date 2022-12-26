package mock;

import java.util.Arrays;

//output:-Thnt
public class StringExample
{
public static void main(String[] args) 
{
	String s1="ThinkQuotient";
	char ch[]=s1.toCharArray();
	System.out.println(Arrays.toString(ch));
	String s2=ch[0]+""+ch[1]+""+ch[ch.length-2]+""+ch[ch.length-1];
	System.out.println(s2);
}
}
