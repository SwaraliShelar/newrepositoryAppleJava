package DynamicMethoDispatchOverridingExample;

import java.util.Scanner;

public class ManagerViceprecidentOverridindwithUpcastingMain 
{
public static void main(String[] args) {
	VicePrecident vp=new VicePrecident();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employee name:");
	String name=sc.nextLine();
	System.out.println("Enter employee id:");
	int id=sc.nextInt();
	System.out.println("Enter employee salary:");
	float salary=sc.nextFloat();
	vp.acceptEmployeeDetails(name,id,salary);
    vp.setAllowance(500000.00f);
   // float sal=vp.calculateSalary();//autounboxing happend in wrapper class
  //  System.out.println("salary of viceprecident:"+sal);
   // vp.displayvicePrecidentDetails();
    
    Manager m1=new Manager();
    System.out.println("Enter employee name:");
    name=sc.nextLine();
	sc.nextLine();
    System.out.println("Enter employee id:");
    id=sc.nextInt();
    System.out.println("Enter employee salary:");
    salary=sc.nextFloat();
    m1.acceptEmployeeDetails(name, id, salary);
    m1.setIncentive(1000.000f);
  //  m1.displayManagerDetails();
   // System.out.println("salary of manager:"+sal);
   //upcasting is used to achieve dynamic polymorphism
    Employee e= new Employee();
    //but we already created Viceprecident and manager object in above example
   // Employee e= new VicePrecident(); 
    // Employee e= new Manager(); 
    //thas why
    e=vp;
    System.out.println("salary of vice precident is:"+e.calculateSalary());
    
    e=m1;
    System.out.println("salary of manager is:"+e.calculateSalary());

}
}
