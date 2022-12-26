package AssignmentNo2;
import java.util.Scanner;

public class AlphabetToVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter a single word : ");
		ch = sc.nextLine().charAt(0);//take complete line  as a input

		switch (ch) {
		case 'a':

		case 'e':

		case 'i':

		case 'o':

		case 'u':
			System.out.println("vowel");
			break;
		case 'A':

		case 'E':

		case 'I':

		case 'O':

		case 'U':
			System.out.println("vowel");
			break;
		default:
			System.out.println("Constanants");
		}
		sc.close();
	}
}
