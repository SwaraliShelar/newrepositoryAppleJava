/*
 2.	If you do this Student s1 = new Student(); Student s2 = s1;
Now print sop(s1) sop(s2) see both reference variables are
pointing to same location. 
 */
package WrittenTest4;

public class Student {
public static void main(String[] args) {
	
	Student s1 = new Student(); 
	//Student s2 = new Student(); 
	Student s2 = s1;
	System.out.println(s1);
	System.out.println(s2);
	
}
}
