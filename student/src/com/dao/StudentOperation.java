package com.dao;

import java.util.Arrays;

import java.util.Scanner;

import com.pojo.Student;


public class StudentOperation
{
	Student stud[]=new Student[2];
	Scanner sc=new Scanner(System.in);
	
	 public void studentData()
	 {
	    System.out.println("enter the number of student:");
	    int size=sc.nextInt();
	    	for(int i=0;i<size;i++)
	    	{
	    		System.out.println("enter the student id,name,email,contact,department and marks:");
	    		
	    		int id=sc.nextInt();
	    		String name=sc.next();
	    		String email=sc.next();
	    		String contact=sc.next();
	    		String dept=sc.next();
	    		int marks=sc.nextInt();
	    		
	    		Student s=new Student();
	    		s.setId(id);
	    		s.setName(name);
	    		s.setEmail(email);
	    		s.setContact(contact);
	    		s.setDept(dept);
	    		s.setMarks(marks);
	    		
	    		stud[i]=s;
	    	}
	    	for(Student s:stud)
	    	{
	    		System.out.println(s);
	    	}
	    }
 public void insertData()
 {
    System.out.println("enter the student id,name,email,contact,department and marks:");
    	for(int i=0;i<stud.length;i++)
    	{
    		int id=sc.nextInt();
    		String name=sc.next();
    		String email=sc.next();
    		String contact=sc.next();
    		String dept=sc.next();
    		int marks=sc.nextInt();
    		
    		Student s=new Student();
    		s.setId(id);
    		s.setName(name);
    		s.setEmail(email);
    		s.setContact(contact);
    		s.setDept(dept);
    		s.setMarks(marks);
   
    		if(stud[i]==null)
    			stud[i] = s;
    		System.out.println(s);
    	}
    }
 public void displayData()
 {
		System.out.println(Arrays.toString(stud));
	}
 public void addData()
 {
		
		System.out.println("Add data to Enter the id,name,email,contact,dept,marks: ");
		int id = sc.nextInt();
		String name = sc.next();
		String email = sc.next();
		String contact = sc.next();
		String dept=sc.next();
		int marks = sc.nextInt();

		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setEmail(email);
		s.setContact(contact);
		s.setDept(dept);
		s.setMarks(marks);

		for (int i = 0; i < stud.length; i++) 
		{
			if (stud[i] == null) {
				stud[i] = s;
				break;
			}
		}
	}

 public void updateData()
{
	System.out.println("Student want to update details: email orcontact:");
	int num=sc.nextInt();
	String email=sc.next();
			int id=sc.nextInt();
		for(Student s:stud)
		{
			if(s!=null)
			{
				if(s.getId()==id)
				{
					s.setEmail(email);
				}
			}
		}
			
}
 public void searchData()
 {
	 System.out.println("Search student details enter id of student:");
	 int id=sc.nextInt();
	 for(Student s:stud)
	 {
		 if(s!=null)
		 {
			 if(id==s.getId())
			 {
				 System.out.println(s.getId()+""+s.getName()+""+s.getEmail()+""+s.getContact()+""+s.getDept()+""+s.getMarks());
			 }
		 }
	 }
	 System.out.println();
 }
 public void deleteData() 
 {
	 Student s[]= new Student[stud.length];
		System.out.println("enter the id of student to delete: ");
		int id=sc.nextInt();
		
		int  index=0;
		
		for(int i=0;i<stud.length;i++)
		{
			if(stud[i]!=null)
			{
				if(stud[i].getId()==id)
				{
					index=i;
				}
			}
		}
		int j=0;
		for(int i=0;i<stud.length;i++)
		{
			if(i==index)
			{
				continue;
			}
			else
			{
				s[j]=stud[i];
				j++;
			}
		}
		for(int i=0;i<s.length;i++)
		{
			stud[i]=s[i];
		}
 }
}