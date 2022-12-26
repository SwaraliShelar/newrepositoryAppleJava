package Encapsulation;

public class GooglePayShopping {

	public static void main(String[] args) 
	{
		Shopping s= new Shopping();
		s.setName("Pooja");
		s.setC_id(1);
		s.setBalance(10000);
		s.setPassword(1234);
		System.out.println("Id:"+s.getC_id());
		System.out.println("name:"+s.getName());
		System.out.println("Balance:"+s.getBalance());
		System.out.println("Password:"+s.getPassword());
		System.out.println("but after shopping the bill is 2000 ");
		int newBal=s.getBalance()-2000;
		s.setBalance(newBal);
        System.out.println("Available balance after the shopping is:"+s.getBalance());		
		
	}

}
