package InheritanceUsingConstructor;

public class Manager extends Employee
{
	float bonus;
Manager()
{
	super(2,"swarali",40000.00f);//parameterized constructor of Employee call first
	System.out.println("Default constructor of class manager");
}
Manager(float bonus)
{
	this.bonus=bonus;
}
void display()
{
	super.display();
	System.out.println("Bonus of manager:"+bonus);
}
}
