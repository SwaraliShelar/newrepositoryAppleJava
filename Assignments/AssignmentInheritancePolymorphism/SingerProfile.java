package AssignmentInheritancePolymorphism;

public class SingerProfile extends PersonProfile
{
String bandname;
String singingtype;
void bandname(String bandname)
{
	this.bandname=bandname;
}
void Singing(String singingtype)
{
	this.singingtype=singingtype;
}
void PlayGitar()
{	
}
void display()
{
	super.display();
	System.out.println(super.name +"is a singer");
	System.out.println("also play a gitar");
	System.out.println("singing type is:"+singingtype);
	System.out.println("Bandname is:"+bandname);
}
}
