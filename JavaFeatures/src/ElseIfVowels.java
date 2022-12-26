import java.util.*;
public class ElseIfVowels {
  public static void main(String[] args) {
	  
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character :");
	char ch = sc.next().charAt(0);
	if(ch =='a' || ch=='A')
	{
		System.out.println("vowel");
	}
	else if(ch =='E' || ch=='e')
	
		System.out.println("vowel");
	
	else if(ch =='i' || ch=='I')
			
			System.out.println("vowel");
		
	else if(ch =='o' || ch=='O')
		
		System.out.println("vowel");
	
	else if(ch =='u' || ch=='U')
		
		System.out.println("vowel");
	
	else
	{
		System.out.println("contastants");
		
    }
	sc.close();
}
}
