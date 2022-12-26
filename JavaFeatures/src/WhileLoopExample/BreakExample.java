package WhileLoopExample;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
int i=1,n=10;

while(i<n)
{
	if(i==10)
	{
		i++;
		break;
	}
	i++;
	System.out.println(i);
}
}
}
