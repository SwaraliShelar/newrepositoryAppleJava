/*10.Show the use of this keyword in Program –

a. with a field(Instance Variable)
b. with Constructor
c. with Method
 */
package AssignmentNo4;

import java.util.Scanner;

public class ThisUseProgramStudent 
{
		int id, marks;
		String name;
		ThisUseProgramStudent()
		{
			this(1,78,"swara");
		}
//to avoid shadowing of object
		ThisUseProgramStudent(int id, int marks, String name)
		{
			this.id = id;
			this.marks = marks;
			this.name = name;
//calling method using this keywod			
			this.display();
		}
//this keyword helps you to refer a current object		
		public void display()
		{
			System.out.println("Student id:"+this.id);
			System.out.println("Stdent marks:"+this.marks);
			System.out.println("Student name:"+this.name);
		}
		public static void main(String[] args)
		{
			ThisUseProgramStudent s1=new ThisUseProgramStudent();
			ThisUseProgramStudent s2=new ThisUseProgramStudent(4,98,"pooja");
		}
	
	
}
