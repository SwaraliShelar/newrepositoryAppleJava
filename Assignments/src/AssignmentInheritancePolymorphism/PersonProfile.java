package AssignmentInheritancePolymorphism;

public class PersonProfile 
{
String name,contact,designation;
void acceptDetails(String name,String contact,String designation)
{
	this.name=name;
	this.contact=contact;
	this.designation=designation;
}
void display()
{
	System.out.println("\nName:"+name+"\nContact Number:"+contact+"\nDesignation:"+designation);
}

}
