import java.util.Arrays;
import java.util.Scanner;

public class EmployeeCrudOperation
{
	Employee emp[]=new Employee[10];
	Scanner sc=new Scanner(System.in);
	public void mainArray()
	{
		
    Employee e0=new  Employee();
    e0.setId(1);
    e0.setName("swarali");
    e0.setDept("finance");
    e0.setSalary(458000);
    
    Employee e1=new Employee();
    e1.setId(2);
    e1.setName("shweta");
    e1.setDept("java developer");
    e1.setSalary(50000);
    
    Employee e2=new Employee();
    e2.setId(3);
    e2.setName("aditya");
    e2.setDept("adviser");
    e2.setSalary(600000);
    
    Employee e3=new Employee();
    e3.setId(4);
    e3.setName("reshma");
    e3.setDept("tester");
    e3.setSalary(80000);
    
    Employee e4=new Employee();
    e4.setId(5);
    e4.setName("reshma");
    e4.setDept("tester");
    e4.setSalary(80000);
   
}
	 
	public void addEmployee()
	{
		//Scanner sc=new Scanner (System.in);
	   System.out.println("enter employee id,name,department,salary:");
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
	
	
	
	public void displayEmployeeData()//details of all employees
	{
		System.out.println(Arrays.toString(emp));
	}
	public void updateEmployee()
	{
		System.out.println("enter employee id and salary:");
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
				}
			}
		}
		System.out.println();
	}
	
	
	public void searchEmployee()
	{
		System.out.println("enter a id:");
		int id=sc.nextInt();
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i]!=null)
			{
				if(emp[i].getId()==id)
				{
					System.out.println(Arrays.toString(emp));
				}
			}
		}
		System.out.println();
	}
	
	
	public void deleteEmployee()
	{
		Employee e[]=new Employee[emp.length];
		System.out.println("enter id to delete employee record:");
		int id=sc.nextInt();
        int index=0;
        for(int i=0;i<emp.length;i++)
        {
        	if(emp[i]!=null)
        	{
        		if(emp[i].getId()==id)
        		{
        			index=1;
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
        		emp[i]=e[j];
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