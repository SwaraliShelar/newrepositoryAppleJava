package Array;

import java.util.Arrays;

public class NegatvValReplaceBySquaOfNext
{

	public static void main(String[] args) 
	{
    int a[]= {7,-3,5,6,-2,7,-1,8,-9,6,-3,6,-2,5 };
	System.out.println(Arrays.toString(a));
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]<0)
    	{
    		a[i]=a[i+1]*a[i+1];//replace the negative value with next number square
    	}
    }
    System.out.println(Arrays.toString(a));
	}

}
