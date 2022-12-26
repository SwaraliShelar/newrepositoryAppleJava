/*2.Write a program to copy values of one object into another by assigning the values of
one object into another.*/

package Tasks;

public class Account {
private int accno;
private String name;
private float balance;
public void setAccno(int accno)
{
	this.accno=accno;
}
public int getAccno()
{
	return accno;
}
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public void setBalance(float balance)
{
	this.balance=balance;
}
public float getBalance()
{
	return balance;
}
void acceptDetails(int a,String n,float b)
{
	accno=a;
	name=n;
	balance=b;
}
}
