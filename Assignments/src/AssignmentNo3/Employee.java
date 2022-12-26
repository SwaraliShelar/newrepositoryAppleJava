/*8. Create one class Employee (id , name, salary) with private access modifier 
and create getter and setter.
 */
package AssignmentNo3;

public class Employee {
//POJO CLASS
	private int id,salary;
	private String name,dept,contact;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setName(String name)
	{
		this.name=name;		
	}
	public String getName()
	{
		return name;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public String getDept()
	{
		return dept;
	}
	public void setContact(String contact)
	{
		this.contact=contact;
	}
	public String getContact()
	{
		return contact;
	}
	
}
