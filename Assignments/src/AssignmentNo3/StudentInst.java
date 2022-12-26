/*2. Now id, name in student class. assign value to id, name there Itself and in 
main method print values then change value of instance variables and again 
print the values 
(Observe you cannot access id directly without creating 
object)
 */
package AssignmentNo3;

import java.util.Scanner;

public class StudentInst {
int i=1;
String n="aditi";

void acceptDetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id:");
	int id=sc.nextInt();
	System.out.println("Enter name:");
	String name=sc.next();
	System.out.println("student id :"+id+" "+"Student name: "+name);
}
void display()
{
	System.out.println("student id :"+i+" "+"Student name: "+n);
}
public static void main(String[] args) {
	
	StudentInst si=new StudentInst();
	si.acceptDetails();
	si.display();
	
}
}
