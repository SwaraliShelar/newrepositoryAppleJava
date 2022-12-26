package HomeVideoPrograms;

import java.util.Scanner;

public class ElseIfLadderMarks {
public static void main(String[] args) {
	System.out.println("We have to calculate total percentage  of student\n");
	Scanner sc=new Scanner(System.in);
	float total,per;
	char ch;
	do {
	System.out.println("Enter marks of physics:");
	int m1=sc.nextInt();
	System.out.println("Enter marks of Chemistry:");
	int m2=sc.nextInt();
	System.out.println("Enter marks of Mathematics:");
	int m3=sc.nextInt();
	
	total=m1+m2+m3;
	per=total/300*100;
	System.out.println("the percentage of PCM group is:"+per+"%");
	
	
	if(per>=91)
		System.out.println("the student is passed with A+ grade");
	else if(per>=81)
		System.out.println("the student is passed with A grade");
	else if(per>=71)
		System.out.println("the student is passed with B+ grade");
	else if(per>=61)
		System.out.println("the student is passed with B grade");
	else if(per>=51)
		System.out.println("the student is passed with C+ grade");
	else if(per>=45)
		System.out.println("the student is passed with c grade");
	else
		System.out.println("student is passed only");
	
	
	    System.out.println("do you want to continue???(y/n):");
	    ch=sc.next().charAt(0);
	  
	}while(ch=='y'||ch=='Y');
	sc.close();
}
}
