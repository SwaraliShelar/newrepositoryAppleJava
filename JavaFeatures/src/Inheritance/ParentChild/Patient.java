package Inheritance.ParentChild;
//hierarchical inheritance example using method overriding

public class Patient extends Person {
int id;
String disease;
int bedNo;

public void setId(int id) {
	this.id = id;
}

public void setDisease(String disease) {
	this.disease = disease;
}

public void setBedNo(int bedNo) {
	this.bedNo = bedNo;
}
void display()
{
	super.display();
	System.out.println("Patient id:"+id+"\nPatient disease Name:"+disease+"\nPateint bed number:"+bedNo+"\nhosplital name:"+Patient.hospital);
}
}
