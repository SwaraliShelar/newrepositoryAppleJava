package Interface;
interface s1
{
	void sqrt(int a);
}
interface s2
{
	void sqrt(int a);
}
public class SqareRootMultiple implements s1,s2
{
	public void sqrt(int a)
	{
		System.out.println("square root:"+ Math.sqrt(a));
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
    SqareRootMultiple sp=new SqareRootMultiple();
    sp.sqrt(625);
	}

}
