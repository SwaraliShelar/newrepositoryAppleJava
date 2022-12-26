package ClassObjectHomeVideo;

public class Employee {
int id,salary;
String name,dept;
Employee(int id,int salary,String name,String dept)
{
	this.id=id;
	this.salary=salary;
	this.name=name;
	this.dept=dept;
	displayDetails();//this.displayDetails();
	//there is no write this.method_name ever time current object refers implicitly/automatically
}
void displayDetails()
{ 
	//this keyword helps to refer a current object
	//there is no need to write this.ref_var every time because your current object refers implicitly/automatically
	System.out.println("Employee id:"+id);
	System.out.println("Employee salary:"+salary);
	System.out.println("Employee name:"+name);
	System.out.println("Employee dept:"+dept);
}
public static void main(String[] args)
{
	Employee e1=new Employee(1,50000,"rajesh","electronics");
	//e1.displayDetails();
}
}
