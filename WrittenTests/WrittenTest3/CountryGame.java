/*
 3.	National game of India is Hockey, China is Table Tennis, Bangladesh is Kabaddi, Italy is Football,

United States is baseball. Write a Java program to read country name as user-input and to print the
country’s national game. Use switch.

 */
package WrittenTest3;

import java.util.Scanner;

public class CountryGame {
void nationalGame(String game)
{
	switch(game)
	{
	case "india":
		System.out.println("hockey");
		break;
		
	case "china":
		System.out.println("table tennis");
		break;
		
	case "bangladesh":
		System.out.println("kabaddi");
		break;
		
	case "italy":
		System.out.println("football");
		break;
		
	case "united states":
		System.out.println("baseball");
		break;
		
		default:
			System.out.println("select correct country name");
	}
}

public static void main(String[] args) {
	System.out.println("enter country name:");
	String game;
	Scanner sc=new Scanner(System.in);
    game=sc.nextLine();
    game= game.toLowerCase();
	CountryGame cg=new CountryGame();
	cg.nationalGame(game);
	
}
}

