//8.write java program for switch expression is of string type
package AssignmentOnSwitchCase;

import java.util.Scanner;

public class StringInSwitch {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of games:");
     String game=sc.nextLine();
     game=game.toLowerCase();
	 switch(game)
	 {
	    case "cricket":System.out.println("lets play cricket");break;
		case "footboll":System.out.println("lets play footboll ");break;
		case "tennis" :System.out.println("lets play tennis");break;
		case "volleyball":System.out.println("lets play volleyball");break;
		case "basketball" :System.out.println("lets play basketball");break;
	 }
	 sc.close();
}
}

