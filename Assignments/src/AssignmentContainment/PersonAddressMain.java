package AssignmentContainment;

public class PersonAddressMain{
public static void main(String[] args) {
	Address a1=new Address();
	a1.setCity("satara");
	a1.setState("maharashtra");
	a1.setCountry("India");
	
	Person p1=new Person();
	p1.setName("Swarali Shelar");
	p1.setGender("female");
	p1.setAge("24");
	p1.setAddress(a1);
	
	System.out.println("Information about person with Address:");
	System.out.println("Name:"+p1.getName()+"\nGender:"+p1.getGender()+"\nAge:"+p1.getAge()+"\n"+a1);
}

}
