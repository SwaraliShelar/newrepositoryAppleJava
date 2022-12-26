package String;

import java.util.Arrays;

public class StringMethods
{
public static void main(String[] args) 
{
	String s1="swarali";
	String s2="Shelar is good";
	String s3="SwaRaLi";
	String s4="swarali";
	
	String s5=new String("swarali");
	//when we create it point at the memory location and also object is created then the value get initialize in both in memory and in String constant pool but they check if newely created string is already available in memory then it not allocate separate memory for same name of String 

	
	//(==)its display the object in same memory location
	System.out.println(s1==s5);
	
	//(.equals());this method display same content for string
	System.out.println(s1.equals(s3));
	
	//(.equalsIgnoreCase());this method ignore the capital & small letter in String
	System.out.println(s1.equalsIgnoreCase(s3));
	
	/*//concatination
	System.out.println(s1+" vinayak shelar");//simple
	
	//(.concat()); is used to attach or concat to strings
	System.out.println(s1.concat(s2));
	
	s1=s1.concat(" shelar");//we concat the shelar and store the value at s1
	System.out.println(s1);*/
	
	//comparision compareTo
	//their there the  compare get the their there 
	System.out.println(s3.compareTo(s1));
	System.out.println(s1.compareTo(s3));

	/*if s1 > s2, it returns positive number  
	if s1 < s2, it returns negative number  
	if s1 == s2, it returns 0  */
	//ascii value  -ve   2>1
	//+ve   1>2
	//0   1=2
	System.out.println(s1.compareToIgnoreCase(s3));
	System.out.println(s1.compareTo(s4));

	
//	                                                   012345
	System.out.println("CharAt:"+s2.charAt(10));  //s2="Shelar is good"
	
	//System.out.println("Contains:"+s2.contains(s4));
	System.out.println("Contains:"+s2.contains("good"));
	System.out.println("Contains:"+s2.contains("god"));//1 character or more than 1
	
	//System.out.println("Start with:"+s2.startsWith(s5));
	System.out.println("Start with:"+s2.startsWith("Sh"));//1 character or more than 1
	
	//System.out.println("Ends with:"+s2.endsWith(s5));
	System.out.println("Ends with:"+s2.endsWith("ood"));
	
	
//                                                         012345678910111213
	System.out.println("Index of:"+s2.indexOf("is"));//s2="Shelar is good"     character/string

	System.out.println("Last index of:"+s2.lastIndexOf('g'));//character/string
	
	System.out.println(s4.replace('a','A'));
	System.out.println(s4.replace("a", "pppp"));
	System.out.println(s4);
	
	String s6="Concatination";
	
	System.out.println(s6.substring(5));//5 = end of String
	System.out.println(s6.substring(3, 10));
	
	System.out.println(s6.toLowerCase());
	System.out.println(s6.toUpperCase());
	
	
//some additional methods	
String str1="java is good programming language";
	
	String str2="        ThinkQuotient pvt ltd         ";//trim()
	
	System.out.println(str1.indexOf('p'));//index number of character
	//System.out.println(s.indexOf('m',22));//character start index -1 answer because after these index character is not available it before that why 1 is -ve
	System.out.println(str1.indexOf('m',19));//character starts index first occurence

	System.out.println(str1.lastIndexOf('a'));//last occurrence
	
	System.out.println(str1.replace("o","u"));
	//System.out.println(s.replace("g","tttt"));
	System.out.println(str1.replaceFirst("g", "GG"));
	//System.out.println(s.replaceAll("is", "replacement"));//replace on string by another string
	
	System.out.println(str1.substring(4, 14));//14-4=10
	
	
	System.out.println(str2);
	
	System.out.println(str2.trim());//remove first and last empty sequence get removed

	
String str3="hello#world#language";
	
	String s[]=str3.split("#");
	System.out.println(Arrays.toString(s));
}
}
