package com.p1;

public class Account
{
	private int accno;
	protected String name;
	private float balance;

	public void openAccountDetails()
	{
		fillAccountdetails(1234,"mr bajaj",20000.00f);//nested method call
	    showDetails();//nested method call
	}
	private void fillAccountdetails(int ano,String n,float b)
	{
		accno=ano;
		name=n;
		balance=b;
	}
	void showDetails()
	{
		System.out.println("Account no:"+accno);
		System.out.println("Name:"+name);
		System.out.println("Balance:"+balance);
	}
	}


