package AssignmentNo7;

import java.util.Scanner;

public class ArrayInReverseOrder 
{
	void reverse(int a[])
	{
		System.out.println("\nArray elements in reverse order:");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a size:");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter a "+size+" integer elements in array:");
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();

	}
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	ArrayInReverseOrder  ro=new ArrayInReverseOrder ();
	ro.reverse(arr);
}
}
