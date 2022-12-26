package Containment;

public class Collage {
private int code;
private String name,address;
Department dept;
Library lib;

public void setDepartment(Department dept)
{
	this.dept=dept;
}
public Department getDepartment()
{
	return dept;
}
public void setLibrary(Library lib)
{
	this.lib=lib;
}
public Library getLibrary()
{
	return lib;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
