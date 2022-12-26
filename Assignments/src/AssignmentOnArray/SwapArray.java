package AssignmentOnArray;

import java.util.Arrays;

//8. WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9,0, 2, 4] 
public class SwapArray 
{
 
	public static void main(String[] args)
	{
    int a[]= {2,4,9,0};
    int n=a.length;
    int mid=n/2;
    System.out.println(Arrays.toString(a));
    for(int i=0;i<mid;i++)
    {
        	int temp=a[i];
        	a[i]=a[mid+i];
        	a[mid+i]=temp;		 
    }
    System.out.println(Arrays.toString(a));
	}

}
