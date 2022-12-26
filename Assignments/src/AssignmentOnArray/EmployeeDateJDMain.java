package AssignmentOnArray;

import java.util.Scanner;

public class EmployeeDateJDMain
{
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	EmployeeJD emp[]=new EmployeeJD[1];
	System.out.println("enter details about employee:");
	for(int i=0;i<emp.length;i++)
	{
		System.out.println("Enter employee id,salary,name:");
		int eid=sc.nextInt();
		int esal=sc.nextInt();
		String enm=sc.next();
		
		DateJD da[]=new DateJD[1];
		for(int j=0;j<da.length;j++)
		{
			System.out.println("Enter Joinging day,month,year:");
			String dy=sc.next();
			int mon=sc.nextInt();
			int ye=sc.nextInt();
			
			DateJD d=new DateJD();
			
			d.setDay(dy);
			d.setMonth(mon);
			d.setYear(ye);
			
			da[j]=d;	
		}
		EmployeeJD e=new EmployeeJD();
		e.setId(eid);
		e.setSalary(esal);
		e.setName(enm);
		
		emp[i]=e;
		e.setDateJD(da);
	}
	for(EmployeeJD e:emp)
	{
		for(DateJD d:e.d)
		{
			System.out.println(d);
		}
		System.out.println(e);
	}
}
}
