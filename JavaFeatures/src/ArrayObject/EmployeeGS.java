package ArrayObject;

public class EmployeeGS
{
int id;
float salary;
String name,dept;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public float hike()
{
	float newsalary=(salary*10)/100;
	salary=salary+newsalary;
	return salary;
}
/*void hike()
{
	float increment=(salary*10)/100;//0.10f
	salary=salary+increment;
}*/
public String toString()
{
	return "id:"+id+"  salary:"+salary+"  name:"+name+"  dept:"+dept;
}
}
