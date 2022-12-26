import java.util.Scanner;
public class IfElseExample3 {
 public static void main (String[] args) {
	System.out.println("Enter a number :");
	Scanner sc=new Scanner(System.in);
	int num;
	num =sc.nextInt();
	
	if(num %2==0)
	{
		System.out.println("number is even");
	}
	
	else
	{
		System.out.println("number is odd");
	}
	sc.close();
}
}
