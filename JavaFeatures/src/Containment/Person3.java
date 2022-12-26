package Containment;

public class Person3 {
	private String name,contact,age;
	IdProof3 ip3;
	Person3(String name,String contact,String age,IdProof3 ip3)
	{
		this.name=name;
		this.contact=contact;
		this.age=age;
		this.ip3=ip3;
	}
	public String toString()
	{
		return "Person Name:"+name+"\nPerson Contact:"+contact+"\nPerson Age:"+age+"\n"+ip3;
	}
}
