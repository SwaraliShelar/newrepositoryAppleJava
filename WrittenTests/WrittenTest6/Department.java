/*1.WAP to have Department class created with id, name .
 Student class has roll, name and Department object should have id and name.
 Assign and print individual values in main method
 */
package WrittenTest6;

public class Department {
private int id;
private String dname;
public void setId(int id)
{
	this.id=id;
}
public int getId()
{
	return id;
}
public void setDname(String dname)
{
	this.dname=dname;
}
public String getDname()
{
	return dname;
}
public String toString()
{
	return "Department Id:"+id+"\nDepartment Name:"+dname;
}
}
