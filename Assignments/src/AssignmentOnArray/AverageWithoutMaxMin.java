package AssignmentOnArray;

import java.util.Arrays;

/*11. WAP to calculate average of all elements in an Array except max and min element 
(Means don’t include the highest and lowest number of your array in your average).*/

public class AverageWithoutMaxMin 
{
void average(int a[])
{
	int sum=0;
	for(int i=1;i<a.length-1;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("Sum of all elements without maximum and minimun of array:"+sum);
	int average=sum/7;
	System.out.println("average of all elements in an Array except max and min element:"+average);
}
	public static void main(String[] args)
	{
    int a[]= {50,70,86,40,80,88,78,65,99};
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
	System.out.println(Arrays.toString(a));
	System.out.println("maximum value in array is:"+a[a.length-1]);
	System.out.println("minimum value in array is:"+a[0]);
	AverageWithoutMaxMin  am=new AverageWithoutMaxMin ();
	am.average(a);
	}

}
