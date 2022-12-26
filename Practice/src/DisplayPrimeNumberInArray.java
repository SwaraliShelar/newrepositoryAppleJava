import java.util.Scanner;

public class DisplayPrimeNumberInArray
{
public static void main(String[] args) 
{
	int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
	
	
	for(int i=0;i<a.length;i++)
	{
		int mid=a[i]/2;//mid=12
		int j;
		for(j=2;j<=mid;j++)//2<12
		{
			if(a[i]%j==0)
			break;
		}//not prime number
		if(j>mid)//
		{
			System.out.print(a[i]+" ");
		}
	}
	
}
}
