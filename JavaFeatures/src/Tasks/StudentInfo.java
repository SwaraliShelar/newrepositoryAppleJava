/*  Create a student class student has ID name 3 subject marks .

  create a first method to accept the detail from student .
  create 2nd method to calculate the percentage .
  create 3rd method to display details of student id name and marks of three sub.
 */

package Tasks;

import java.util.Scanner;

public class StudentInfo {
	int id;
	String name;
	float maths;
	float stat;
	float eng;
	float per;
	Scanner sc = new Scanner(System.in);

	void detail() {
		System.out.println("enter a student id:");
		id = sc.nextInt();
		System.out.println("enter a student name:");
		name = sc.next();
		System.out.println("enter a student marks of three subjects:");
		maths = sc.nextFloat();
		stat = sc.nextFloat();
		eng = sc.nextFloat();
	}

	void perc() {
		float total = maths + stat + eng;
		per = total / 3;
		System.out.println("percentage of student:" + per);
	}

	void display() {
		System.out.println("\n         Display student details            \n");
		System.out.println("student id:" + id);
		System.out.println("student name :" + name);
		System.out.println("marks of three subjects");
		System.out.println("student marks in maths:" + maths);
		System.out.println("student marks in stat:" + stat);
		System.out.println("student marks in eng:" + eng);
		System.out.println("percentage of student:" + per);

	}

	public static void main(String[] args) {
		StudentInfo sf = new StudentInfo();
		sf.detail();
		sf.perc();
		sf.display();
		StudentInfo s = new StudentInfo();
		s.detail();
		s.perc();
		s.display();
	}
}
