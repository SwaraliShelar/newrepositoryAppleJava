package ArrayObject;

public class Employee {

	int id;
	float salary;
	String name,dept;
Employee(int id,int salary,String name,String dept)
{
	this.id=id;
	this.salary=salary;
	this.name=name;
	this.dept=dept;
}
public String toString()
{
	return"id:"+id+"  Salary:"+salary+"  Name:"+name+"  Department:"+dept;
}
void hike()
{
	float increment=(salary*10)/100;//0.10f
	salary=salary+increment;
}
}
