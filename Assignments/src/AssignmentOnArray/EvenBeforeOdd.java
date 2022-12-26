package AssignmentOnArray;

import java.util.Arrays;

public class EvenBeforeOdd 
{
public static void main(String[] args) {
	

	int a[]= {44, 55, 63, 70, 78, 80, 33, 88, 99};
	System.out.println("Original Array:"+Arrays.toString(a));
	for(int i=0;i<a.length-1;i++)
	{
		if(a[i]%2==0)
		{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]%2!=0)
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
  }
	System.out.println("new Array:"+Arrays.toString(a));
}
}
