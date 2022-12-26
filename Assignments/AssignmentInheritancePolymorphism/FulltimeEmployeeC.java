package AssignmentInheritancePolymorphism;

public class FulltimeEmployeeC extends EmployeeC
{
void fullEmployeeIncreament(float fsalary)
{
	this.fsalary=fsalary;
	System.out.println("salary before adding a increment of fulltime worker is:"+fsalary);
	double fnewsalary=fsalary+incrementf;
	System.out.println("After adding a incrementsalary of full time employee is:"+fnewsalary+"\n");
}
}
