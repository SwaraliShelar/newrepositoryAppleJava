package HomeVideoPrograms;

import java.util.Scanner;

public class Year {
public static void main(String[] args) {
	int day;
	Scanner sc=new Scanner(System.in);
	System.out.print("month");
	day=sc.nextInt();
	System.out.print("number of days is :");
	
	switch(day){
	default:
		System.out.println("enter valid credential");break;
		//we cannot add the any logical operation herelike(case 1 to case11)thats why we write the cases number of times
	case 1:
	case 3:
	case 5:
	case 7:
	case 9:
	case 11:System.out.println("31");break;
	
	case 2:
		int year=sc.nextInt();
		if(year%4==0)
		    System.out.println("29 and leap year");
		else
			System.out.println("28 and not leap year");
		break;
	case 4:
	case 6:
	case 8:
	case 10:
	case 12:System.out.println("30");break;
	
	}
}
}
