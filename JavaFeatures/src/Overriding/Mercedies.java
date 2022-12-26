package Overriding;

public class Mercedies extends Car {
void dashboard()
{
	//super.dashboard();
	System.out.println("Screen");
	super.dashboard();
}
void engine()
{
	System.out.println("mercedies 1894 cc");
}
}
