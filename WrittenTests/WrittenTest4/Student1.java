/*
 4.	create student class assign marks and calculate the percentage and print the result 1st class,2nd class etc. 

 */
package WrittenTest4;

import java.util.Scanner;

public class Student1 {
int m1;int m2;int m3;
float percentage;
float total;
Scanner sc=new Scanner(System.in);
float tot()
{
	System.out.println("enter  3 subjects marks:");
	m1=sc.nextInt();
	m2=sc.nextInt();
    m3=sc.nextInt();
    total=(m1+m2+m3);
    return total;
}
void per(float total)
{
	 percentage=(total/3);
}
void result()
{
	 System.out.println("total of 3 subjects is:"+total+"\n"+"percentage is:"+ percentage);
	if( percentage>=80 && percentage<=100)
	 {
	 System.out.println("congratulations,student got 1 st class");
	 }
	 else if( percentage>=60 && percentage<=80)
	 {
	 System.out.println("congratulations,student got 2 nd class");
	 }
	 else if(percentage>=40 && percentage<=60)
	 {
		 System.out.println("congratulations,student passed");
	 }
	 else
	 {
		 System.out.println("failed");
	 }
}
public static void main(String[] args) {
	Student1 s1=new Student1 ();
	
	float ttol=s1.tot();
	s1.per(ttol);
	s1.result();
}
}
