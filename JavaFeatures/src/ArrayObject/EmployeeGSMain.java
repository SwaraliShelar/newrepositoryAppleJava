package ArrayObject;

import java.util.Scanner;

public class EmployeeGSMain {

	public static void main(String[] args)
	{	
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a size of array:");
    int size=sc.nextInt();
    EmployeeGS emp[]=new EmployeeGS[size];//how many time you want create a object of employee with values
    System.out.println("enter  a inforamation for "+size +" employees:");
    for(int i=0;i<emp.length;i++)
    {
        System.out.println("Enter a Employee id,salary,name,department:");
    	int id=sc.nextInt();
    	int salary=sc.nextInt();
    	String name=sc.next();
    	String dept=sc.next();
    	
    	EmployeeGS e=new EmployeeGS();
    	e.setId(id);
    	e.setSalary(salary);
    	e.setName(name);
    	e.setDept(dept);
    	
    	emp[i]=e;
    	 	
    }
    for(EmployeeGS e:emp)
    {
    	if(e.getDept().equalsIgnoreCase("hr"))
    	{
    		e.hike();
    		System.out.println(e);
    	}
    	else if(e.getSalary()>60000)
    	{
    	System.out.println(e);
    	}
    }
	}

}
