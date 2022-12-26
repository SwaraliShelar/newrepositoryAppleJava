import java.util.Arrays;

public class RemoveDuplicateCharacterInArray 
{
public static void main(String[] args) 
{
	String s1="Ranjhana";
	char ch[]=s1.toCharArray();
	char k=0;
	int mid=ch.length/2;
	char c11[]=new char[mid];
	
	
	System.out.println(Arrays.toString(ch));
	for(int i=0;i<ch.length;i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{
				c11[k]=ch[i];
				k++;
			}
		}
	}
	System.out.println(Arrays.toString(c11));
	
}
}
