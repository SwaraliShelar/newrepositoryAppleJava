package AssignmentOnArray;

import java.util.Arrays;

/*22. WAP to print the employees from Employee[] array who has same joining date. You 
have Employee class which has 4 attributes id, name, salary, date (date is another 
object which has 3 attributes day, month, year) and add employee objects to your 
array
 */
public class EmployeeJD 
{
int id,salary;
String name;
DateJD d[];

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
public void setDateJD(DateJD[] d)
{
	this.d=d;
}
public DateJD[] getDateJD()
{
	return d;
}
public String toString()
{
	return "\nId:"+id+"  Salary:"+salary +"  Name"+name+"  Joining Date:"+Arrays.toString(d)+"\n";
}
}
