package AssignmentInheritancePolymorphism;

public class DancerProfile extends PersonProfile{
String groupname;
void dancing(String groupname)
{
	this.groupname=groupname;
}
void display()
{
	super.display();
	System.out.println(super.name+" is a danser");
	System.out.println("Dance GroupName is:"+groupname);
}
}
