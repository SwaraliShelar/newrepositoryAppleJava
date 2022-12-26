package String;

public class StringToArrayAndArrayToString 
{
public static void main(String[] args) {
	String s="Java Language";
	//how many time a is occured
		char ch='a';
		int cnt=0;
	for(int i=0;i<s.length();i++)
	{
		//System.out.println(s.charAt(i)+" "+i);//index of String characters
		if(s.charAt(i)==ch)//using pre-define method
		{
			cnt++;
		}
	}
	System.out.println(ch +" is accured "+cnt+" times");

	
	//convert String to array
		char ch1[]=s.toCharArray();
	//char ch1[]= {'J','a','v','a',' ','L','a','n','g','u','a','g','e'};
	
	for(int i=0;i<ch1.length;i++)//using array
	{
		/*if(ch1[i]==ch)//how many time a occured
			cnt++;*/
		
		if(ch1[i]=='a')//convert a to A
			ch1[i]='A';
	}
	//System.out.println(ch +" is accured "+cnt+" times");
	
	
	//to convert array to String you have to create object of String
    String s1= new String(ch1);
    System.out.println(s1);
}
}
