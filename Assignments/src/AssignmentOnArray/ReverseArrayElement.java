package AssignmentOnArray;

import java.util.Arrays;

/*3. WAP to print the array in reverse order.
E.g. arr[] = [3, 90, 45, 29, 37, 78] so your output must be 78, 37, 29, 45, 90, 3*/
public class ReverseArrayElement
{

	public static void main(String[] args) 
	{
    int a[]= {3, 90, 45, 29, 37, 78};
    System.out.println(Arrays.toString(a));
    for(int i=a.length-1;i>=0;i--)
    {
    	System.out.print(a[i]+" ");
    }
	}

}
