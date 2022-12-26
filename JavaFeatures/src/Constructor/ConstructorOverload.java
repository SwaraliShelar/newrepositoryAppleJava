package Constructor;

public class ConstructorOverload {
	ConstructorOverload()
	{  
		this(100);
		System.out.println("simple constructor");
	}
	ConstructorOverload(int a)
	{
		this(100,200);
		System.out.println("one parameterized constructor:"+a);
	}
	ConstructorOverload(int a,int b)
	{
		this(100,200,300);
		System.out.println("two parameterized constructor:"+(a+b));
	}
	ConstructorOverload(int a,int b,int c)
	{
		System.out.println("three parameterized constructor:"+(a+b+c));
	}
	public static void main(String[] args) 
	{
		ConstructorOverload c1=new ConstructorOverload();
		
	}
}
