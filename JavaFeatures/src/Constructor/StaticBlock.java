package Constructor;

public class StaticBlock {
	int a;
static int count;
//static is a block of code which is execute before main method and is used to initialize static variable
//static block of code is used to initialize a static variable
//in class you can write multiple static block .
//in order to initialize a static block they will execute
static
{
	int a;//in
	count++;
	System.out.println("in static block 1");
}
static
{
	count++;
	System.out.println("in static block 2");
}
static
{
	System.out.println("in static block 3");
}
public static void main(String[] args) {
	
}
}
