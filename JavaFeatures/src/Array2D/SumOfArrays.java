package Array2D;

import java.util.Scanner;

public class SumOfArrays
{
	public static void main(String[] args)
	{
 
	int a[] []= {{1,2,3},{4,5,6},{7,8,9}};
	
	System.out.println("elements in rows and columns:"+a.length);
	
    for(int i=0;i<a.length;i++)//row elements
    {
    	for(int j=0;j<a[i].length;j++)//column elements
    	{
    		System.out.print(a[i][j]+"\t");
    	}
    	System.out.println();
    }
    
    
    System.out.println("sum of all array elements is:");
    int sum=0;
    for(int i=0;i<a.length;i++)
    {
    	for(int j=0;j<a[i].length;j++)
    	{
    		sum=sum+a[i][j];
    	}
    }
    System.out.println(sum);
    
    
    
    System.out.println("sum of major diagonal elements:");
    int sum1=0;
    for(int i=0;i<a.length;i++)
    {
    	for(int j=0;j<a[i].length;j++)
    	{
    		if(i==j)
    		{
    			sum1=sum1+a[i][j];
    		}
    	}
    }
    System.out.println(sum1);
    
    
    System.out.println("sum of upper triangular elements:");
    int sum2=0;
    for(int i=0;i<a.length;i++)
    {
    	for(int j=0;j<a[i].length;j++)
    	{
    		if(i<j)
    		{
    			sum2=sum2+a[i][j];
    		}
    	}
    }
    System.out.println(sum2);
    
    
    System.out.println("sum of lower triangular elements:");
    int sum3=0;
    for(int i=0;i<a.length;i++)
    {
    	for(int j=0;j<a[i].length;j++)
    	{
    		if(i>j)
    		{
    			sum3=sum3+a[i][j];
    		}
    	}
    }
    System.out.println(sum3);
    
    
    
    for(int i=0;i<a.length;i++)
    {
        int sum4=0;
    	for(int j=0;j<a[i].length;j++)
    	{
    		sum4=sum4+a[i][j];
    	}
        System.out.println("addition of row elements:"+sum4);
    }
	}	
}
	

   