package WrittenTest7;

import java.util.Scanner;

public class Person1IDProofMain
{
	public static void main(String[] args) {
		
IDProof ip=new IDProof();
Scanner sc=new Scanner(System.in);
System.out.println("enter id:");
int id=sc.nextInt();
System.out.println("enter name:");
String name=sc.next();
sc.nextLine();
System.out.println("enter contact number:");
String contcat=sc.next();
sc.nextLine();
System.out.println("enter Address:");
String address=sc.nextLine();
System.out.println("enter IDProof:");
String idproof=sc.next();
sc.nextLine();
System.out.println("enter validity:");
String validity=sc.nextLine();
System.out.println("enter AdharCard number:");
int adharcardno=sc.nextInt();
ip.acceptPersonDetails(id, name, contcat, address, idproof);
ip.acceptIDProofDetails(validity, adharcardno);
ip.displayDetails();
}
}