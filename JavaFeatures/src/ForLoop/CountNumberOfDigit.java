//8. Write a program to count number of digits in any number
package ForLoop;

import java.util.Scanner;

public class CountNumberOfDigit {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int cnt = 0, num;
		System.out.println("Enter a number:");
		num = Sc.nextInt();//12345
		
		 for (; num != 0; num /= 10, ++cnt) {
		    }
		/*In this program, instead of using a while loop, we use a for loop without any body.
		 On each iteration, the value of num is divided by 10 and count is incremented by 1.
		 The for loop exits when num != 0 is false, i.e. num = 0.*/
		
		/*while (num > 0) {//12345>0
			cnt++;
			num = num / 10;//num=12345/10=1234  num=1234/10=123 num=123/10=12 num=12/10=1 num=1/10=0
		}*/
		System.out.println("count number of digits in any number is " + cnt);
	}

}
