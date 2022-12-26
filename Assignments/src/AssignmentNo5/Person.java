/*3. Create Person class with fields(id,name,job) where job is another class with
field(jobid,profile,joiningdate) where joiningdate is another class with fields
(day, month, year) Display Person information (Note - Containment using
constructor and getter/setter).
 */
package AssignmentNo5;

public class Person
{
int id;
String name;
//String job;
Job j;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Job getJob() {
	return j;
}
public void setJob(Job j) {
	this.j = j;
}
/*public String toString()
{
	return "Person Id:"+id+"\nName:"+name+"\nJob:\n"+j;
}*/
}
