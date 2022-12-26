import java.util.Scanner;

public class SwitchStateCapital {
public static void main(String[] args) {
	String state;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a State: ");
	state =sc.nextLine();
	state = state.toLowerCase();
	
	switch(state)
	{
	case  "maharashtra"://write the case in  lower case only 
		System.out.println("Mumbai");
		break;
	case  "goa":
		System.out.println("Panji");
		break;
	
	case  "utter pradesh":
		System.out.println("Lackhnow");
		break;
	
	case  "madhya pradesh":
		System.out.println("Bhopal");
		break;
	
	case  "karnataka":
		System.out.println("Banglore");
		break;
	
	case  "gujrat":
		System.out.println("Gandhi Nagar");
		break;
		
	default:
		System.out.println("Enter a valid input");
	}
	sc.close();
}
}
