package ClassesAndObjects;

import java.util.Scanner;

public class employeewithoupara {
	int id;
	String name, dept;
	int salary;
	char rating;
	float bonus,pf;

	void EmpDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee details:\nid,name,dept,salary and rating(a/b/c/d)");
		id = sc.nextInt();
		name = sc.next();
		dept = sc.next();
		salary = sc.nextInt();
		rating = sc.next().charAt(0);
	}

	void bonus() {
		System.out.println("original salary:" + salary);
		if (rating == 'a')
		{
			bonus = (salary * 0.20f);
		}
		else if (rating == 'b')
		{
			bonus = (salary * 0.15f);
		}
		else if (rating == 'c')
		{
			bonus = (salary * 0.10f);
		}
		else
		{
			bonus=salary;
		}
		System.out.println("salary after adding bonus:" + bonus);
	}

	void pfcalculation()
	{
		pf= salary * 0.10f;
    }

	public String toString() {
		return " id:" + id + "\n" + "name:" + name + "\n" + "salary:"+salary+"\n"+"bonus:"+bonus+"\n"+"pf:"+pf;
	}

	public static void main(String[] args) {
		employeewithoupara ewp = new employeewithoupara();
		ewp.EmpDetails();
		ewp.bonus();
		ewp.pfcalculation();
		System.out.println(ewp);

	}
}
