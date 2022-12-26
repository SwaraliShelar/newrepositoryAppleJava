/*2.Create class Person which has attributes (name, gender, age, Address). 

 Address is class which has attributes (city, state, country). Display Persons data
Note. Containment using constructor and getter/setter*/
package WrittenTest6;

public class Person {
private String name,addres;
Address a;
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public void setAddres(String addres)
{
	this.addres=addres;
}
public String getAddres()
{
	return addres;
}
public void setAddress(Address a)
{
	this.a=a;
}
public Address getAddress() {
	return a;
}
}
