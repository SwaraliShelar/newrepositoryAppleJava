package Containment;

public class Person1Addess1Main1
{
public static void main(String[] args) {
	Address1 a1=new Address1();
	a1.setArea("shivaji peth");
	a1.setCity("satara");
	a1.setState("Maharashtra");
	a1.setPincode("4140015");
	
	Person1 p1=new Person1();
	p1.setId(1);	
	p1.setName("swarali shelar");
	p1.setContact("9876543212");
	p1.setEmail("swara@123gmail.com");
	p1.setAddress1(a1);
		
	System.out.println("Inforamation about Person:1");
	System.out.println("Person id:"+p1.getId()+"\nPerson name:"+p1.getName()+"\nPerson contact:"+p1.getContact()+"\nPerson Email:"+p1.getEmail());
	System.out.println(p1.getAddress1());
	
	
	Address1 a2=new Address1();
	a2.setArea("Shanivar Peth");
	a2.setCity("Pune");
	a2.setState("Maharashtra");
	a2.setPincode("4150015");
	
	Person1 p2=new Person1();
	p2.setId(2);
	p2.setName("uday shelar");
	p2.setContact("908765434");
	p2.setEmail("uday123@gamil.com");
	p2.setAddress1(a2);
	
	System.out.println("\nInforamation about Person:2");
	System.out.println("Person id:"+p2.getId()+"\nPerson name:"+p2.getName()+"\nPerson contact:"+p2.getContact()+"\nPerson Email:"+p2.getEmail());
	System.out.println(p2.getAddress1());
	
	Address1 a3=new Address1();
	a3.setArea("ravivarPeth");
	a3.setCity("Koregoan");
	a3.setState("Maharashtra");
	a3.setPincode("4150011");
	
	Person1 p3=new Person1();
	p3.setId(3);
	p3.setName("aditya shelar");
	p3.setContact("9056787656");
	p3.setEmail("aditya123@gamil.com");
	p3.setAddress1(a3);
	
	System.out.println("\nInformation about Person:3");
	System.out.println("Person id:"+p3.getId()+"\nPerson name:"+p3.getName()+"\nPerson contact:"+p3.getContact()+"\nPerson Email:"+p3.getEmail());
    System.out.println(p3.getAddress1());

}
}
