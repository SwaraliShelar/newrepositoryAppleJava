package WhileLoopExample;

import java.util.Scanner;

public class ContinueAndBreak {
public static void main(String[] args) {
	System.out.println("enter the number:");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();//num=10
	int i=0;
	while(i<=num) {//i=0 i=1 i=2 i=3 i=4 i=5 i=6 i=7 i=8 i=9 i=10
		i++;           
		if(i%3==0) {     // if con is true i=3%3==0  //i=6%3==0   //i=9%3==0 
			continue;   //it is used to skip your iteration
			//break;    //it is used to stop your loop
		}
		System.out.print(i+" ");
	}
	System.out.println("out of while loop");
}}