package AssignmentOnArray;

import java.util.Arrays;

/*12. WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78, 
54, 34, 10, 0, 34] */
public class Replac0By1
{
public static void main(String[] args) 
{
	int a[]= {26, 0, 67, 45, 0, 78,54, 34, 10, 0, 34}; 
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==0)
		{
			System.out.print(1+" ");
		}
		else
		{
			System.out.print(a[i]+" ");
		}
	}			
}
}

