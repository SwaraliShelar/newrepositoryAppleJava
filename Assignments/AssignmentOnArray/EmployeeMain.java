package AssignmentOnArray;

import java.util.Scanner;

public  class EmployeeMain
{
	 public static void main(String[] args)
	 {
		
		Scanner sc= new Scanner(System.in);
		 int size=sc.nextInt();
		Employee emp[]=new Employee[size];
		System.out.println("Enter the details for "+ size +" employee:");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("enter employee id ,salary,name:");
			Employee e=new Employee();

			int id=sc.nextInt();
			int salary=sc.nextInt();
			String name=sc.next();
			e.setId(id);
			e.setSalary(salary);
			e.setName(name);
			
			emp[i]=e;      
		}
		for(Employee e:emp)
		{
			System.out.println(e);
		}
	}
}