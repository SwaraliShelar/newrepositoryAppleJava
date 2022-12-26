package AssignmentNo1;
import java.util.*;
public class SwappingNumber
{
 public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a values of a and b:");
	 
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 System.out.println("Number before swapping: "+a+ "  "+b);
	
 
	  a=a+b;
	  b=a-b;
	  a=a-b;
	  System.out.println("Number After swapping: "+a+ "  "+b);
 }	  
}
