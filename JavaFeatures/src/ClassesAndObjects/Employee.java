package ClassesAndObjects;

import java.util.Scanner;

public class Employee {
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
	Employee e1=new Employee();
	System.out.println("Enter employee id:");
	int eid=sc.nextInt();
	System.out.println("enter a employee name:");
	String ename=sc.next();
	System.out.println("enter a employee dept:");
	String edept=sc.next();	
	System.out.println("Enter employee salary:");
	int esalary=sc.nextInt();
	System.out.println("Enter employee contact no");
	long  econt=sc.nextLong();
	System.out.println("Enter employee email:");
	String eemail=sc.next();
	e1.setData(eid, ename, edept, esalary, econt, edept);
	
	Employee e2=new Employee();
	System.out.println("Enter employee id:");
	eid=sc.nextInt();
	System.out.println("enter a employee name:");
    ename=sc.next();
	System.out.println("enter a employee dept:");
	edept=sc.next();	
	System.out.println("Enter employee salary:");
    esalary=sc.nextInt();
	System.out.println("Enter employee contact no");
	econt=sc.nextLong();
	System.out.println("Enter employee email:");
	eemail=sc.next();
	e2.setData(eid, ename, edept, esalary, econt, edept);
	
	Employee e3=new Employee();System.out.println("Enter employee id:");
	eid=sc.nextInt();
	System.out.println("enter a employee name:");
    ename=sc.next();
	System.out.println("enter a employee dept:");
	edept=sc.next();	
	System.out.println("Enter employee salary:");
    esalary=sc.nextInt();
	System.out.println("Enter employee contact no");
	econt=sc.nextLong();
	System.out.println("Enter employee email:");
	eemail=sc.next();
	e3.setData(eid, ename, edept, esalary, econt, edept);
	
	Employee e4=new Employee();
	System.out.println("Enter employee id:");
	eid=sc.nextInt();
	System.out.println("enter a employee name:");
    ename=sc.next();
	System.out.println("enter a employee dept:");
	edept=sc.next();	
	System.out.println("Enter employee salary:");
    esalary=sc.nextInt();
	System.out.println("Enter employee contact no");
	econt=sc.nextLong();
	System.out.println("Enter employee email:");
	eemail=sc.next();
	e4.setData(eid, ename, edept, esalary, econt, edept);
	
	Employee e5=new Employee();
	System.out.println("Enter employee id:");
	eid=sc.nextInt();
	System.out.println("enter a employee name:");
    ename=sc.next();
	System.out.println("enter a employee dept:");
	edept=sc.next();	
	System.out.println("Enter employee salary:");
    esalary=sc.nextInt();
	System.out.println("Enter employee contact no");
	econt=sc.nextLong();
	System.out.println("Enter employee email:");
	eemail=sc.next();
e5.setData(eid, ename, edept, esalary, econt, edept);
	
e1.showdata();
e2.showdata();
e3.showdata();
e4.showdata();
e5.showdata();


}
}