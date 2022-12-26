/*
 5. Write a program to copy values of one object into 
another by assigning the values of one object into another.
in this example,
 we copy the values of object to another with help a constructor.

 */

package AssignmentNo3;

import java.util.Scanner;

public class Object12 {
int id,marks;
String name,dept;
Object12(int id,int marks,String name,String dept)
{
	this.id=id;
   this.marks=marks;
   this.name=name;
   this.dept=dept;
}
void ShowDetails()
{
	System.out.println(id+" "+marks+" "+name+" "+dept);
}
public static void main(String[] args) 
{
	
	
	Object12 ob1=new Object12(1,50,"swara","science");
	Object12 ob2=new Object12(2,80,"pooja","biotech");
	   ob1=ob2;	
	ob1.ShowDetails();
	ob2.ShowDetails();
}
}
