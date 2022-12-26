package Array;

import java.util.Arrays;

public class BubbleSortingCharacterAscensingUsingSwapping 
{

	public static void main(String[] args)
	{
    char ch[]= {'z','d','p','e','s','x','b','g','a'};
    System.out.println(Arrays.toString(ch));
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
    	//System.out.println(Arrays.toString(a)); its display output in details
    }
	System.out.println(Arrays.toString(ch));
	System.out.println("first maximum value:"+ch[ch.length-1]);
	System.out.println("second maximum value:"+ch[ch.length-2]);
	
	System.out.println();
	
	System.out.println("first minimum value:"+ch[0]);
	System.out.println("second minimumvalue:"+ch[1]);
	System.out.println("");
	}

}
