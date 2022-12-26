// Write a Java program to find power of any number x ^ y.

package WhileLoopExample;

import java.util.Scanner;

public class PowerOfExponent {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i=1,r=1;
	System.out.println("Enter value of base and exponent :");
	int b=sc.nextInt();//5
	int e=sc.nextInt();//7
	
	
   /* finding power of base value by equiping exponent value */
   while(i<=e)// i<=e 1<=7 2<=7 3<=7 4<=7 5<=7 6<=7 7<=7
   {
	   r *= b;//r=r*b 1*5 1*5 1*5 1*5 1*5 1*5 1*5
	   i++;
   }
   System.out.println("r="+ b +"^"+ e +"="+r);
   sc.close();
}
}
