package ArrayObject;

import java.util.Scanner;

public class StudentGSmain 
{

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
	      
	      System.out.println("Enter the size of array:");
	      int size=sc.nextInt();
         StudentGS stud[]=new StudentGS[size];
        for(int i=0;i<stud.length;i++)
         {
       	  System.out.println("Enter student id,marks,name,dept:");
       	  int id=sc.nextInt();
       	  int marks=sc.nextInt();
       	  String name=sc.next();
       	  String dept=sc.next();
       	  
       //stud[i]=new StudentGSmain (id,marks,name,dept);constructor
         	StudentGS s= new StudentGS ();
           s.setId(id);
           s.setMarks(marks);
           s.setName(name);
           s.setDept(dept);
           stud[i]=s;
         }
	for(StudentGS s:stud)
	{
		if(s.getMarks()>=60 && s.getDept().equalsIgnoreCase("Computer"))
		{
			System.out.println(s);//object
		}
	}
	}
}