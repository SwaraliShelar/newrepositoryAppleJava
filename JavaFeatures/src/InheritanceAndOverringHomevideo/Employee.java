package InheritanceAndOverringHomevideo;

public class Employee {
String name;
int id;
float salary;
void acceptEmployeeDetails(String name,int id,float salary)
{
	this.name=name;
	this.id=id;
	this.salary=salary;
}
void displayEmployeeDetails()
{
	System.out.println("Employee Name:"+name);
	System.out.println("Employee Id:"+id);
    System.out.println("Employee monthly salary in RS."+salary);
}
}
