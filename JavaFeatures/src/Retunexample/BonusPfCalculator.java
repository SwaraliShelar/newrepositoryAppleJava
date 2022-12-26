package Retunexample;

import java.util.Scanner;

public class BonusPfCalculator {

	float bonus(int salary, char ch)// void bonus(int salary,char ch) error will occures because valueof datatype
									// is float nextFloat
	{
		float newsalary;
		System.out.println("original salary:" + salary);
		if (ch == 'A')
			newsalary = salary + (salary * 0.15f);
		else if (ch == 'B')
			newsalary = salary + (salary * 0.10f);
		else if (ch == 'C')
			newsalary = salary + (salary * 0.05f);
		else 
			newsalary = salary;
	
		System.out.println("salary after adding a bonus:" + newsalary);
		return newsalary;
		// when we return any value then datatype of that value is our method type
		// also(line no-4)
	}

	void pfCalculator(float salary) {
		float pf = salary * 0.10f;
		System.out.println("pf:" + pf);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the salary and ratings(A/B/C/D) of the employee:");
		int sal = sc.nextInt();
		char rate = sc.next().charAt(0);
		BonusPfCalculator bpc = new BonusPfCalculator();
		float newsalary = bpc.bonus(sal, rate);// return the value we have to store in newsalary
		bpc.pfCalculator(bpc.bonus(sal, rate));
	}
}
