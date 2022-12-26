package AssignmentInheritancePolymorphism;

public class InternEmployeeC extends EmployeeC
{
	void InternEmployeeCIncreament(float isalary)
	{
	this.isalary=isalary;
	System.out.println("salary before adding a increment of intern worker is:"+isalary);
	double inewsalary=isalary+incrementi;
	System.out.println("After adding a increment salary of full time employee is:"+inewsalary+"\n");

}
}