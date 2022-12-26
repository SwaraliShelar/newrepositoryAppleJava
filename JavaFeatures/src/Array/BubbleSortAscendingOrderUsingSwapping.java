package Array;

import java.util.Arrays;
//for ascending order then use greater than (>) and compare 
//for descending order then use greater than (<)

public class BubbleSortAscendingOrderUsingSwapping 
{
	public static void main(String[] args)
	{
    int a[]= {10,50,30,20,40,60,9,8};
	System.out.println(Arrays.toString(a));
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
    	//System.out.println(Arrays.toString(a)); its display output in details
    }
	System.out.println(Arrays.toString(a));
	System.out.println("first maximum value:"+a[a.length-1]);
	System.out.println("second maximum value:"+a[a.length-2]);
	
	System.out.println();
	
	System.out.println("first minimum value:"+a[0]);
	System.out.println("second minimumvalue:"+a[1]);
	System.out.println("");
	}
}
/*Swapping kartana aapn last chya number la gelo tr tyala konashi swap karnar na
 Mg tyachya agothar chya position la gelyavr tya number shi aapan last cha element swap karato
 Mahnje aaplyala pudh jayalach lagat nahi
 At the a. Length-1 ya position lach sagal swapping hota na thts why j<a.length-1
     	for(int j=0;j<a.length-1;j++)
 */