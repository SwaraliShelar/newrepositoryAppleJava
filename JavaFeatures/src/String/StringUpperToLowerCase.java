package String;

import java.util.Arrays;

public class StringUpperToLowerCase
{
public static void main(String[] args) 
{
String s="GeegsForGeegs";
System.out.println(s);
//Converts this string to a new character array
 char c[]=s.toCharArray();
 
 for(int i=0;i<c.length;i++)
 {
	 if(c[i]>='a' && c[i]<='z')
		 c[i]=(char)(c[i]-32);
	 else if(c[i]>='A' && c[i]<='Z')
		 c[i]=(char)(c[i]+32);
 }
 String str=new String(c);//pass char c array as reference variable
 System.out.println(str);
}
}
