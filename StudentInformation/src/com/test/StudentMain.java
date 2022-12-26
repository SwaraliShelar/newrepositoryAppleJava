package com.test;

import java.util.Scanner;

import com.dao.StudentCrudOperation;

public class StudentMain
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);	
	StudentCrudOperation  sco=new StudentCrudOperation ();
	
	
	System.out.println("1.Student records  2.insert student record  3.update student record  4.add new student record   "
			+ "5.delete student record   6.search perticular student record");
	String text;
	do
	{
		System.out.println("select the operation that you want to perform:");
		int data=sc.nextInt();
		switch(data)
		{
		
		   case 1:
			   System.out.println("Student record");
			   sco.studData();
			   sco.display();
			   break;
		   case 2:
			   System.out.println("insert student record");
			   sco.insertData();
			   break;
			   
		   case 3:
			   System.out.println("update student record");
			   sco.update();
			   break;
			   
		   case 4:
			   System.out.println("add new student record");
			   sco.addstud();
			   break;
			   
		   case 5:
			   System.out.println("delete student record ");
			   sco.delete();
			   sco.display();
			   break;
			   
		   case 6:
			   System.out.println("search perticular student record");
			   sco.search();
			   break;
			   
		   default:
			   System.out.println("please enter valid choice:");
			   
		}
		System.out.println("\ndo you want to continue ? (y/n)");
		 text=sc.next();
	}while(text.equalsIgnoreCase("Y"));
	
}
}
