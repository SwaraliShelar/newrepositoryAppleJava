package Encapsulation;

public class GooglePayApp 
{   
	//which account involve in these transaction
	//from which account you want transfer a amount
	//int amount what amount you want transfer
	public void transferAmount(int amount,Account ac1)//5000,obj
	//in heap memory ac1 is same name obj
	//(obj=ac1)//passing object as a parameter 
	//Account is  class and we pass the Account reference ac1 is passed here as parameter
	//ac1 is reference variable
	{
		float bal=ac1.getBalance();//what is current balance in account ac1 and stored in bal
		ac1.setBalance(bal-amount);//in setBalance we set new value after withdrawing a amount (20000-5000)
		//ac1.setBalance(ac1.getBalance()-amount);
		System.out.println("Transaction is in process ");
		System.out.println("amount transfer successfully "
				+"\nupdated balance value of account number "+ac1.getAccno()
				+" in RS. "+ac1.getBalance());
	}
public static void main(String[] args) {
	Account obj=new Account();//(obj=ac1)
	obj.acceptDetails(123,"mr patil",20000.00f);
	GooglePayApp t1=new GooglePayApp();
	t1.transferAmount(5000,obj);
}
}
