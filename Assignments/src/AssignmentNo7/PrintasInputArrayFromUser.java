package AssignmentNo7;
//1. Take 10 integer inputs from user and store them in an array and print them on screen.
import java.util.Scanner;

public class PrintasInputArrayFromUser {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter array size:");
		   int size=sc.nextInt();
		   int arr[]=new int [size];
		   System.out.println("Enter array elements:");
		   for(int i=0;i<arr.length;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
		   //for each loop enhance for each loop
		   for(int val : arr)
		   {
			   System.out.print(val+" ");
		   }
	}
}
