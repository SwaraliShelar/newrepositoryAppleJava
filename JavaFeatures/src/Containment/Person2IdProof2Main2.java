package Containment;

public class Person2IdProof2Main2 {
public static void main(String[] args) {
	IdProof2 ip=new IdProof2();
	ip.setNumber("9876543210");
	ip.setName("mr roa");
	ip.setAddress("sector 1 shivaji nagar pune.");
	
	Person2 p=new Person2();
	p.setName("ramesh");
	p.setContact("98765468790");
	p.setAge("24");
	p.setIdProof2(ip);
	
	System.out.println("person Name:"+p.getName()+"\nPerson Contact:"+p.getContact()+"\nPerson Age:"+p.getAge()+"\n"+p.getIdProof2().getAddress()+"\n"+p.getName());
	
}
}
