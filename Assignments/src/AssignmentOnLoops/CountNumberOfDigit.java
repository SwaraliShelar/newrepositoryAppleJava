//8. Write a program to count number of digits in any number
package AssignmentOnLoops;

import java.util.Scanner;

public class CountNumberOfDigit {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int cnt = 0, num;
		System.out.println("Enter a number:");
		num = Sc.nextInt();//12345
		
		 for (; num != 0; num /= 10, ++cnt) 
		 {
		    }

		/*while (num > 0) {//12345>0
			cnt++;
			num = num / 10;//num=12345/10=1234  num=1234/10=123 num=123/10=12 num=12/10=1 num=1/10=0
		}*/
		System.out.println("count number of digits in any number is " + cnt);
	}

}
