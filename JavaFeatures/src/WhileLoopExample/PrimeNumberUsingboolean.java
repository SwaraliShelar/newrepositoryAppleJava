package WhileLoopExample;

import java.util.Scanner;

public class PrimeNumberUsingboolean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int i = 2;
		boolean flag = true;

		while (i <num) {      //2<7       3<7     4 <7     5<7       6<7    7<7
			if (num % i == 0) //7%2!=0    7%3!=0   7%4!=0  7%5!=0   7%6!=0  7%7!=0
			{//condition for non prime number
				flag = false;//flase     false     false    false   false  true
				break;     //lop stop, and i is increamented
			}
			i++;            // i=2       i=3        i=4      i=5     i=6     i=7
			
		}
			if (flag == false)
				System.out.println("not prime");
			else
				System.out.println("prime");

		}
	}
