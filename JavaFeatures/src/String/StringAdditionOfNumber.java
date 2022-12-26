package String;

import java.util.Arrays;
//ascii value of 0=48,1=49,2=50,3=51,4=52,5=53,6=54,7=55,8=56,9=57,10=58
public class StringAdditionOfNumber
{
public static void main(String[] args) 
{
	String str="java5is6language7";
	
	char ch[]=str.toCharArray();
	int sum=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='0' && ch[i]<='9')// 0 and 9 should in single quotes
		{
			System.out.print(ch[i]+" ");
			sum=sum+(ch[i]-48);
		}
	}
	System.out.println("\nsum:"+sum);
}
}
