//6.For any integer input not between 1 to 7 it should display "error, day does not exist"
package AssignmentOnSwitchCase;

import java.util.Scanner;

public class InputBetween1to7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int num=sc.nextInt();
	switch(num)
	{
	case 1:System.out.println("monday");break;
	case 2:System.out.println("tuesday");break;
	case 3:System.out.println("wednesday");break;
	case 4:System.out.println("thursday");break;
	case 5:System.out.println("friday");break;
	case 6:System.out.println("saturday");break;
	case 7:System.out.println("sunday");break;
	
		default:
			System.out.println("error, day does not exist");
	}
	sc.close();
}
}
