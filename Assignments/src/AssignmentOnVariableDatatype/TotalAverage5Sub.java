//15. Write a Java program to enter marks of five subjects and calculate total, average and percentage

package AssignmentOnVariableDatatype;

import java.util.Scanner;

public class TotalAverage5Sub {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter marks of 5 subjects:");
	int marathi,sanskrit,hindi,english,history;
	marathi=sc.nextInt();
    sanskrit=sc.nextInt();
	hindi=sc.nextInt();
	english=sc.nextInt();
	history=sc.nextInt();
	float total,average,percentage;
	System.out.println("1.marathi="+marathi);
	System.out.println("2.sanskrit="+sanskrit);
	System.out.println("3.hindi="+hindi);
	System.out.println("4.english="+english);
	System.out.println("5.history="+history);
	
	total=marathi+sanskrit+hindi+history+english;
	average=total/5;
	percentage=total/500*100;
	System.out.println("total of 5 subjects is="+total);
	System.out.println("average of 5 subjects is="+average);
	System.out.println("percentage of 5 subjects is="+percentage+"%");
	sc.close();
}
}
