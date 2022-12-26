package WrittenTest7;

public class IDProof extends Person1{
String validity;
int adharcardno;
void acceptIDProofDetails(String validity,int adharcardno)
{
	super.name=name;
   //this.name=name;
	this.validity=validity;
	this.adharcardno=adharcardno;	
}
void displayDetails()
{
	super.displayDetails();
	System.out.println("\nAdharCard Details:");
	System.out.println("name:"+name+"\nvalidity:"+validity+"\nAdharCard number:"+adharcardno);
}
}
