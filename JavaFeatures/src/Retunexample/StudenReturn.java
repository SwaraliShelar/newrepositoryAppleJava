package Retunexample;

import java.util.Scanner;

public class StudenReturn {
int id;
String name;
int m1;int m2;int m3;

float total(int s1,int s2,int s3)
{
	float tot=m1+m2+m3;
	return tot;

}
void percentage(float total)
{
	float per=total/3;
	System.out.println("percentage is : "+per);
}

public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	StudenReturn sr=new StudenReturn();

	System.out.println("Enter a id:");
	int id=sc.nextInt();
	System.out.println("Enter a name:");
	String name=sc.next();
	System.out.println("Enter a marks of first subject:");
	int m1=sc.nextInt();
	System.out.println("Enter a marks of second subject:");
	int m2=sc.nextInt();
	System.out.println("Enter a marks of third subject:");
	int m3=sc.nextInt();
	System.out.println( id+" "+name+" "+m1+" "+m2+" "+m3);
	
	   PerTotal pt=new PerTotal();
	   float stotal=pt.total(m1,m2,m3);
	   pt.percentage(stotal);
	  
}
}
