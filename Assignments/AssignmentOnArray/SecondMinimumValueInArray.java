package AssignmentOnArray;

import java.util.Arrays;

//2. WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23] 
public class SecondMinimumValueInArray
{

	public static void main(String[] args)
	{
    int a[]= {-20, 0, -25, 15, 19, 37, 23};
    System.out.println("Array before sorting :"+Arrays.toString(a));
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
    System.out.println("Array after sorting in ascending order:"+Arrays.toString(a));
    System.out.println("second minimum value in an array:"+a[1]);
	}

}
