package AssignmentOnArray;

import java.util.Arrays;

/*15. WAP to arrange the elements of an given array of integers where all negative 
integers appear before all the positive integers. 
 */
public class NegativeAppearBeforePositive
{
public static void main(String[] args) {
	int a[]= {10,20,-30,40,50,-60,70,-80,-90};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]>0)
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
}
}
