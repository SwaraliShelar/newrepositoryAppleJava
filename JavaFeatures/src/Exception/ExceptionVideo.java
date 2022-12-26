package Exception;

public class ExceptionVideo
{
public static void main(String[] args) 
{
	int a=10,b=0;
try
{
	System.out.println("divide:"+(a/b));
	System.out.println("Addition:"+(a+b));
	System.out.println("substraction:"+(a-b));
}
catch(ArithmeticException  e)//when there is no exception occurs then tour catch block will not executes
{
	System.out.println(e);
	e.getMessage();
	e.getClass();
}
System.out.println("program is done.....");//customize message
}
}