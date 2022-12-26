package AssignmentOnArray;

import java.util.Scanner;

/*19. WAP to print the employees from Employee[] array who has same salary (Create 
Employee class which has 3 attributes id, name, salary and add employee objects to 
your array)
 */
public class Employee
{
int id,salary;
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}	
public String toString()
{
	return "id:"+id+"  salary:"+salary+"  name:"+name;
}
}
 