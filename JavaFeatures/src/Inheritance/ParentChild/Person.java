package Inheritance.ParentChild;
//hierarchical inheritance example using method overriding
public class Person {
String name,contact,gender;
int age;
static String hospital="chirayu hospital";
public void setName(String name) {
	this.name = name;
}

public void setContact(String contact) {
	this.contact = contact;
}

public void setGender(String gender) {
	this.gender = gender;
}

public void setAge(int age) {
	this.age = age;
}
public void setHospital(String hospital)
{
	this.hospital=hospital;
}
void display()
{
	System.out.println("Name:"+name+"\nContact:"+contact+"\nGender:"+gender+"\nAge:"+age);
}
}
