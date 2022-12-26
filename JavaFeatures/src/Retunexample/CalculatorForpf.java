package Retunexample;

import java.util.Scanner;

public class CalculatorForpf {
void pfcalculator(int salary)
{
	int totalsalary=salary*15/100;
	System.out.println("total salary is:"+totalsalary);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a salary:");
	int a=sc.nextInt();//u can use salary and a also for taking the values from user
	CalculatorForpf c=new CalculatorForpf();
	c.pfcalculator(a);
}
}
