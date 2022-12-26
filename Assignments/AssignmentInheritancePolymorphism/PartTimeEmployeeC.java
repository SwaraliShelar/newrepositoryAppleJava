package AssignmentInheritancePolymorphism;

public class PartTimeEmployeeC extends EmployeeC
{
void PartTimeEmployeeIncreament(float psalary)
{
	this.psalary=psalary;	
	System.out.println("salary before adding a increment of parttime worker is:"+psalary);
	double pnewsalary=psalary+incrementp;
	System.out.println("After adding a incrementsalary of full time employee is:"+pnewsalary+"\n");

}
}
