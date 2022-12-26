/*3. Create Person class with fields(id,name,job) 
where job is another class with
field(jobid,profile,joiningdate) where joiningdate is another class with fields
(day, month, year) Display Person information (Note - Containment using
constructor and getter/setter).
 */
package Assignment5ByConstructor;

public class Person {
int id;
String name;
Job j;
Person(int id,String name,Job j)
{
	this.id=id;
	this.name=name;
	this.j=j;
}
public String toString()
{
	return "Id:"+id+"\nName:"+name+"\nJob:"+j;
}
}
