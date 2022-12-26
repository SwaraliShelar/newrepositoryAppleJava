//these is example for create a object as a parameter
package Encapsulation;

import java.util.Scanner;

public class GooglePayAcount1 
{                 //(10000  , passing object as parameter)
public void withdraw(int amount ,Account1 aaa)//Account1 aaa is reference variable
{
	float accountbal=aaa.getBalance();//available amount stored in accountbal variable
    if(accountbal>amount)//50000.00f>10000
    {
    	accountbal=accountbal-amount;//50000.00f-10000
    	aaa.setBalance(accountbal);//after withdrawing amount  available balance in account
    }
    else
    {
    	System.out.println("Low balance try again later");
    }
}
public void deposite(int depobal,Account1 aaa)
{
	
	float acuntbal=aaa.getBalance();
	acuntbal=acuntbal+depobal;
	aaa.setBalance(acuntbal);
}
public static void main(String[] args) 
{
	Account1 a1=new Account1();
	//set a values for a1
	a1.setAccno(12345);
	a1.setName("swarali");
	a1.setBalance(50000.00f);//total balance in account
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a amount to withdraw:");
	int amount=sc.nextInt();
	
	 GooglePayAcount1 gp1=new  GooglePayAcount1();//
	 gp1.withdraw(amount, a1);//10000 
	 System.out.println("amount is withdrawn:\nbalance available in account:"+ a1.getAccno()+" in RS. "+a1.getBalance());
	 //Account1 a2=new Account1();these is another account ,set a values for deposite amount
     //set value for a2
	 // a2.setAccno(67890);
	 // a2.setName("pooja");
	 // a2.setBalance(80000.00f);//total balance in account
	 System.out.println("enter a amount to deposite: ");
	 int depoamount=sc.nextInt();//in same account we deposite a amount and also withdraw a amount 
	 GooglePayAcount1 gp2=new  GooglePayAcount1();
	 gp2.deposite(depoamount, a1);//20000
	 System.out.println("amount is deposite:\nbalance available in account:"+ a1.getAccno()+" in RS. "+a1.getBalance());
	 
}
}
