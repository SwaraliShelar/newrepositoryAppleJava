package HomeVideoPrograms;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
	int p;
	Scanner sc=new Scanner(System.in);
	System.out.println("How many passangers for  trip??");
	p=sc.nextInt();
	System.out.println("no of paasangers is "+ p);
	
	switch(p)
	{
	default:
		System.out.println("please enter valid credentials");
		break;//after the default there is cases thats why we write the break stsmt for proper execution of program
	case 4:
		System.out.println("so lets arrange the car");
		break;
	case 8:
		System.out.println("so lets  arrange the scorpio");
		break;
	case 15:
		System.out.println("so lets  arrange the mini bus");
		break;
	case 45:
		System.out.println("so lets arrange the bus");
		break;
	}
}
}
