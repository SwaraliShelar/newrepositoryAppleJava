package AssignmentInheritancePolymorphism;

public class ProgrammerProfile extends PersonProfile{
String companyname;
void coding(String companyname)
{
	this.companyname=companyname;
}
void display()
{
	super.display();
	System.out.println(super.name+" is a programmer");
	System.out.println("Programmer worked in Compony ");
	System.out.println("CompanyName is:"+companyname);
}

}
