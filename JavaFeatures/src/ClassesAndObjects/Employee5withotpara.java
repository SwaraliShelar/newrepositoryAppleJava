package ClassesAndObjects;

import java.util.Scanner;

public class Employee5withotpara {
	int id;
	String name;String dept;
	int salary;long contact;String email;
	
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter employee id:");
		id=sc.nextInt();
		System.out.println("enter a employee name:");
		name=sc.next();
		System.out.println("enter a employee dept:");
	    dept=sc.next();	
		System.out.println("Enter employee salary:");
		salary=sc.nextInt();
		System.out.println("Enter employee contact no:");//write l at end of number
		contact=sc.nextLong();
		System.out.println("Enter employee email:");
		email=sc.next();
	}
	void showData()
	{
		System.out.println(id+" "+name+" "+dept+" "+salary+" "+contact+" "+email);
	}
	public static void main(String[] args) {
		
		Employee5withotpara em1=new Employee5withotpara();
		em1.setData();
		
		Employee5withotpara em2=new Employee5withotpara();
		em2.setData();
		
		Employee5withotpara em3=new Employee5withotpara();
		em3.setData();
		
		Employee5withotpara em4=new Employee5withotpara();
		em4.setData();
		
		Employee5withotpara em5=new Employee5withotpara();
		em5.setData();
		
		System.out.println( );
		em1.showData();
		em2.showData();
		em3.showData();
		em4.showData();
		em5.showData();
	}
}
