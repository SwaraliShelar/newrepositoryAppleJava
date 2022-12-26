package Encapsulation;

import java.util.Scanner;

public class FlightMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter details to book flight:");
	
	Flight f1=new Flight();
	System.out.println("enter a id:");
	int id=sc.nextInt();
	f1.setId(id);
	System.out.println("enter a compony name:");
	String company=sc.next();
	f1.setCompony(company);
	System.out.println("enter a source:");
	String source=sc.next();
	f1.setSource(source);
	System.out.println("enter a destination:");
	String destination=sc.next();
	f1.setDestination(destination);
	System.out.println("enter a class:"+"\n(firstclass/businessclass/economieeclass)");
	String clas=sc.next();
	f1.setClas(clas);
	System.out.println("enter a ticket rate:");
	int ticketrate=sc.nextInt();
	f1.setTicketrate(ticketrate);
	
	System.out.println(f1.getId()+" "+f1.getCompany()+" "+f1.getSource()+" "+f1.getDestination()+" "+f1.getClas()+" "+f1.getTicketrate());
    f1.display();
}
}
