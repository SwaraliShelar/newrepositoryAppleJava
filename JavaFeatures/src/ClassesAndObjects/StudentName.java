/* 
Create getName() method in Student class. call getName() method from 
displayData method so that you know that one method can be called from 
another method.
 Return name from getName() method and set that name to the 
instance variable in displayData method
*/
package ClassesAndObjects;

import java.util.Scanner;

public class StudentName {
	String name;
	Scanner sc = new Scanner(System.in);

	String getName() {
		System.out.println("enter a name:");
		name = sc.next();
		return name;
	}

	void displaydata(String getName) {
		System.out.println("student name is:" + name);
	}

	public static void main(String[] args) {
		StudentName sn = new StudentName();
		// sn.getName(); name will print two time
		String newname = sn.getName();
		sn.displaydata(newname);
	}
}
