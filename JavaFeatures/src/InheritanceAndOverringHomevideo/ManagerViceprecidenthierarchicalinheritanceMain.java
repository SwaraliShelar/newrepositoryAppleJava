package InheritanceAndOverringHomevideo;

import java.util.Scanner;

public class ManagerViceprecidenthierarchicalinheritanceMain 
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
    vp.displayvicePrecidentDetails();
    
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
    m1.displayManagerDetails();
}
}
