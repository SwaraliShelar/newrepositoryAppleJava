import java.util.Scanner;

public class MaximumLengthOfString
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence:");//satara is beutiful city
	String s=sc.nextLine();
	String s1[]=s.split(" ");
	int max=s1[0].length();//we predict that s1[0] have maximum length
	for(int i=0;i<s1.length-1;i++)
	{
		if(s1[i].length()>max)
		{
			max=s1[i].length();
			System.out.println(s1[i]+"----->"+max);
		}
	}
}
}
