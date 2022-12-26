package Array;

import java.util.Arrays;
import java.util.Scanner;

public class UpperLOwerCaseCon {

	void CharacterCasting(char c[])
	{
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a' && c[i]<='z')
			{
				c[i]=((char)(c[i]-32));
			}
			else if (c[i]>='A' && c[i]<='Z')
			{
				c[i]=((char)(c[i]+32));
			}
		}
		System.out.println("new Array:"+Arrays.toString(c));
	}
	public static void main(String[] args)
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a array size:");
     int size=sc.nextInt();
     char a[]=new char [size];
     System.out.println("enter a array character:");
     for(int i=0;i<a.length;i++)
     {
    	 a[i]=sc.next().charAt(0);   
     }
     System.out.println("Origrnal array:"+Arrays.toString(a));
     UpperLOwerCaseCon up= new  UpperLOwerCaseCon();
     up.CharacterCasting(a);
     }
}
