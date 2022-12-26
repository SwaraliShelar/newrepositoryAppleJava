package AssignmentOnArray;

import java.util.Arrays;

/*6. Write a Java program to find the duplicate values of an array of integer values. 
Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78.
 */
public class DuplicateValueInArray
{
//
	public static void main(String[] args) 
	{
    int a[]= {3, 10, 90, 78, 56, 10, 78, 34, 61};
    System.out.println(Arrays.toString(a));
  
    for(int i=0;i<a.length;i++)
    {
    	for(int j=i+1;j<a.length;j++)//j=1       j=2       j=3      j=4       j=5       j=6     j=7    j=8
    	{
    		if(a[i]==a[j])         //3==10     10==10     10==90   90==78    78==56   56==10   10==78
    		{
    		System.out.println(a[j]);      //10                                                      
    		}
    	}
    }
	}
}
