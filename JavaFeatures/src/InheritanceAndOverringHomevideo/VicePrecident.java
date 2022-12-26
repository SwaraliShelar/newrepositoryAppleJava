package InheritanceAndOverringHomevideo;
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
public void displayvicePrecidentDetails()
{
	displayEmployeeDetails();
	System.out.println("Additional allowance in RS. "+getAllowance());
}
}
