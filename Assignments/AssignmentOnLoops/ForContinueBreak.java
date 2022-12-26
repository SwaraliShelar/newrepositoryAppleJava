//3. WAP to show the use of break statement ( in for loop)
package AssignmentOnLoops;

import java.util.Scanner;

public class ForContinueBreak {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");//50
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)//i=1,2,3,4,5,......,48,49,50
	{                  //if constant is true
		if(i%5==0)      //5%5==0  10%5==0 15%5==0 20%5==0   25%5==0 30%5==0 35%5==0 40%5==0 45%5==0  50%5==0 
		{
			continue;  //it is used to skip your iteration
			//break;  //it is used to stop your loop
		}System.out.print(i+" ");
		
	}System.out.println("End of the loop");
}
}
