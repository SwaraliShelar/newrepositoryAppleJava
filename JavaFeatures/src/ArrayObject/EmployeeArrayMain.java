package ArrayObject;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeArrayMain
{

	public static void main(String[] args)
	{
		
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size:");
    int size=sc.nextInt();
    Employee emp[]=new Employee[size];
    
    for(int i=0;i<size;i++)
    {
    	System.out.println("Enter Employee Id,salary,name,dept:");
    	int id=sc.nextInt();
    	int salary=sc.nextInt();
    	String name=sc.next();
    	String dept=sc.next();
    	
    	 emp[i]=new Employee(id,salary,name,dept);//using constructor
    
    }
  for(Employee e:emp)
  {
	  if(e.dept=="hr")
	  {
		  e.hike();
		  System.out.println(e);
	  }
	  else if(e.salary>60000)
	  {
		  System.out.println(e);
	  }
  }
}
}
