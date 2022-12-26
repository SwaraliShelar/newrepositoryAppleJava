package com.dao;

import java.util.Arrays;

import java.util.Scanner;

import com.pojo.Student;

public class StudentCrudOperation 
{
	
	Student stud[]=new Student[10];
	Scanner sc=new Scanner(System.in);
 
   public void insertData()
    {
	   System.out.println("how many student information you want to enter:");
	    int size=sc.nextInt();
		System.out.println("enter the details for "+size+" students: ");
		int a[]=new int [size];
    	for(int i=0;i<size;i++)
    	{
        	System.out.println("enter the student id,name,email,contact,department and marks:");
    		int sid=sc.nextInt();
    		String sname=sc.next();
    		String semail=sc.next();
    		String scontact=sc.next();
    		String sdept=sc.next();
    		int smarks=sc.nextInt();
    		
    		Student s=new Student();
    		s.setId(sid);
    		s.setName(sname);
    		s.setEmail(semail);
    		s.setContact(scontact);
    		s.setDept(sdept);
    		s.setMarks(smarks);
    		
    		stud[i]=s;
    	}
    	for(Student s:stud)
    	{
    		System.out.print(s+" ");
    	}
    }
   public void display()
   {
   	   System.out.println(Arrays.toString(stud));
   }	
	
   public void addstud()
   {
	   System.out.println("enter the student id,name,email,contact,department and marks:");
		int sid=sc.nextInt();
		String sname=sc.next();
		String semail=sc.next();
		String scontact=sc.next();
		String sdept=sc.next();
		int smarks=sc.nextInt();
		
		Student s=new Student();
		s.setId(sid);
		s.setName(sname);
		s.setEmail(semail);
		s.setContact(scontact);
		s.setDept(sdept);
		s.setMarks(smarks);
		
		for(int i=0;i<stud.length;i++)
		{
			if(stud[i]==null)
			{
				stud[i]=s;
				break;
			}
		}
		System.out.println(Arrays.toString(stud));
   }
  public void search()
   {
	   System.out.println("\nenter a student id to search perticular student details:");
	   int id=sc.nextInt();
	   for(Student s:stud)
	   {
		   if(stud!=null)
		   {
			   if(s.getId()==id)
			   {
				   System.out.println(s.getId()+" "+s.getName()+" "+s.getEmail()+" "+s.getContact()+" "+s.getDept()+" "+s.getMarks());
			   }
		   }
	   }
	   System.out.println();
   }
 public void  update()
{
	System.out.println("enter the value you want to update details: 1.email or 2.contact:");
	
		System.out.println("enter the details for email updation:");
		System.out.println("enter the employee id:");
			int id=sc.nextInt();
			String email=sc.next();
			for(Student s:stud)
			{
			 if(s!=null)
			 {
			  if(s.getId()==id)
				{
					System.out.println("enter the new email for updation:");
					s.setEmail(email);
				}
			 }
			}
			System.out.println(Arrays.toString(stud));
			
	
	/*	System.out.println("enter the details to update the contact number of student:");
		System.out.println("enter id");
	    id=sc.nextInt();
		System.out.println("enter contact");
	    String contact=sc.next();
		for(Student s:stud)
		{
			if(s!=null)
			{
			if(s.getId()==id)
			{
				System.out.println("enter the new contact for updation:");
				String newcontact=sc.next();
				s.setEmail(newcontact);
			}
			}
		}
		System.out.println(Arrays.toString(stud));
		*/
	}

 public void delete()
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

  public void studData()
{
	   for(int i=0;i<stud.length;i++)
	   {
	   Student s1=new Student();
	   s1.setId(1);
	   s1.setName("rajendra");
	   s1.setEmail("rajendra123@gmail.com");
	   s1.setContact("111111111");
	   s1.setDept("history");
	   s1.setMarks(78);
	   stud[0]=s1;
	   
	   Student s2=new Student();
	   s2.setId(2);
	   s2.setName("chaitnya");
	   s2.setEmail("chaitu123@gmail.com");
	   s2.setContact("22222222");
	   s2.setDept("geography");
	   s2.setMarks(67);
	   stud[1]=s2;
	   }
	 
}
/*public void display()
{
	   System.out.println(Arrays.toString(stud));
}*/
}