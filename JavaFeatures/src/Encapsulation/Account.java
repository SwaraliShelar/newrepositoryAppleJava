package Encapsulation;

public class Account {
private int accno;
private String name;
private float balance;
public void setAccno(int no)
{
	accno=no;
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
public void acceptDetails(int ano,String n,float b)
{
     accno=ano;
     name=n;
     balance=b;
}
}
