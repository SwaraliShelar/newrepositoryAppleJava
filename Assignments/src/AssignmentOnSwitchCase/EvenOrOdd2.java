package AssignmentOnSwitchCase;

import java.util.Scanner;

public class EvenOrOdd2 {
	  public static void main(String args[]) {
	        int n;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter any integer value");
	        n = sc.nextInt();
	        switch(n%2) {
	            case 0:
	                    System.out.println("Number is even");
	                    break;
	            default:
	                    System.out.println("Number is odd");
	        }
	        sc.close();
	    }
}
