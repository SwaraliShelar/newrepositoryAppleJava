package Constructor;

import java.util.Scanner;

public class EmPConSc {
	int id,salary;
	String name,dept;
	float pf;
	
	EmPConSc()//user define default constructor (user enter the values)
	{
		id=1;
		salary=40000;
		name="satish";
		dept="economics";
		pf=0.10f;
	}
	EmPConSc(int i1,int s1,String n1,String d1,float p1)
	{
		id=i1;
		salary=s1;
		name=n1;
		dept=d1;
		pf=p1;
	}
	public String toString()
	{
		return id+" "+salary+" "+name+" "+dept+" "+pf;
	}
public static void main(String[] args) 
{
	EmPConSc epc1=new EmPConSc ();
	System.out.println(epc1);

    System.out.println();
//using a for loop you can display multiple values but you can create only one constructor
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("enter employee number:");
    num=sc.nextInt();
    for(int i=1;i<=num;i++)
    {   
    System.out.println("Enter the value of employee:"+i+"\nid,salary,name,dept,pf");
    int id=sc.nextInt();
    int salary=sc.nextInt();
    String name=sc.next();
    String dept=sc.next();
    float pf=sc.nextFloat();
	EmPConSc epc2=new EmPConSc(id, salary,name, dept,pf);
    System.out.println(epc2);
    }
}
}


