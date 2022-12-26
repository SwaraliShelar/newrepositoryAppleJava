package Interface;
interface P
{
	void add(int a,int b);
	void sub(int a,int b);
	void multi(int a,int b);
	void div(int a,int b);
}
interface Q
{
	void tofindsin(int angle);
	void sqrt(int s);
}
class ABC
{
	public void  add(int a,int b)
	{
		System.out.println("Addition:"+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("Substraction:"+(a-b));
	}
}
class DEF extends ABC implements P,Q
{

	@Override
	public void tofindsin(int angle) {
		System.out.println("value of sin angle :"+Math.sin(angle));
	}

	@Override
	public void sqrt(int s) {
		System.out.println("SquareRoot is:"+Math.sqrt(s));
	}
	public void add(int a,int b)
	{
		System.out.println("addition is:"+(a+b));
	}

	@Override
	public void multi(int a, int b) 
	{
		System.out.println("multiplication:"+(a*b));
	}

	@Override
	public void div(int a, int b)
	{
		System.out.println("division:"+(a/b));
	}
	
}
public class ExtendsImplement {

	public static void main(String[] args)
	{
    DEF d= new DEF();
    d.add(8,4);
    d.sub(8,4);
    d.multi(8,4);
    d.div(8,4);
    d.tofindsin(150);
    d.sqrt(625);
    /*P p1;
    p1=new DEF();
    p1.add(5, 3);
    p1.sub(6, 2);
    p1.multi(3, 3);
    p1.div(10, 5);

    Q q1;
    q1=new DEF();
    q1.tofindsin(50);
    q1.sqrt(121);
    */
	}

}
