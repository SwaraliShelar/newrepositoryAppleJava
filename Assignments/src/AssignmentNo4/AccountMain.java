//question1 t0 8
package AssignmentNo4;

public class AccountMain 
{
	public static void main(String[] args) {
	Account a1=new Account();
	System.out.println(a1.accountNo+" "+a1.customerName);
	Account a2=new Account(1232423,"mr.bajaj");
	System.out.println(a2.accountNo+" "+a2.customerName);
	Account a3=new Account(1232423,"mr.bajaj");
	System.out.println(a3.accountNo+" "+a3.customerName);
   
	Account a4=new Account(5678,"mr.roa");
	System.out.println(a4.accountNo+" "+a4.customerName);
	Account a5=new Account(1234,"mr.mohan");
	System.out.println(a5.accountNo+" "+a5.customerName);
	Account a6=new Account();
	System.out.println();
}
}