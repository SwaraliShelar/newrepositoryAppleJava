package Inheritance.ParentChild;
//hierarchical inheritance Example
public class Father 
{
int age;
String name;
static String surname="shelar";

public static String getSurname() {
	return surname;
}
public static void setSurname(String surname) {
	Father.surname = surname;
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
}
