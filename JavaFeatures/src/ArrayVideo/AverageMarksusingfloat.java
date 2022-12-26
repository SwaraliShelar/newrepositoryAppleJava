package ArrayVideo;

import java.util.Arrays;
import java.util.Scanner;

public class AverageMarksusingfloat {
void average(float arr[])
{
	float length=arr.length;
	float sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("total marks:"+sum);
	float average=sum/length;
	System.out.println("average:"+average);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter array size:");
		  int size=sc.nextInt();
		  float arr[]=new float[size];
		   System.out.println("Enter marks:");
		   for(int i=0;i<arr.length;i++)
		   {
			   arr[i]=sc.nextFloat();
		   }
		   System.out.println(Arrays.toString(arr));
		   AverageMarksusingfloat al=new AverageMarksusingfloat();
		   al.average(arr);
}

}
