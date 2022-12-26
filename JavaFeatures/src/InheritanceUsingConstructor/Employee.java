package InheritanceUsingConstructor;

public class Employee {

	int id;
	String name;
	float salary;
	Employee()
	{
		id=1;
		name="pooja";
		salary=6000.00f;
		System.out.println("Default constructor of class Employee");
	}
	Employee(int id,String name,float salary)
	{
		System.out.println("Parameterised Constructor of class Employee");
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void acceptEmploeeDetails(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;	
	}
	void display()
	{
		System.out.println("Id:"+id+"\nname:"+name+"\nsalary:"+salary);
	}
}
