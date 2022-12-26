package AssignmentOnArray;

import java.util.Arrays;
/*13. WAP to replace all negative value with its immediate left elements square. Means 
arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].
 */
public class NegatvValReplaceBySquaOfNext
{

	public static void main(String[] args) 
	{
    int a[]= {12, 3, -19, 29, 5, -61, 44, 7, -9 };
	System.out.println(Arrays.toString(a));
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]<0)
    	{
    		a[i]=a[i-1]*a[i-1];//replace the negative value with next number square
    	}
    }
    System.out.println(Arrays.toString(a));
	}

}
