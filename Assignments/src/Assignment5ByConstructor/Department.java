package Assignment5ByConstructor;

public class Department 
{
int dept_id;
String dept_name;
Department(int dept_id,String dept_name)
{
	this.dept_id=dept_id;
	this.dept_name=dept_name;
}
public String toString()
{
	return "Dept_id:"+dept_id+"\nDept_name:"+dept_name;
}
}
