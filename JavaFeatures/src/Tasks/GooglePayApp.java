package Tasks;

public class GooglePayApp {

public void transaction(int amount,Account ac1)
{   
	float bal=ac1.getBalance();//to check a current balance //20000.00f
	ac1.setBalance(bal-amount);//20000.00f-5000
	System.out.println("transaction in current balance:");
	System.out.println("amount transfer successfully "
	+"\nupdated amount in current account num:"+ac1.getAccno()
	+" in rs "+ac1.getBalance());
	
}
public static void main(String[] args)
{
	Account obj=new Account();
    obj.acceptDetails(1234,"pooja",20000.00f);
    
    GooglePayApp g1=new GooglePayApp();
    g1.transaction(5000,obj);
    
}
}
