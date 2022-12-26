package WrittenTest7;

import java.util.Scanner;

public class LaptopMain {
public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter values for noOfUSBPort:");
	int noup=sc.nextInt();
	System.out.println("enter value for processorSpeed:");
	int processorSpeed=sc.nextInt();
    Laptop lt=new Laptop();
    lt.setNoOfUSBPort(noup);
    lt.setProcessorSpeed(processorSpeed);
    System.out.println("values for noOfUSBPort is:"+lt.getNoOfUSBPort()
    +"\nvalues for ProcessorSpeed is:"+lt.getProcessorSpeed());
}
}