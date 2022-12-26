/*
2.Write a program to copy values of one object into another by 
assigning the values of
one object into another.
*/
/*
We can copy the values of one object to another using many ways like :

1)Using clone() method of an object class.
2)Using constructor.
3)By assigning the values of one object to another.
in this example, we copy the values of object to another with help a constructor
 */
package WrittenTest5;

public class Student {
	int id, mark;
	String name;

	Student(int id, int mark, String name)
	{
        System.out.println("Constructor called.");
		this.id = id;
		this.mark = mark;
		this.name = name;
	}
   //Copy value of one object into another.
	Student(Student s) //object as parameter
	{
        System.out.println("Constructor called for copying value.");
		this.id = s.id;
		this.mark = s.mark;
		this.name = s.name;
	}

	public static void main(String[] args)
	{
		// parameterized constructor call
		Student s1 = new Student(1, 88, "rajesh");
		
		// print values of object properties.
		System.out.println("s1 id:" + s1.id);
		System.out.println("s1 mark:" + s1.mark);
		System.out.println("s1 name:" + s1.name);
		System.out.println();
		
		// Constructor call to copy the value of one object into other.
		Student s2 = new Student(s1);
		
		// print values of object properties.
		System.out.println("s2 id:" + s2.id);
		System.out.println("s2 mark:" + s2.mark);
		System.out.println("s2 name:" + s2.name);

	}
}
