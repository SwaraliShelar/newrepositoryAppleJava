package WrittenTest7;
import java.util.Scanner;

public class PersonMain 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		IdProof2 i = new IdProof2();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter ID: ");
		int id = sc.nextInt();
		System.out.println("enter person name: ");
		String name = sc.next();
		sc.nextLine();
		System.out.println("enter contact number: ");
		String contact = sc.next();
		sc.nextLine();
		System.out.println("enter address: ");
		String address = sc.next();
		sc.nextLine();
		System.out.println("enter Id name: ");
		String iname = sc.next();
		sc.nextLine();
		System.out.println("enter Id number: ");
		int number = sc.nextInt();
		System.out.println("enter validity: ");
		String validity = sc.next();
		
		
		i.setId(id);
		i.setName(name);
		i.setContact(contact);
		i.setAddress(address);
		i.setName(iname);
		i.setNumber(number);
		i.setValidity(validity);
		
		i.display();

	}
}



