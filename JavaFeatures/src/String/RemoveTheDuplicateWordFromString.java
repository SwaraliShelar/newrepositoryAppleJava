package String;

import java.util.Arrays;

public class RemoveTheDuplicateWordFromString 
{
public static void main(String[] args)
{


	String s1="java language core java session  advance java session";
	
	      	 //java language core java session advance java session
	
	String str[]=s1.split(" ");
	System.out.println(Arrays.toString(str));
	String d="";
	for(int i=0;i<str.length;i++)      //i=0      i=1      i=2     i=3    i=4        i=5     i=6    i=7
	{                                  //java   language   core     0   session    advance    0    session
		int cnt=1;
		for(int j=i+1;j<str.length;j++)//j=1   
		{
			if(str[j].equalsIgnoreCase(str[i]))
			{
				cnt++;                //cnt=2    cnt=1    cnt=1    cnt=2    cnt=1    cnt=1   cnt=2   cnt=1
				str[j]="0";
			}				
		}
     	if(!str[i].equals("0") && cnt==1)
	    {
		  d=d+str[i]+" ";
	    }
	}
	System.out.println(d);
}
}
