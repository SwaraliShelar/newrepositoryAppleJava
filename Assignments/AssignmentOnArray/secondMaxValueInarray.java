package AssignmentOnArray;

import java.util.Arrays;

//1. WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90] 
public class secondMaxValueInarray
{
	public static void main(String[] args)
	{
    int a[]= {20, 0, 31, 45, 100, 1, 105, 90};
    System.out.print("Array before swapping of elements:"+Arrays.toString(a));
   
    for(int i=0;i<a.length;i++)
    {
    	for(int j=0;j<a.length-1;j++)
    	{
    		if(a[j]>a[j+1])
    		{
    			int temp=a[j];
    			a[j]=a[j+1];
    			a[j+1]=temp;
    		}
    	}
    }
    System.out.print("\nArray after swapping of elements:"+Arrays.toString(a));
    System.out.println("\nsecond max value in an array :"+a[a.length-2]);
	}
}
