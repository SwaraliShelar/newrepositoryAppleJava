package Constructor;

public class AcntInstance {

	private int accno;
	protected String name;
	private float balance;

	public static String  bankname; 
	public static float iRate;
	//static block used to:- 1)initialize static variable
//  2)call a static method of same class
	static//static block
	{
		System.out.println("static block 1 ");
		bankname="ICIC";
	}
	/*instance block used to:- 
	1)initialize instance variables,static variable
    2)call a static method and instance method of same class*/
	{//instance block { }
	System.out.println("Instance block 1 executed");
	accno=5674;
	name="pooja";	
	}
	public static void changeValue(float newVal)//static method
	{
		iRate= newVal;
	}
	AcntInstance()//default constructor
	{
		System.out.println("\ndefault constructor");
		accno=1234;
		name="rajesh";
		balance=30000.00f;
	}
	AcntInstance(int a,String n,float b)//parameterized  constructor
	{
		System.out.println("\nparameterized  constructor");
		accno=a;name=n;balance=b;
	}
	static
	{
		System.out.println("static block 2");
		iRate=0.5f;
		changeValue(6.7f);//you can also call static method in static block of same class
	}
	{
		System.out.println("Instance block 2 executed");
		balance=5000.550f;
		display();//you can call non static method means instance method
		changeValue(1.1f);//you can call  static method in instance variable
		
	}
	void display()//non static method
	{
		System.out.println("Account holders name:"+name);
		System.out.println("Account number "+ accno +" with "+AcountStatic.bankname);
		System.out.println("Account balance is in RS:"+balance);
		System.out.println("Interest rate applicable:"+iRate);

	}
	}

