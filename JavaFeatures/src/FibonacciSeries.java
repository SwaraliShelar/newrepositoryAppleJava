import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i=1,n1=0,n2=1,n3;
	
	System.out.println("Enter a value of num:");
	int num=sc.nextInt();
	 while(i<=num)
	 {
		 
		 n3=n1+n2;
		 System.out.println(n3);
		 n1=n2;
		 n2=n3;
		 i++;	 
	 }
	 System.out.println("fibonnaci series");
	 
}
}
