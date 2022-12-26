/*18.	WAP to check given no is automorphic or not

   input n=25
  output Automorphic
as 25*25=625  5*5=25 6*6=36  */

package AssignmentOnLoops;

import java.util.Scanner;

public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int temp = num;
		int cnt=0;
		int square =num*num;

        //countint digits of num

		while (num > 0) 
		{	
            cnt++;
			num = num / 10;
		}
        int lastSquareDigits = (int) (square%(Math.pow(10,cnt)));

		if (temp==lastSquareDigits)

			System.out.println("automorphic number");
		else
			
			System.out.println("not automorphic number");
	}

}
