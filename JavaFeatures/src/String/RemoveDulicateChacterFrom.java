package String;

import java.util.Arrays;

public class RemoveDulicateChacterFrom
{
public static void main(String[] args)
{
	String s="ranjhana";
	char ch[]=s.toCharArray();
	System.out.println("before removing:"+Arrays.toString(ch));
	int mid=ch.length/2;
	char c[]=new char [mid];
	char k=0;
	for(int i=0;i<ch.length;i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{
				c[k]=ch[i];
				k++;
			}
		}
	}
	System.out.println(Arrays.toString(c));
	/*String str=new String(c);
	System.out.println(str);*/
}
}
