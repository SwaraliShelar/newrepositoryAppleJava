package ArrayObject;

import java.util.Arrays;

//using containment
public class Company {
int id;
String name;
Department dept[];
Company(int id,String name,Department dept[])
{
	this.id=id;
	this.name=name;
	this.dept=dept;
}
public String toString()
{
	return"id:"+id+"\nName:"+name+"\nDepartment:"+Arrays.toString(dept)+"\n";
}
}
