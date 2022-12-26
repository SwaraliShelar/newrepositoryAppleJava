package HomeVideoPrograms;

import java.util.Scanner;

public class BankAccountElseIfLaddeer {
public static void main(String[] args) {
	System.out.println("Enter a bank details of person:");
	int age;
	char ctz;
	Scanner sc=new Scanner(System.in);
    System.out.println("enter a  age of person");
    age=sc.nextInt();
    System.out.println("enter a  city of person");
     ctz=sc.next().charAt(0);
    
  if(age>=18 && ctz=='p')
    System.out.println("person can create a account");
  
    else if(age<=18 && ctz=='p')
    	System.out.println("please enter valid age");
  
    else if(age<=18 && ctz=='s')       
    	System.out.println("please enter valid city");
  
  else      
    	System.out.println("please enter valid age and city");
  
    sc.close();
}}
