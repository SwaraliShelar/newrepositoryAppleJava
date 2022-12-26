package ClassesAndObjects;

import java.util.Scanner;

public class EmployeeFor {
	int id;
	String name;String dept;
	int salary;long contact;String email;
	void setData(int i,String n,String d,int s,long  c,String e)
	{
		id=i;
		name=n;
		dept=d;
		salary=s;
		contact=c;//write l at end of number
		email=e;
	}
	void showdata()
	{
		System.out.println(id+" "+name+" "+dept+" "+salary+" "+contact+" "+email);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeFor e1=new EmployeeFor();
		int num;
		System.out.println("Enter number of employee: ");
		num=sc.nextInt();
		//you can print multiple values by using for loop but you cannot contain multiple objects
		for(int i=1;i<=num;i++)
		{
		System.out.println("enter information for employee:"+i+"\n");
		
		System.out.println("Enter employee id:");
		int eid=sc.nextInt();
		System.out.println("enter a employee name:");
		String ename=sc.next();
		System.out.println("enter a employee dept:");
		String edept=sc.next();	
		System.out.println("Enter employee salary:");
		int esalary=sc.nextInt();
		System.out.println("Enter employee contact no:");
		long  econt=sc.nextLong();
		System.out.println("Enter employee email:");
		String eemail=sc.next();
		
		e1.setData(eid, ename, edept, esalary, econt, edept);
		e1.showdata();
		}
		
		
	}
	
}
