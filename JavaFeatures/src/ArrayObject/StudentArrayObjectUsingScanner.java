package ArrayObject;

import java.util.Scanner;
//refer one program student
public class StudentArrayObjectUsingScanner
{

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
	      
	      System.out.println("Enter the size of array:");
	      int size=sc.nextInt();
          Student stud[]=new Student[size];
          for(int i=0;i<stud.length;i++)
          {
        	  System.out.println("Enter student id,marks,name,dept:");
        	  int id=sc.nextInt();
        	  int marks=sc.nextInt();
        	  String name=sc.next();
        	  String dept=sc.next();
        	  
        	  stud[i]=new Student(id,marks,name,dept);
          }
          for(Student s:stud)
          {
        	  System.out.println(s);
          }
	}

}
