package Containment;

public class Person1 {
	private int id;
	private String name,contact,email;
	Address1 a;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress1(Address1 a)
	{
		this.a=a;
	}
	public Address1 getAddress1()
	{
		return a;
	}
	public String toString()
	{
		return+id+"\n"+name+"\n"+contact+"\n"+email+"\n"+a;	
	}
}
