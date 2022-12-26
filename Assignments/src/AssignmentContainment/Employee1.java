/*4. Create Employee class which has attributes(id, name, salary, dept, 
mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
And mydate has (day, month, year).
Display Employee information.
Note. Containment using constructor and getter/setter
 */

package AssignmentContainment;

public class Employee1 {
	private int id;
	private String name;
	private float salary; 
	Dept1 d1; 
	Mydate1 m1;
	Employee1(int id,String name,float salary,Dept1 d1,Mydate1 m1)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.d1=d1;
		this.m1=m1;
	}
	public String toString()
	{
		return "Employee Id:"+id+"\nEmployee name:"+name+"\nEmployee Salary:"+salary+"\n"+d1+"\n"+m1;
	}
}
