/* 3. 
Create getId() method in Student class. call getId() method from 
displayData method so that you know that one method can be called from 
another method.
 Return id from getId() method and set that id to the 
instance variable in displayData method
*/
package AssignmentNo3;

import java.util.Scanner;

public class StudentId {
	int id;
	Scanner sc = new Scanner(System.in);
	int getId() {
		System.out.println("Enter student id:");
		id = sc.nextInt();
		return id;
	}

	void displayData(int getId) {
		System.out.println("Student id is:" + id);
	}

	public static void main(String[] args) {
		StudentId s1 = new StudentId();
		// s1.getId();id will print two time
		int totals1 = s1.getId();
		s1.displayData(totals1);

	}
}
