/*18.	WAP to check given no is automorphic or not

   input n=25
  output Automorphic
as   5*5=25 6*6=36  25*25=625 76=5776 */

		
package WhileLoopExample;

import java.util.Scanner;

public class AutomorphicNum2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int temp = num;
		int lastdigit=0;


		while (num > 0) 
		{	
			int square =num*num;
           lastdigit=square%10;
			num = num / 10;
		}

		if (temp==lastdigit)

			System.out.println("automorphic number");
		else
			
			System.out.println("not automorphic number");

}
}