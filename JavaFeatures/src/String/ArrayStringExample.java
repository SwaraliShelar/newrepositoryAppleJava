package String;

import java.util.Arrays;

public class ArrayStringExample
{
	public static void main(String[] args) {

String str[]= {"raj","aradhya","avani","veena","manorama","sanskar","ramlal","rahul","reena","teena"};
for(int i=0;i<str.length;i++)
{
	//System.out.println(str[i]+" => "+str[i].length());
	
	  char ch[]=str[i].toCharArray();//convert String to array in character
	 /*	System.out.println("names Start with r:");
	   if(ch[0]=='r')//names start with r//using method
	  {
		  String s=new String(ch);
		  System.out.println(s);
	  }*/
	 /*System.out.println("names Start with r:");
	   if(str[i].startsWith("r"))//names start with r//using method
		System.out.println(str[i]);*/
	
	
	  /*System.out.println("names that contains "ee" in name:");
        if(str[i].contains("ee"))//names that contains ee in String
		System.out.println(str[i]);*/
	  
	  /*names ends with a
	  System.out.println("names ends with a:");
	  if(ch[ch.length-1]=='a')//using array
	  {
		  String s=new String(ch);
		  System.out.println(s);
	  }*/
	  //names that contains a in name
	  for(int j=0;j<ch.length;j++)
	  {
		  if(ch[j]=='a')
		  {
			  String s=new String(ch);
			  System.out.println(s);
			  break;//it counts very first a in name//otherwise in your name a is present 3 like aradhya  then your name display 3 time
		  }
	  }
}	
	//sort a names
   /* System.out.println(Arrays.toString(str));
	for(int i=0;i<str.length;i++)
	{
		for(int j=0;j<str.length-1;j++)
		{
		if(str[j].compareTo(str[j+1])>0)//compare j and j+1 we use compareTo()
		{
			String temp=str[j];
			str[j]=str[j+1];
			str[j+1]=temp;
		}
		}
	}
    System.out.println(Arrays.toString(str));*/
}
}