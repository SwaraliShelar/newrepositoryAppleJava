package HomeVideoPrograms;

import java.util.Scanner;

public class Calulator {
public static void main(String[] args) {
	System.out.println("---------Menu----------");
	System.out.println("\n1.add\n2.sub\n3.mul\n4.div\n---------------");
	Scanner sc=new Scanner(System.in);
	
	System.out.println("which operation do you wnt yo perform:");
	int operation=sc.nextInt();
	System.out.println("enter two numbers:");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	
switch (operation)
{
case 1:
	System.out.println("addition is:"+(num1+num2));
	break;
case 2:
	System.out.println("Substration is:"+(num1-num2));
	break;
case 3:
	System.out.println("multiplication is:"+(num1*num2));
	break;
case 4:
	System.out.println("division is:"+(num1/num2));
	break;
}
}
}
