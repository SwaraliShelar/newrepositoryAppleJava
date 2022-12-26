package AssignmentNo7;

import java.util.Scanner;

/*4. Take 20 integer inputs from user and print the following: 
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.*/
public class NumberIsPosiNegaOddEvenZero {

	void findNumber(int a[]) 
	{
		int x,p=0,n=0,e=0,o=0,z=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<0)
				n++;
			else
				p++;
			
			
			x=a[i]%2;
			if(x==0)
				e++;
			else
				o++;
			
			
			if(a[i]==0)
				z++;
		}
		System.out.print("\npositive numbers are:"+p);
		System.out.print("\nnegative numbers are:"+n);
		System.out.print("\neven numbers are:" +e);
		System.out.print("\nodd numbers are:" +o);
		System.out.print("\nzero number:"+z);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter a "+size+" integer elements in array:");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		NumberIsPosiNegaOddEvenZero n= new NumberIsPosiNegaOddEvenZero();
		n.findNumber(arr);
	}

}
