/*
1.Create one class Employee (emp_id, name, sal) with private 
 access specifier and create getter and setter.
 Create 2 objects One  by default  constructor and then set data using setters
Create second object by parameterized constructor.
Call display on both objects

 */
package WrittenTest5;
public class Employee {
	private int id;
	private String name;
	private float salary;

	Employee()
	{
		System.out.println("This is Default Constructor");
	}
	Employee(int id,String name,float salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("This is Parameterized Constructor");
	}
	
	void display()
	{
		System.out.println("Id:"+id+"\nName:"+ name+"\nSalary:"+ salary);
	}

public void setId(int id)
{
	this.id=id;
}
public int getId()
{
	return id;
}
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public void setSalary(float salary)
{
	this.salary=salary;
}
public float getSalary()
{
	return salary;
}

}
