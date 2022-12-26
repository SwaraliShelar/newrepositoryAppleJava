package HomeWork;

import java.util.Scanner;

public class PalindromFrom1toN {
		public static void main(String[] args)
		{
			int num, r;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Palindrome No ln:");
			int ln = sc.nextInt();//last limit
			System.out.print("Palindrome numbers from 1 to ln:");
			for (int i = 1; i <= ln; i++)
			{
				num = i;
				int rev=0;
				while (num > 0)
				{
					r = num % 10;
					rev = rev * 10 + r;
					num = num / 10;
				}
				if (rev == i)
				{
					System.out.print(i + " ");
				}
				
			}
		}
	 
	}