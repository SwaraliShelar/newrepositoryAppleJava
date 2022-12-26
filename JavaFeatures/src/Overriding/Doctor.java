package Overriding;
//hierarchical inheritance example using method overriding

public class Doctor extends Person {
int id;
String specialization;
int licenceNo;

public void setId(int id) {
	this.id = id;
}

public void setSpecialization(String specialization) {
	this.specialization = specialization;
}

public void setLicenceNo(int licenceNo) {
	this.licenceNo = licenceNo;
}
void display()
{
	super.display();//we override display() here in person class
	System.out.println("Doctor id no:"+id+"\nDoctor Specialization:"+specialization+"\nDoctor Licence number:"+licenceNo+"\nhosplital name:"+Patient.hospital);
}
}
