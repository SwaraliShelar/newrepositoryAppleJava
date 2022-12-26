package WrittenTest10;

import java.util.Arrays;

/*5.WAP to find min character in character array.
 Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], so min character is ‘A’.
*/
public class FindMinCharacterOfArray 
{
public static void main(String[] args)
{
	char ch[] = {'A','D','E','x','z','R'};
	
	for(int i=0;i<ch.length;i++)
	{
		for(int j=0;j<ch.length-1;j++)
		{
		  if(ch[j]>ch[j+1])
		  {
			  char temp=ch[j];
			  ch[j]=ch[j+1];
			  ch[j+1]=temp;
		  }
		}
		System.out.println(Arrays.toString(ch));
	}
	System.out.println("Minimum character in array is:"+ch[0]);
	//System.out.println("Maximum character in array is:"+ch[ch.length-1]);
}
}
