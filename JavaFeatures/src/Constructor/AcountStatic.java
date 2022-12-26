package Constructor;

public class AcountStatic {
private int accno;
protected String name;
private float balance;

public static String  bankname; 
public static float iRate;
static//static block
{
//static block used to:- 1)initialize static variable
//                       2)call a static method of same class
	System.out.println(" 1 static block");
	bankname="ICIC";
}
public static void changeValue(float newVal)//static method
{
	iRate= newVal;
}
AcountStatic()//default constructor
{
	System.out.println("\ndefault constructor");
	accno=1234;
	name="rajesh";
	balance=30000.00f;
}
AcountStatic(int a,String n,float b)//parameterized  constructor
{
	System.out.println("\nparameterized  constructor");
	accno=a;name=n;balance=b;
}
static
{
	System.out.println(" 2 static block");
	iRate=0.5f;
	changeValue(6.7f);//you can also call static method in static block of same class
}
void display()
{
	System.out.println("Account holders name:"+name);
	System.out.println("Account number "+ accno +" with "+AcountStatic.bankname);
	System.out.println("Account balance is in RS:"+balance);
	System.out.println("Interest rate applicable:"+iRate);

}
}
