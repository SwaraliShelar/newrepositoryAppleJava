package ArrayObject;

import java.util.Arrays;

/*23. Create class Dept(did, dname), class MyDate(day, month, year) 
Class Employee(emp_id, emp_name, salary, date(object), dept(object)). Create array 
of Employee and display the array elements.
 */
public class Employee1 {
	int emp_id;
	String emp_name;
	int salary;
	Mydate m[];
	Dept d[];
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Mydate[] getM() {
		return m;
	}
	public void setM(Mydate[] m) {
		this.m = m;
	}
	public Dept[] getD() {
		return d;
	}
	public void setD(Dept[] d) {
		this.d = d;
	}
	public String toString()
	{
		return "\nemp_id:"+emp_id+"  emp_name:"+emp_name+"  Salary:"+salary+"\nMydate:"+Arrays.toString(m)+"\nDepartment:"+Arrays.toString(d)+"\n";
	}
}
