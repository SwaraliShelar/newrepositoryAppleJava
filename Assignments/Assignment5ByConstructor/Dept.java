package Assignment5ByConstructor;

public class Dept {
	int dept_id;
	String dept_name;
	//using constructor
	Dept(int dept_id,String dept_name)
	{
		this.dept_id=dept_id;
		this.dept_name=dept_name;
	}
	public String toString()
	{
		return "Employee Dept_id:"+dept_id+"\nEmployee Dept_name:"+dept_name;
	}
}
