/*
4. Add display method inside Student class change values of id, 
name in that method & also print the changed values in same method. Call display 
method from main method. 
 */
package AssignmentNo3;

import java.util.Scanner;

public class Student4
{
		Scanner sc=new Scanner(System.in);
	void displayDetail()
	{
		int id=5;String name="swara";
		System.out.println("Enter a id:");
		int i=sc.nextInt();
		System.out.println("Enter a name:");
		String nm=sc.next();
		System.out.println("student id is:"+ id +" \nstudent name is:"+name);
        System.out.println("student id is:"+ i +" \nstudent name is:"+nm);

	}
	
	public static void main(String[] args)
	{
		Student4 std=new Student4();
		std.displayDetail();
		
	}
}
