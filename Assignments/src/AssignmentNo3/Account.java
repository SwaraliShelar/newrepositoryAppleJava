/*6. Create a class Account containing following methods -
 insert () to insert account data 
 display () to display account information 
 deposit () to deposit amount 
 withdraw () to withdraw amount 
 check_balance() to check balance
 */
package AssignmentNo3;

import java.util.Scanner;

public class Account {
	String name;
	int accno;
	float amountd;
	float amountw;
	float balance;
	Scanner sc = new Scanner(System.in);

	void insert() {
		System.out.println("TO CREATE A ACCOUNT IN BANK\n" + "\n" + "please enter following information\n ");
		System.out.println("enter name:");
		name = sc.next();
		System.out.println("enter account number:");
		accno = sc.nextInt();
	}

	void deposit() {
		System.out.println("enter amount to be deposited:");
		amountd = sc.nextFloat();
	}

	void withdraw() {
		System.out.println("enter amount to be withdrawn:");
		amountw = sc.nextFloat();

	}

	void check_balance() {
		System.out.println(" balance in account:");
		balance = sc.nextFloat();
	}

	void display() {
		if (amountw>0 && amountd >0)
		{
		
		System.out.println("name of account holders:" + name);
		System.out.println("account number:" + accno);
		System.out.println("balance in account is:" + balance);
		System.out.println("deposited amount is :" + amountd + "RS");
		System.out.println("available balance in account after deposited amount :" + (balance + amountd));
		System.out.println("withdrawing amount is :" + amountw + "RS");
		System.out.println("available balance in account after withdrwing amount :" + ((balance+amountd) - amountw));

		}
			else
		{
			System.out.println("error,please enter valid amount for deposite and withdraw process");
		}
		
	}

	public static void main(String[] args) {
		Account a = new Account();
		a.insert();
		a.deposit();
		a.withdraw();
		a.check_balance();
		a.display();

	}
}
