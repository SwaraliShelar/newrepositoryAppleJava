/*2. Create Employee class which has attributes 
(id, name, salary, dept, mydate)
Where dept and mydate is class, dept has (dept_id, dept_name) And
mydate has (day, month, year) Display Employee information
(Note - Containment using constructor and getter/setter).
 */
package Assignment5ByConstructor;

public class Employee
{
	int id;
	String name;
	float salary; 
	Dept d;
	Mdate m;
	//using constructor
	Employee(int id,String name,float salary,Dept d,Mdate m)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.d=d;
		this.m=m;
	}
  
   public String toString()
	{
		return "Employee Id:"+id+"\nEmployee name:"+name+"\nEmployee Salary:"+salary+"\nDept:\n"+d+"\nMdate:\n"+m;	
	}

}
