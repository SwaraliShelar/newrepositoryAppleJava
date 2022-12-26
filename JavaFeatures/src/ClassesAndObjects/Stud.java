/*  1.print 2 objects in sysout and see its hashcode is different

Eg Student@15db9742 and Student@2329742

 */

package ClassesAndObjects;

public class Stud {
public static void main(String[] args)
{
	Stud s1=new Stud();
	Stud s2=new Stud();
	
    System.out.println(s1);
    System.out.println(s2);
}
}
 /*
In the above example, we have created an object of the class stud. When we print the object, we can see that the output looks different.

This is because while printing the object, the toString() method of the object class is called. It formats the object in the default format. That is,
WrittenTest4.Stud@515f550a
WrittenTest4.Stud@cac736f

@ - joins the string
WrittenTest4.Stud - name of the class
cac736f  - hashcode value of the object
515f550a - hashcode value of the object
   */

