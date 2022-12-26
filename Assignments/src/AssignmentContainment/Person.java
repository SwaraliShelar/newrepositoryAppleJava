/*3. Create class Person which has attributes (name, gender, age, Address). 
Address is class which has attributes (city, state, country). Display Persons 
data(Note. Containment using constructor and getter/setter)*/
package AssignmentContainment;

public class Person {
	private String name, gender, age;
	Address a;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setAddress(Address a)
	{
		this.a=a;
	}
	public Address getAddress()
	{
		return a;
	}
}
