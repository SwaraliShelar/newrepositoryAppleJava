/*10.Create class Student (id, name) then create 2 objects of Student using new 
keyword. Print 2 objects and see its hashcode is different E.g.
tudent@15db9742 and Student@2329742. If you do this Student s1 = new 
Student (); Student s2 = s1; Now print s1 and s2 see both reference 
variables are pointing to same location now override the toString () method 
in student class and see the beautiful output. 
 */
		
package AssignmentNo5;

public class StudentRef {
int id;
String name;
public void accpetdetails()
{
	id=1;
	name="pooja";
}
public String toString()
{
	return "Id:"+id+"\nName:"+name;
}
public static void main(String[] args)
{
StudentRef sr1=new StudentRef();
StudentRef sr2=sr1;
sr1.accpetdetails();
System.out.println(sr1);
System.out.println(sr2);
}
}