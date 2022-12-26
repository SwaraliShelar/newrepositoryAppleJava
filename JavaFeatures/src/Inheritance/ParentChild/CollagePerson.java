package Inheritance.ParentChild;

//hierarchical inheritance example
public class CollagePerson {
	int id, age;
	String name, contact;

	static String collageName = "YCIS satara";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public void setCollageName(String collageName) {
		CollagePerson.collageName = collageName;
	}
}
