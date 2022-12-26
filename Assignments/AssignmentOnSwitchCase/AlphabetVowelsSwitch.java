package AssignmentOnSwitchCase;

import java.util.Scanner;

public class AlphabetVowelsSwitch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the alphabet:");
	int ch=sc.next().charAt(0);
	 switch(ch)
	 {
	 case 'a':
	 case 'e':
	 case 'i':
	 case 'o':
	 case 'u':
		 System.out.println("the alphabet is vowel");
		 break;
	 case 'A':
	 case 'E':
	 case 'I':
	 case 'O':
	 case 'U':
		 System.out.println("the alphabet is vowel");
		 break;
	 }
	 sc.close();
}
}
