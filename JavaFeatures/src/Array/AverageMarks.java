package Array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageMarks {
void average(int arr[])
{
	int length=arr.length;
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("total marks:"+sum);
	int average=sum/length;
	System.out.println("average:"+average);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter array size:");
		   int size=sc.nextInt();
		   int arr[]=new int [size];
		   System.out.println("Enter marks:");
		   for(int i=0;i<arr.length;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
		   System.out.println(Arrays.toString(arr));
		   AverageMarks al=new AverageMarks();
		   al.average(arr);
}

}
