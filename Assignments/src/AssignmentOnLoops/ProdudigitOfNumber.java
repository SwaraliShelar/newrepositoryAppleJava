//9. Write a program to calculate product of digits of any number.
package AssignmentOnLoops;

import java.util.Scanner;

public class ProdudigitOfNumber {
public static void main(String[] args) {
	int product=1,num,r;
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter any number");//987
	num=Sc.nextInt();
	
	while(num!=0) //987
	{
		r=num%10;         //r=987%10=7         r=98%10=8     r=9%10=9
		product=product*r;//product=1*7=7    product=7*8=56  product=56*9=504
		num=num/10;      //num=987/10=98     num=98/10=9     num=9/10=0
	}System.out.println("product of digits of any number is : "+product);
}

}
