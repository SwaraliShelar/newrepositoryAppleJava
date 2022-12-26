package Overriding;
//hierarchical inheritance example using method overriding

public class PersonDoctorPateintMain 
{
	public static void main(String[] args) {
Patient p=new Patient();
p.setName("mr ramesh rathod");
p.setContact("9876543210");
p.setGender("Male");
p.setAge(67);
p.setId(101);
p.setDisease("high fever");
p.setBedNo(30);
p.display();

System.out.println();

Doctor d=new Doctor();
d.setName("dr patil");
d.setContact("98076543210");
d.setGender("Male");
d.setAge(50);
d.setId(20);
d.setSpecialization("surgon");
d.setLicenceNo(345);
d.display();
}
}