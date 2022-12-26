package WhileLoopExample;

import java.util.Scanner;

public class NumberPrintExapmle {
 public static void main(String[] args) {
	 int i=1,limit;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter a limit: ");
	 limit=sc.nextInt();
	 while(i<=limit)
	 {
		 System.out.println(i+ " ");
		 i++;
		 
	 }
	 System.out.println("Done");
	 sc.close();
	 
	 
}
}
