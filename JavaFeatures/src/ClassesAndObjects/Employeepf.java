package ClassesAndObjects;

import java.util.Scanner;

public class Employeepf {
	int id;
	String name,dept;
	long contno;
	int salary ;
	char rating;
	void empDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  the id,name,dept,contno,salary and rating(a/b/c/d) of the employee:");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		contno=sc.nextLong();//write l at end of number
		salary=sc.nextInt();
		rating=sc.next().charAt(0);
	}
	float bonus()
	{
		float newsalary;
		System.out.println("original salary:"+salary);
		
		if(rating=='a')
		{
			newsalary=salary*0.15f;
		}
		else if(rating=='b')
		{
			newsalary=salary*0.10f;
		}
		else if(rating=='c')
		{
			newsalary=salary*0.5f;
		}
		else
		{
			newsalary=salary;
		}
		System.out.println("salary after adding a bonus:"+newsalary);
		return newsalary;//variable name
	}
	float pfcalculator()
	{
		float pfsalary=salary*0.10f;
		return pfsalary;//variable name
	//	System.out.println("pfsalary is:"+pfsalary);
	}
	
	void display(float bonus,float pfsalary)
	{
		System.out.println("Name:"+name);
    	System.out.println("Salary : "+salary);
    	System.out.println("Bonus is: "+bonus);
    	System.out.println("Pf :"+pfsalary);
    }
	
public static void main(String[] args)
{
	Employeepf empf=new Employeepf();
	empf.empDetails();
	float tbonus=empf.bonus();//da_type new_varinm=ob_name.method_nm();
	float tpfcalculator=empf.pfcalculator();//da_type new_varinm=ob_name.method_nm();
	empf.display(tbonus,tpfcalculator);
}
}
