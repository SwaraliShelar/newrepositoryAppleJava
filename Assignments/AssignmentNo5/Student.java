/*1. WAP to have Student class has roll, name and
 Department object should
have id and name. Assign and print individual values in main method
(Note - Containment using constructor and getter/setter).
 */
package AssignmentNo5;

public class Student
{
int rollno;
String name;
Department d;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void setDepartment(Department d)
{
	this.d=d;
}
public Department getDepartment()
{
	return d;
}
public String toString()
{
	return "Student rollno:"+rollno+"\nStudent name:"+name+"\nDepartment:\n"+d;
}
}
