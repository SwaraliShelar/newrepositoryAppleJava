package ClassesAndObjects;

import java.util.Scanner;

public class SimpleInterest {
void interest(float p,float t,float r)
{
	float si=p*t*r;
	System.out.println("calculate simple interest:"+si);
}
public static void main(String[] args) {
	float p,t,r;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values of p,t and r:");//p=total amount,t=time duration,r=rate of interest
	p=sc.nextFloat();
	t=sc.nextFloat();
	r=sc.nextFloat();
	SimpleInterest sm=new SimpleInterest();
	sm.interest(p,t,r);
}
}
