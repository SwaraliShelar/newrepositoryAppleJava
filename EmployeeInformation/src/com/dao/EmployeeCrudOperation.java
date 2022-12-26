package com.dao;
import java.util.Arrays;
import java.util.Scanner;

import com.pojo.Employee;

public class EmployeeCrudOperation
{
	Employee emp[]=new Employee[10];
	Scanner sc=new Scanner(System.in);
	public void mainArray()
	{
		for(int i=0;i<emp.length;i++)
		{
		System.out.println("enter employee id ,name,department salary:");
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		float salary=sc.nextFloat();
		
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		e.setDept(dept);
		e.setSalary(salary);
		
		emp[i]=e;
		}
    }
	public void displayEmployeeData()//details of all employees
	{
		System.out.println(Arrays.toString(emp));
	}
	
	public void addEmployee()
	{
		//Scanner sc=new Scanner (System.in);
	   System.out.println("for add employee enter employee id,name,department,salary:");
	   int eid=sc.nextInt();
	   String ename=sc.next();
	   String edept=sc.next();
	   float salary=sc.nextFloat();
	   
	   Employee e=new Employee();
	   e.setId(eid);
	   e.setName(ename);
	   e.setDept(edept);
	   e.setSalary(salary);
	   
	   for(int i=0;i<emp.length;i++)
	   {
		   if(emp[i]==null)
		   {
			   emp[i]=e;
			   break;//otherwise values goes to all null values
		   }
	   } 
	   System.out.println();
	}
	
	public void updateEmployee()
	{
		System.out.println("for updation of salary enter employee id and salary:");
		int id=sc.nextInt();
		float salary=sc.nextFloat();
		for(Employee e:emp)
		{
			if(e!=null)
			{
				if(e.getId()==id)
				{
					float hike=salary*0.15f;
					float newsalary=salary+hike;
					e.setSalary(newsalary);
				}
			}
		}
		System.out.println();
	}
	
	
	public void searchEmployee()
	{
		//Employee e=new Employee();
		System.out.println("for search a perticular employee details enter a id:");
		int id=sc.nextInt();
		for(Employee e:emp)
		{
			if(e!=null)
			{
				if(id==e.getId())
				{
					System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary());
				}
			}
		}
		System.out.println();
	}
	
	
	public void deleteEmployee()
	{
		Employee e[]=new Employee[emp.length];
		System.out.println("for deletion enter id to delete employee record:");
		int id=sc.nextInt();
		
        int index=0;
        for(int i=0;i<emp.length;i++)
        {
        	if(emp[i]!=null)
        	{
        		if(emp[i].getId()==id)
        		{
        			index=i;
        		}
        	}
        }
        int j=0;
        for(int i=0;i<emp.length;i++)
        {
        	if(i==index)
        	{
        		
        		continue;
        	}
        	else
        	{
        		e[j]=emp[i];
        		j++;
        	}
        }
        for(int i=0;i<emp.length;i++)
        {
        	emp[i]=e[i];
        }
System.out.println();
}
}


/*(for(int i=0;i<emp.length;i++)
{
Employee e1=new Employee();
e1.setId(1);
e1.setName("shweta");
e1.setDept("java developer");
e1.setSalary(50000);
emp[0]=e1;

Employee e2=new Employee();
e2.setId(2);
e2.setName("aditya");
e2.setDept("adviser");
e2.setSalary(600000);
emp[1]=e2;

Employee e3=new Employee();
e3.setId(3);
e3.setName("reshma");
e3.setDept("tester");
e3.setSalary(80000);
emp[2]=e3;

Employee e4=new Employee();
e4.setId(4);
e4.setName("reshma");
e4.setDept("tester");
e4.setSalary(80000);
emp[3]=e4;

Employee e5=new  Employee();
e5.setId(5);
e5.setName("swarali");
e5.setDept("finance");
e5.setSalary(458000);
emp[4]=e5;
}*/