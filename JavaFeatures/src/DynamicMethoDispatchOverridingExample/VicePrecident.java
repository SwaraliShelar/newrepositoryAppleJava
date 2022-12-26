package DynamicMethoDispatchOverridingExample;
//hierarchical inheritance
public class VicePrecident extends Employee
{
float allowance;
public void setAllowance(float allowance)
{
	this.allowance=allowance;
}
public float getAllowance()
{
	return allowance;
}
public Float calculateSalary()
{
	//overriding method of parent class into a child class
	  System.out.println("salary calculated with allowance:");
    return salary+allowance;
}
public void displayvicePrecidentDetails()
{
	displayEmployeeDetails();
	System.out.println("Additional allowance in RS. "+getAllowance());
}
}
