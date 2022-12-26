/*2. Create Employee class which has attributes (id, name, salary, dept, mydate)
Where dept and mydate is class, dept has (dept_id, dept_name) And
mydate has (day, month, year) Display Employee information
(Note - Containment using constructor and getter/setter).
 */
package AssignmentNo5;

public class Employee
{
	int id;
	String name;
	float salary; 
	Dept d;
	Mdate m;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setDept(Dept d)
	{
		this.d=d;
	}
	public Dept getDept()
	{
		return d;
	}
	public void setMdate(Mdate m)
	{
		this.m=m;
	}
	public Mdate getMdate()
	{
		return m;
	}
  /* public String toString()
	{
		return "Employee Id:"+id+"\nEmployee name:"+name+"\nEmployee Salary:"+salary;	
	}*/

}
