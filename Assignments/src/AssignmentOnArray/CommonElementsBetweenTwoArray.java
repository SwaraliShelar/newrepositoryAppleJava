package AssignmentOnArray;

import java.util.Arrays;

/*7. Write a Java program to find the common elements between two arrays (int values) 
Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and arr2[] = [39, 25, 15, 23, 55, 91, 
66, 22], so common between two arrays are 23 and 91  */
public class CommonElementsBetweenTwoArray 
{

	public static void main(String[] args) 
	{
	int a1[] = {12, 23, 34, 67 ,78, 91, 56}; 
	int	a2[] = {39, 25, 15, 23, 55, 91, 66, 22};
	System.out.println(Arrays.toString(a1));
	System.out.println(Arrays.toString(a2));

	for(int i=0;i<a1.length;i++)
	{
		for(int j=0;j<a2.length;j++)
		{
			if(a1[i]==a2[j])
			{
			System.out.print("\ncommon elements between two array:"+a1[i]);
			}
		}
	}
	}
}