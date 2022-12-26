package InheritanceAndOverringHomevideo;

public class OnlineBanking extends Banking {
public void doTransaction()//method is bigger than parent doTransaction means here method is public
{
	System.out.println("transaction done by online way");
	super. doTransction();
}
public void display()
{
	System.out.println("dispealed a passbook");
	super.doTransction();
}
}
