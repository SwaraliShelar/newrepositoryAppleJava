package AssignmentNo2;
import java.util.Scanner;

public class MaximunNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 3 numbers :");
	int n1,n2,n3;
	n1=sc.nextInt();
	n2=sc.nextInt();
	n3=sc.nextInt();
	
	if(n1>=n2 && n1>=n3) {
		System.out.println("The maximum number from above 3 numbers");
		System.out.println(n1);
	}
		else if(n2>=n1 && n2>=n3)
			System.out.println(n2);
		else
		{
			System.out.println(n3);

	}
}
}
