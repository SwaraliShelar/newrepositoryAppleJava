/*  1.print 2 objects in sysout and see its hashCode is different
Eg Student@15db9742 and Student@2329742
 */

package WrittenTest4;

public class Stud {
public static void main(String[] args)
{
	Stud s1=new Stud();
	Stud s2=new Stud();
	
	System.out.println(s1);
	System.out.println(s2);
	
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
}
}
 /*
In the above example, we have created an object of the class stud. When we print the object, we can see that the output looks different.

This is because while printing the object, the toString() method of the object class is called.
System.out.println(s1);
System.out.println(s2); 
It formats the object in the default format.
i.e.,
WrittenTest4.Stud@515f550a
WrittenTest4.Stud@cac736f

1365202186
212628335

@ - joins the string

WrittenTest4.Stud - name of the class

hashCode 
1365202186 -hashCode value of the object
212628335-hashCode value of the object

hashCode value of the object

515f550a - hexadecimal form 0f hashCode
cac736f - hexadecimal form  0f hashCode
   */

