package Encapsulation;

import java.util.Scanner;

public class Emp5ForMain {
public static void main(String[] args) {
	Employee emp1=new Employee();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int num=sc.nextInt();
	
	for(int i=1;i<=num;i++)
	{
	System.out.println("enter a details for employee:"+i+"\n");
	System.out.println("enter employee id:");
	int id=sc.nextInt();
	emp1.setId(id);
	System.out.println("enter employee salary:");
	int salary=sc.nextInt();
	emp1.setSalary(salary);
	System.out.println("enter employee name:");
	String name=sc.next();
	emp1.setName(name);
	System.out.println("enter employee dept:");
	String dept=sc.next();
	emp1.setDept(dept);
	System.out.println("enter employee contact number:");
	String contact=sc.next();
	emp1.setContact(contact);
	System.out.println("employee id:"+emp1.getId()+"\n"+"employee salary:"+emp1.getSalary()+"\n"+"employee name:"+emp1.getName()+"\n"+"employee department:"+emp1.getDept()+"\n"+"employee contact number:"+emp1.getContact());
	}
	
	
	//System.out.println("employee id:"+emp2.getId()+"\n"+"employee salary:"+emp2.getSalary()+"\n"+"employee name:"+emp2.getName()+"\n"+"employee department:"+emp2.getDept()+"\n"+"employee contact number:"+emp2.getContact());
	//System.out.println("employee id:"+emp3.getId()+"\n"+"employee salary:"+emp3.getSalary()+"\n"+"employee name:"+emp3.getName()+"\n"+"employee department:"+emp3.getDept()+"\n"+"employee contact number:"+emp3.getContact());
	//System.out.println("employee id:"+emp4.getId()+"\n"+"employee salary:"+emp4.getSalary()+"\n"+"employee name:"+emp4.getName()+"\n"+"employee department:"+emp4.getDept()+"\n"+"employee contact number:"+emp4.getContact());
	//System.out.println("employee id:"+emp5.getId()+"\n"+"employee salary:"+emp5.getSalary()+"\n"+"employee name:"+emp5.getName()+"\n"+"employee department:"+emp5.getDept()+"\n"+"employee contact number:"+emp5.getContact());

}
}
