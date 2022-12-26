package AssignmentNo3;

import java.util.Scanner;

public class EncapsuBankMain
{
public static void main(String[] args) 
{
	EncapsulationBank eb1=new EncapsulationBank();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter following bank details:");
	
	System.out.println("enter account holders name:");
    String name=sc.next();
    eb1.setName(name);
    System.out.println("enter balance:");
    float balance=sc.nextFloat();
    eb1.setBalance(balance);
    System.out.println("enter userId:");
    String userId=sc.next();
    eb1.setUserId(userId);
    System.out.println("enter password:");
    String password=sc.next();
    eb1.setPassword(password);
	
	System.out.println("account holders name:"+eb1.getName()+"\n"+"available balance in account:"+eb1.getBalance()+"\n"
			+"userId :"+eb1.getUserId()+"\n"+"password :"+eb1.getPassword());
}
}
